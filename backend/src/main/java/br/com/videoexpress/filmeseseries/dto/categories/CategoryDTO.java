package br.com.videoexpress.filmeseseries.dto.categories;

import br.com.videoexpress.filmeseseries.entities.categories.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public CategoryDTO(CategoryEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
