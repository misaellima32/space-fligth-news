package br.com.coodesh.spaceflightnews.controller;

import br.com.coodesh.spaceflightnews.dto.request.ArticlesDTO;
import br.com.coodesh.spaceflightnews.dto.response.MessageResponseDTO;
import br.com.coodesh.spaceflightnews.entity.Articles;
import br.com.coodesh.spaceflightnews.exception.ArticleNotFoundException;
import br.com.coodesh.spaceflightnews.service.ArticlesService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/api/v1/articles")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ArticlesController {
  private ArticlesService articlesService;

  @ApiOperation(
      httpMethod = "POST",
      value = "Cria registro de artigo.",
      response = ArticlesDTO.class)
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Articles createArticles(@RequestBody ArticlesDTO articlesDTO) {
    return articlesService.createArticles(articlesDTO);
  }

  @ApiOperation(
      httpMethod = "GET",
      value = "Consulta lista de artigos.",
      response = ArticlesDTO[].class)
  @GetMapping
  public List<ArticlesDTO> listAll() {
    return articlesService.listAll();
  }

  @ApiOperation(
      httpMethod = "GET",
      value = "Consulta um de artigo pelo id.",
      response = ArticlesDTO.class)
  @GetMapping("/{id}")
  public ArticlesDTO findById(@PathVariable Long id) throws ArticleNotFoundException {
    return articlesService.findById(id);
  }

  @ApiOperation(
      httpMethod = "PUT",
      value = "Atualiza um artigo pelo id.",
      response = MessageResponseDTO.class)
  @PutMapping("/{id}")
  public ArticlesDTO updateById(@PathVariable Long id, @RequestBody @Valid ArticlesDTO articlesDTO)
      throws ArticleNotFoundException {
    return articlesService.updateById(id, articlesDTO);
  }

  @ApiOperation(httpMethod = "DELETE", value = "Exclui um registro de artigo.")
  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteById(@PathVariable Long id) throws ArticleNotFoundException {
    articlesService.delete(id);
  }
}
