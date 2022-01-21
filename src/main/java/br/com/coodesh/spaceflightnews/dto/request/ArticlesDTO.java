package br.com.coodesh.spaceflightnews.dto.request;

import br.com.coodesh.spaceflightnews.entity.Events;
import br.com.coodesh.spaceflightnews.entity.Launches;
import java.time.LocalDate;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticlesDTO {
  private Long id;

  @NotEmpty private Boolean featured;

  @NotEmpty private String title;

  @NotEmpty private String url;

  @NotEmpty private String imageUrl;

  @NotEmpty private String newsSite;

  @NotEmpty private String summary;

  @NotEmpty private LocalDate publishedAt;

  @Valid @NotEmpty private List<Launches> launches;

  @Valid @NotEmpty private List<Events> events;
}
