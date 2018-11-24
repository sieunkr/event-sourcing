package com.example.demo.endpoint;

import com.example.demo.core.usecase.ArticleUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleUseCase articleUseCase;

    public ArticleController(ArticleUseCase articleUseCase) {
        this.articleUseCase = articleUseCase;
    }

    @PostMapping
    public ResponseEntity createArticle(){

        articleUseCase.createArticle();
        return null;
    }


}
