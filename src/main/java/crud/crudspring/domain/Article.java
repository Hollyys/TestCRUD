package crud.crudspring.domain;

import javax.persistence.*;
@Entity
@Table (name = "Article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    //@Column(writer = "username")
    private String writer;

    public Article() { }
    public Article(Long id, String title, String content, String writer) { this.id = id;
        this.title = title; this.content = content; this.writer = writer;
    }
    public Long getId() { return id;
    }
    public void setId(Long id) { this.id = id;
    }
    public String getTitle() { return title;
    }
    public void setTitle(String title) { this.title = title;
    }
    public String getContent() { return content;
    }
    public void setContent(String content) { this.content = content;
    }
    public String getWriter() { return writer;
    }
    public void setWriter(String writer) { this.writer = writer;
    }
}
