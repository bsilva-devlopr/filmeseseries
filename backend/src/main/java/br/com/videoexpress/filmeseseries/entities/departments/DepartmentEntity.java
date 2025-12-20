package br.com.videoexpress.filmeseseries.entities.departments;

import br.com.videoexpress.filmeseseries.entities.employees.EmployeeEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_department")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;

    @OneToMany(mappedBy = "departmentEntity")
    public List<EmployeeEntity> employees = new ArrayList<>();

    public DepartmentEntity() {
    }

    public DepartmentEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmployeeEntity> getEmployees() {
        return employees;
    }
}
