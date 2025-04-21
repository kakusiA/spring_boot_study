package com.jast.javastudy.repository;

import com.jast.javastudy.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
