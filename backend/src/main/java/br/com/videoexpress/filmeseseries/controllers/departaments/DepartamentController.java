package br.com.videoexpress.filmeseseries.controllers.departaments;

import br.com.videoexpress.filmeseseries.dto.departments.DepartmentDTO;
import br.com.videoexpress.filmeseseries.services.departments.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartamentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> findAll() {
        List<DepartmentDTO> list = departmentService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
