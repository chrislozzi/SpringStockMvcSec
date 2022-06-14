package fr.fms.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entities.Article;

public interface ArticleRepository extends JpaRepository<Article,Long>{

	
	public Optional<Article>  findById(Long id);
	public Optional<Article>  findByDescription(String description);
	public void deleteById(Long id);
	public default void updateById(Long id) {
		
	}	
}
