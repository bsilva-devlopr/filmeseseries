package br.com.videoexpress.filmeseseries.services.employees;

import br.com.videoexpress.filmeseseries.dto.employees.EmployeeDTO;
import br.com.videoexpress.filmeseseries.entities.departments.DepartmentEntity;
import br.com.videoexpress.filmeseseries.entities.employees.EmployeeEntity;
import br.com.videoexpress.filmeseseries.repositories.employees.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public Page<EmployeeDTO> findAll(Pageable pageable) {
        Page<EmployeeEntity> page = employeeRepository.findAll(pageable);
        return page.map(EmployeeDTO::new);
    }

    @Transactional
    public EmployeeDTO insert(EmployeeDTO dto) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(dto.getName());
        employeeEntity.setEmail(dto.getEmail());
        employeeEntity.setDepartment(new DepartmentEntity(dto.getDepartmentId(), null));
        employeeEntity = employeeRepository.save(employeeEntity);
        return new EmployeeDTO(employeeEntity);

    }
}
