package crud.crudspring.service;

import crud.crudspring.domain.Article;
import crud.crudspring.repository.ArticleRepository;
import crud.crudspring.repository.JpaArticleRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

//@Transactional
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    // 글 생설
    public Long create(Article article) {
        articleRepository.save(article);
        return article.getId();
    }

    // 조회 (전체 글)
    public List<Article> findArticles() {
        return articleRepository.findAll();
    }

    // ( - )
    public Optional<Article> findOne(Long articleId) {
        return articleRepository.findById(articleId);
    }
}
