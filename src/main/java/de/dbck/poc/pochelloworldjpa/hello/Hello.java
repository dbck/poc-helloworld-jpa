package de.dbck.poc.pochelloworldjpa.hello;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Hello implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Column(nullable = false)
  private UUID id = UUID.randomUUID();
  private LocalDateTime createdAt = LocalDateTime.now();
  private String message;
}
