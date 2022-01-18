package br.com.coodesh.spaceflightnews.controller;

import br.com.coodesh.spaceflightnews.dto.request.ArticlesDTO;
import br.com.coodesh.spaceflightnews.dto.response.MessageResponseDTO;
import br.com.coodesh.spaceflightnews.entity.Articles;
import br.com.coodesh.spaceflightnews.service.ArticlesService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ArticlesController {
  private ArticlesService articlesService;

  @ApiOperation(httpMethod = "POST", value = "Cria registro de artigo.", response = ArticlesDTO.class)
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


//  @PostMapping
//  public ResponseEntity<CrivosPreAnaliseDTO> criar(@Valid @RequestBody CrivosPreAnaliseCriacaoForm form, HttpServletRequest request) {
//    UsuarioTriagilDTO usuario = (UsuarioTriagilDTO) request.getAttribute(Autenticator.USER_AUTENTICATE);
//
//    return ResponseEntity.status(HttpStatus.CREATED).body(this.mapper.toDTO(this.service.criar(usuario, form)));
//  }

//  @ApiOperation(
//        httpMethod = "POST",
//        value = "Cria registro de crivo da pre analise.",
//        response = StatusAnaliseAntifraudeDTO.class)
//    @PostMapping
//    public ResponseEntity<CrivosPreAnaliseDTO> criar(
//        @Valid @RequestBody CrivosPreAnaliseCriacaoForm form, HttpServletRequest request) {
//      UsuarioTriagilDTO usuario =
//          (UsuarioTriagilDTO) request.getAttribute(Autenticator.USER_AUTENTICATE);
//
//      return ResponseEntity.status(HttpStatus.CREATED)
//          .body(this.mapper.toDTO(this.service.criar(usuario, form)));
//    }
  //
  //  @ApiOperation(httpMethod = "DELETE", value = "Exclui um registro de crivo da pre analise.")
  //  @DeleteMapping("{uuid}")
  //  public ResponseEntity<Void> excluir(@PathVariable UUID uuid) {
  //    this.service.deletar(null, uuid);
  //    return ResponseEntity.status(HttpStatus.OK).build();
  //  }
  //
  //  @ApiOperation(
  //      httpMethod = "PUT",
  //      value = "Atualiza registro de crivo da pre analise.",
  //      response = LayoutImportacaoDTO.class)
  //  @PutMapping("{uuid}")
  //  public ResponseEntity<CrivosPreAnaliseDTO> atualizar(
  //      @NotNull(message = "UUID não pode ser nulo.") @PathVariable UUID uuid,
  //      @RequestBody CrivosPreAnaliseAtualizacaoForm form,
  //      HttpServletRequest request) {
  //    UsuarioTriagilDTO usuario =
  //        (UsuarioTriagilDTO) request.getAttribute(Autenticator.USER_AUTENTICATE);
  //
  //    return ResponseEntity.status(HttpStatus.OK)
  //        .body(this.mapper.toDTO(this.service.atualizar(usuario, form, uuid)));
  //  }
  //
  //  @ApiOperation(
  //      httpMethod = "GET",
  //      value = "Consulta lista de crivos de pre analise.",
  //      response = CrivosPreAnaliseDTO[].class)
  //  @GetMapping
  //  public ResponseEntity<List<CrivosPreAnaliseDTO>> consultar(
  //      CrivosPreAnaliseFilter filter, HttpServletRequest request) {
  //    UsuarioTriagilDTO usuario =
  //        (UsuarioTriagilDTO) request.getAttribute(Autenticator.USER_AUTENTICATE);
  //
  //    return ResponseEntity.status(HttpStatus.OK)
  //        .body(this.mapper.toDTO(this.service.consultar(usuario, filter)));
  //  }
  //    @GetMapping("/{id}")
  //    public ArticlesDTO findById(@PathVariable Long id) throws PersonNotFoundException {
  //        return articlesService.findById(id);
  //    }
}
