package br.com.coodesh.spaceflightnews.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "launches")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Launches {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(nullable = false)
  private String provider;
}
