package br.com.videoexpress.filmeseseries.services;

import br.com.videoexpress.filmeseseries.dto.products.ProductDTO;
import br.com.videoexpress.filmeseseries.exceptions.NotFoundException;
import br.com.videoexpress.filmeseseries.repositories.products.ProductRepository;
import br.com.videoexpress.filmeseseries.services.products.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class ProductServiceIT {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    private Long existingId;
    private Long nonExistingId;
    private Long countTotalProducts;

    @BeforeEach
    void setUp() throws Exception {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalProducts = 30L;
    }

    @Test
    public void deleteShouldDeleteResourceWhenIdExists() {
        productService.delete(existingId);

        Assertions.assertEquals(countTotalProducts - 1, productRepository.count());
    }

    @Test
    public void deleteShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        Assertions.assertThrows(NotFoundException.class, () -> {
            productService.delete(nonExistingId);
        });
    }

    @Test
    public void findAllPagedShouldReturnPageWhenPage0Size10() {

        PageRequest pageRequest = PageRequest.of(0, 10);
        Page<ProductDTO> result = productService.findAllPaged(pageRequest);

        Assertions.assertFalse(result.isEmpty());
        Assertions.assertEquals(0, result.getNumber());
        Assertions.assertEquals(10, result.getSize());
        Assertions.assertEquals(countTotalProducts, result.getTotalElements());
    }

    @Test
    public void findAllPagedShouldReturnEmptyPageWhenPageDoesNotExist() {

        PageRequest pageRequest = PageRequest.of(50, 10);
        Page<ProductDTO> result = productService.findAllPaged(pageRequest);

        Assertions.assertTrue(result.isEmpty());

    }

    @Test
    public void findAllPagedShouldReturnSortedPageWhenSortByName() {

        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by("name"));
        Page<ProductDTO> result = productService.findAllPaged(pageRequest);

        Assertions.assertFalse(result.isEmpty());
        Assertions.assertEquals("Adolescence", result.getContent().get(0).getName());
        Assertions.assertEquals("Amar Singh Chamkila", result.getContent().get(1).getName());
        Assertions.assertEquals("Anyone But You", result.getContent().get(2).getName());

    }

}
