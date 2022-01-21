package br.com.coodesh.spaceflightnews.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ArticleNotFoundException extends Exception {
  public ArticleNotFoundException(Long id) {
    super("Artigo não encontrado com o ID " + id);
  }
}
