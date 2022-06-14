package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.entities.Article;

@SpringBootApplication
public class SpringStockMvcSecApplication implements CommandLineRunner{
	
	@Autowired 
	private ArticleRepository articleRepository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringStockMvcSecApplication.class, args);
		
		 
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * articleRepository.save(new Article(null,"Samsung S8",250));
		 * articleRepository.save(new Article(null,"Samsung S9",250));
		 * articleRepository.save(new Article(null,"Samsung GalaxyTab",350));
		 * articleRepository.save(new Article(null,"Samsung S10",500));
		 * articleRepository.save(new Article(null,"Xiaomi MI10",100));
		 * articleRepository.save(new Article(null,"Apple Ipad",350));
		 * articleRepository.save(new Article(null,"Asus R510",600));
		 * articleRepository.findAll().forEach(a->System.out.println(a));
		 */
	}

}
