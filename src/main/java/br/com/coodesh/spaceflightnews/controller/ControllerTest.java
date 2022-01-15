package br.com.coodesh.spaceflightnews.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ControllerTest {

  //  @ApiOperation(
  //      httpMethod = "POST",
  //      value = "Cria registro de crivo da pre analise.",
  //      response = StatusAnaliseAntifraudeDTO.class)
  //  @PostMapping
  //  public ResponseEntity<CrivosPreAnaliseDTO> criar(
  //      @Valid @RequestBody CrivosPreAnaliseCriacaoForm form, HttpServletRequest request) {
  //    UsuarioTriagilDTO usuario =
  //        (UsuarioTriagilDTO) request.getAttribute(Autenticator.USER_AUTENTICATE);
  //
  //    return ResponseEntity.status(HttpStatus.CREATED)
  //        .body(this.mapper.toDTO(this.service.criar(usuario, form)));
  //  }
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
}
