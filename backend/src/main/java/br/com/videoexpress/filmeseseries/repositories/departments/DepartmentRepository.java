package br.com.videoexpress.filmeseseries.repositories.departments;

import br.com.videoexpress.filmeseseries.entities.departments.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
