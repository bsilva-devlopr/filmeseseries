package br.com.videoexpress.filmeseseries.tests;

import br.com.videoexpress.filmeseseries.dto.products.ProductDTO;
import br.com.videoexpress.filmeseseries.entities.categories.CategoryEntity;
import br.com.videoexpress.filmeseseries.entities.products.ProductEntity;

import java.time.Instant;

public class Factory {

    public static ProductEntity createProduct() {
        ProductEntity product = new ProductEntity(1L, "American Pie", "Filme de comédia", 29.9, "https://m.media-amazon.com/images/M/MV5BMTg3ODY5ODI1NF5BMl5BanBnXkFtZTgwMTkxNTYxMTE@._V1_FMjpg_UX1000_.jpg", Instant.parse("1999-10-20T03:00:00Z"));
        product.getCategories().add(new CategoryEntity(2L, "Adulto"));
        return product;
    }

    public static ProductDTO createProductDTO() {
        ProductEntity product = createProduct();
        return new ProductDTO(product, product.getCategories());
    }
}
