package io.reflectoring.reviewapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

  @Id
  private Long id;
  private String title;
  private Long authorId;

  // imagine some insanely complex business logic methods ...

}
