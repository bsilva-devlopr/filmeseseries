package br.com.videoexpress.filmeseseries.entities.categories;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_category")
@Getter
@Setter
public class CategoryEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    @Setter(AccessLevel.NONE)
    private Instant createdAt;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    @Setter(AccessLevel.NONE)
    private Instant updatedAt;

    public CategoryEntity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Quando criar pela primeira vez, será inserido a data
    @PrePersist
    public void prePersist() {
        createdAt = Instant.now();
    }

    // Quando for atualizar e clicar em save, a data será atualizada
    @PreUpdate
    public void preUpdate() {
        updatedAt = Instant.now();
    }
}
