package com.jast.javastudy.controller;

import com.jast.javastudy.dto.ArticleForm;
import com.jast.javastudy.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.jast.javastudy.repository.ArticleRepository;
import org.springframework.web.bind.annotation.PostMapping;

@Controller()
public class ArticleController {
    private  ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/articles/new")
    public String newArticle(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        Article article = form.toEntitiy();
        System.out.println(article.toString());
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
