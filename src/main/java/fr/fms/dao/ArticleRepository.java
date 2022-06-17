package fr.fms.dao;

import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entities.Article;

public interface ArticleRepository extends JpaRepository<Article,Long>{

	Page<Article>findByDescriptionContains(String descrption, Pageable pageable);
	public Optional<Article>  findById(Long id);
	public Optional<Article>  findByDescription(String description);
	public void deleteById(Long id);
	public default void updateById(Long id) {
		
	}	
}
