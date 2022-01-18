package br.com.coodesh.spaceflightnews.mapper;

import br.com.coodesh.spaceflightnews.dto.request.ArticlesDTO;
import br.com.coodesh.spaceflightnews.entity.Articles;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ArticlesMapper {
  ArticlesMapper INSTANCE = Mappers.getMapper(ArticlesMapper.class);

  Articles toModel(ArticlesDTO articlesDTO);

  ArticlesDTO toDTO(Articles person);
}
