package br.com.coodesh.spaceflightnews.service;

import br.com.coodesh.spaceflightnews.dto.request.ArticlesDTO;
import br.com.coodesh.spaceflightnews.dto.response.MessageResponseDTO;
import br.com.coodesh.spaceflightnews.entity.Articles;
import br.com.coodesh.spaceflightnews.exception.ArticleNotFoundException;
import br.com.coodesh.spaceflightnews.mapper.ArticlesMapper;
import br.com.coodesh.spaceflightnews.repository.ArticlesRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

  public ArticlesDTO findById(Long id) throws ArticleNotFoundException {
    Articles articles = verifyIfExists(id);

    return articlesMapper.toDTO(articles);
  }

  public ArticlesDTO updateById(Long id, ArticlesDTO articlesDTO) throws ArticleNotFoundException {
    articlesRepository.findById(id).orElseThrow(() -> new ArticleNotFoundException(id));

    Articles updatedArticle = articlesMapper.toModel(articlesDTO);
    Articles savedArticle = articlesRepository.save(updatedArticle);

    return this.findById(savedArticle.getId());
  }

  public void delete(Long id) throws ArticleNotFoundException {
    articlesRepository.findById(id).orElseThrow(() -> new ArticleNotFoundException(id));

    articlesRepository.deleteById(id);
  }

  private Articles verifyIfExists(Long id) throws ArticleNotFoundException {
    return articlesRepository.findById(id).orElseThrow(() -> new ArticleNotFoundException(id));
  }

  private MessageResponseDTO createMessageResponse(Long id, String message) {
    return MessageResponseDTO.builder().message(message + id).build();
  }
}
