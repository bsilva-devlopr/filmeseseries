package br.com.videoexpress.filmeseseries.controllers.categories;

import br.com.videoexpress.filmeseseries.entities.categories.CategoryEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @GetMapping
    public ResponseEntity<List<CategoryEntity>> findAll() {
        List<CategoryEntity> list = new ArrayList<>();
        list.add(new CategoryEntity(1L, "Filmes"));
        list.add(new CategoryEntity(2L, "Séries"));
        return ResponseEntity.ok(list);
    }
}
