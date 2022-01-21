package br.com.coodesh.spaceflightnews.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AppController {

  @ApiOperation(httpMethod = "GET", value = "Consulta mensagem do desafio.")
  @GetMapping
  public String getApp() {
    return "Back-end Challenge 2021 \uD83C\uDFC5 - Space Flight News";
  }
}
