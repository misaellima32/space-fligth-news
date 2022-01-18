package br.com.coodesh.spaceflightnews.entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "articles")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Articles {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(nullable = false)
  private Boolean featured;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private String url;

  @Column(nullable = false)
  private String imageUrl;

  @Column(nullable = false)
  private String newsSite;

  @Column(nullable = false)
  private String summary;

  @Column(nullable = false)
  private LocalDate publishedAt;

  @OneToMany(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
  private List<Launches> launches;

  @OneToMany(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
  private List<Events> events;
}
