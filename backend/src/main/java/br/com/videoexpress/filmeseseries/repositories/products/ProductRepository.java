package br.com.videoexpress.filmeseseries.repositories.products;

import br.com.videoexpress.filmeseseries.entities.products.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
