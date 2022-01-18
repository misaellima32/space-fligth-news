package br.com.coodesh.spaceflightnews.service;

import br.com.coodesh.spaceflightnews.dto.request.ArticlesDTO;
import br.com.coodesh.spaceflightnews.dto.response.MessageResponseDTO;
import br.com.coodesh.spaceflightnews.entity.Articles;
import br.com.coodesh.spaceflightnews.mapper.ArticlesMapper;
import br.com.coodesh.spaceflightnews.repository.ArticlesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ArticlesService {

  private ArticlesRepository articlesRepository;

  private final ArticlesMapper articlesMapper = ArticlesMapper.INSTANCE;

  public Articles createArticles(ArticlesDTO articlesDTO) {
    Articles articlesToSave = articlesMapper.toModel(articlesDTO);

    Articles savedArticles = articlesRepository.save(articlesToSave);
    return savedArticles;
  }

  public List<ArticlesDTO> listAll() {
    List<Articles> allPeople = articlesRepository.findAll();
    return allPeople.stream().map(articlesMapper::toDTO).collect(Collectors.toList());
  }

  private MessageResponseDTO createMessageResponse(Integer id, String message) {
    return MessageResponseDTO.builder().message(message + id).build();
  }
}
