package fr.fms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.fms.dao.ArticleRepository;
import fr.fms.entities.Article;

@Controller
public class ArticleController {
	@Autowired
	ArticleRepository articleRepository;
	
	//@RequestMapping(value="/index" , method=RequestMethod.GET)
	@GetMapping("/index")
	public String index(Model model, @RequestParam(name="page", defaultValue = "0")int page) {//le model est fourni par spring je peux l'utiliser comme ci
		Page<Article>articles = articleRepository.findAll(PageRequest.of(page, 5));
		model.addAttribute("listArticle",articles.getContent());
		
		model.addAttribute("pages", new int[articles.getTotalPages()]);
		
		model.addAttribute("currentPage",page);
		
		return "articles";//cette méthode retourne au dispacterServelet une vue
		
		}

}
