package br.com.videoexpress.filmeseseries.repositories.employees;

import br.com.videoexpress.filmeseseries.entities.employees.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
