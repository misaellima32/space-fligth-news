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
  private Long id;

  @Column() private Boolean featured;

  @Column() private String title;

  @Column() private String url;

  @Column() private String imageUrl;

  @Column() private String newsSite;

  @Column() private String summary;

  @Column() private LocalDate publishedAt;

  @OneToMany(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
  private List<Launches> launches;

  @OneToMany(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
  private List<Events> events;
}
