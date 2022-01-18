package br.com.coodesh.spaceflightnews.repository;

import br.com.coodesh.spaceflightnews.entity.Articles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticlesRepository extends JpaRepository<Articles, Long> {}
