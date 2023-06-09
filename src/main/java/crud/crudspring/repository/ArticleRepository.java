package crud.crudspring.repository;

import crud.crudspring.domain.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository {
    Article save(Article article);

    Optional<Article> findById(Long id);
    Optional<Article> findByTitle(String title);
    Optional<Article> findByContent(String content);
    Optional<Article> findByWriter(String writer);
    List<Article> findAll();
}
