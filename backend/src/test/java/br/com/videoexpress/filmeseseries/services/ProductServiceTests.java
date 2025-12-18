package br.com.videoexpress.filmeseseries.services;

import br.com.videoexpress.filmeseseries.dto.products.ProductDTO;
import br.com.videoexpress.filmeseseries.entities.products.ProductEntity;
import br.com.videoexpress.filmeseseries.exceptions.DatabaseException;
import br.com.videoexpress.filmeseseries.exceptions.NotFoundException;
import br.com.videoexpress.filmeseseries.repositories.categories.CategoryRepository;
import br.com.videoexpress.filmeseseries.repositories.products.ProductRepository;
import br.com.videoexpress.filmeseseries.services.products.ProductService;
import br.com.videoexpress.filmeseseries.tests.Factory;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceTests {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Mock
    private CategoryRepository categoryRepository;

    private long existingId;
    private long nonExistingId;
    private long dependentId;
    private PageImpl<ProductEntity> page;
    private ProductEntity productEntity;

    @BeforeEach
    void setup() {
        existingId = 1L;
        nonExistingId = 1000L;
        dependentId = 4L;

        productEntity = Factory.createProduct();
        page = new PageImpl<>(List.of(productEntity));
    }

    @Test
    public void findAllPagedShouldReturnPage() {
        Pageable pageable = PageRequest.of(0, 10);

        when(productRepository.findAll(pageable))
                .thenReturn(page);

        Page<ProductDTO> result = productService.findAllPaged(pageable);

        Assertions.assertNotNull(result);
        verify(productRepository).findAll(pageable);
    }

    @Test
    void findByIdShouldReturnProductDTOWhenIdExists() {
        when(productRepository.findById(existingId))
                .thenReturn(Optional.of(productEntity));

        ProductDTO result = productService.findById(existingId);

        Assertions.assertNotNull(result);
        verify(productRepository).findById(existingId);
    }


    @Test
    void deleteShouldThrowDatabaseExceptionWhenDependentId() {
        when(productRepository.existsById(dependentId))
                .thenReturn(true);

        doThrow(DataIntegrityViolationException.class)
                .when(productRepository)
                .deleteById(dependentId);

        assertThrows(DatabaseException.class,
                () -> productService.delete(dependentId));

        verify(productRepository).deleteById(dependentId);
    }

    @Test
    void deleteShouldDoNothingWhenIdExists() {
        when(productRepository.existsById(existingId))
                .thenReturn(true);

        assertDoesNotThrow(() -> productService.delete(existingId));

        verify(productRepository).deleteById(existingId);
    }

    @Test
    void deleteShouldThrowNotFoundExceptionWhenIdDoesNotExist() {
        when(productRepository.existsById(nonExistingId))
                .thenReturn(false);

        assertThrows(NotFoundException.class,
                () -> productService.delete(nonExistingId));

        verify(productRepository, never())
                .deleteById(nonExistingId);
    }

    @Test
    void findByIdShouldThrowNotFoundExceptionWhenIdDoesNotExist() {
        when(productRepository.findById(nonExistingId))
                .thenReturn(Optional.empty());

        Assertions.assertThrows(NotFoundException.class,
                () -> productService.findById(nonExistingId));

        verify(productRepository).findById(nonExistingId);
    }

    @Test
    void updateShouldReturnProductDTOWhenIdExists() {
        ProductDTO dto = new ProductDTO(productEntity);

        when(productRepository.getReferenceById(existingId))
                .thenReturn(productEntity);

        when(productRepository.save(any(ProductEntity.class)))
                .thenReturn(productEntity);

        ProductDTO result = productService.update(existingId, dto);

        Assertions.assertNotNull(result);
        verify(productRepository).getReferenceById(existingId);
        verify(productRepository).save(any(ProductEntity.class));
    }

    @Test
    void updateShouldThrowNotFoundExceptionWhenIdDoesNotExist() {
        ProductDTO dto = new ProductDTO(productEntity);

        when(productRepository.getReferenceById(nonExistingId))
                .thenThrow(EntityNotFoundException.class);

        Assertions.assertThrows(NotFoundException.class,
                () -> productService.update(nonExistingId, dto));

        verify(productRepository).getReferenceById(nonExistingId);
        verify(productRepository, never()).save(any());
    }

}
