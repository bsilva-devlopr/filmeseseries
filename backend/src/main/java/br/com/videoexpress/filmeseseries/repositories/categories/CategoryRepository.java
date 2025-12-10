package br.com.videoexpress.filmeseseries.repositories.categories;

import br.com.videoexpress.filmeseseries.entities.categories.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

}
