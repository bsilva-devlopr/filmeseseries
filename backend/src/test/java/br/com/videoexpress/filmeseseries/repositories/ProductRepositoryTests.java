package br.com.videoexpress.filmeseseries.repositories;

import br.com.videoexpress.filmeseseries.entities.products.ProductEntity;
import br.com.videoexpress.filmeseseries.repositories.products.ProductRepository;
import br.com.videoexpress.filmeseseries.tests.Factory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import java.util.Optional;

@DataJpaTest
class ProductRepositoryTests {

    @Autowired
    private ProductRepository productRepository;

    private long exintingId;
    private long nonExistingId;
    private long countTotalProducts;

    @BeforeEach
    void setUp() throws Exception {
        exintingId = 1L;
        nonExistingId = 1000L;
        countTotalProducts = 30L;
    }

    @Test
    public void saveShouldPersistWithAutoincrementWhenIdIsNull() {
        ProductEntity product = Factory.createProduct();
        product.setId(null);

        product = productRepository.save(product);
        Assertions.assertNotNull(product.getId());
        Assertions.assertEquals(countTotalProducts + 1, product.getId());
    }

    @Test
    void deleteShouldDeleteObjectWhenIdExists() {

        productRepository.deleteById(exintingId);

        Optional<ProductEntity> result = productRepository.findById(exintingId);
        Assertions.assertFalse(result.isPresent());
    }
}
