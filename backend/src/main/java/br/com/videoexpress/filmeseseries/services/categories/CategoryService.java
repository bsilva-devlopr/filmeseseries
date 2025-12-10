package br.com.videoexpress.filmeseseries.services.categories;

import br.com.videoexpress.filmeseseries.entities.categories.CategoryEntity;
import br.com.videoexpress.filmeseseries.repositories.categories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryEntity> findAll() {
        return categoryRepository.findAll();
    }
}
