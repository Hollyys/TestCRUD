package crud.crudspring.service;

import crud.crudspring.domain.Article;
import crud.crudspring.repository.ArticleRepository;
//import crud.crudspring.repository.JpaArticleRepository;

@Transactional
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
