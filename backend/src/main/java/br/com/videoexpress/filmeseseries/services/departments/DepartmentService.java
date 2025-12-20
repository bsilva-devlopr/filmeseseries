package br.com.videoexpress.filmeseseries.services.departments;

import br.com.videoexpress.filmeseseries.dto.departments.DepartmentDTO;
import br.com.videoexpress.filmeseseries.entities.departments.DepartmentEntity;
import br.com.videoexpress.filmeseseries.repositories.departments.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<DepartmentDTO> findAll() {
        List<DepartmentEntity> list = departmentRepository.findAll(Sort.by("name"));
        return list.stream().map(DepartmentDTO::new).collect(Collectors.toList());
    }
}
