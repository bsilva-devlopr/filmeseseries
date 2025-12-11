package br.com.videoexpress.filmeseseries.services.categories;

import br.com.videoexpress.filmeseseries.dto.categories.CategoryDTO;
import br.com.videoexpress.filmeseseries.entities.categories.CategoryEntity;
import br.com.videoexpress.filmeseseries.exceptions.NotFoundException;
import br.com.videoexpress.filmeseseries.repositories.categories.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<CategoryEntity> list = categoryRepository.findAll();

//        // Exemplo para percorrer uma lista de DTO
//        List<CategoryDTO> listDTO = new ArrayList<>();
//        for (CategoryEntity cat : list) {
//            listDTO.add(new CategoryDTO(cat));
//        }
//
//        return listDTO;

        // Utilizando com expressão lambda
//        return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
        return list.stream().map(CategoryDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id) {
        Optional<CategoryEntity> obj = categoryRepository.findById(id);
        CategoryEntity entity = obj.orElseThrow(() -> new NotFoundException("Category not found"));
        return new CategoryDTO(entity);
    }
}
