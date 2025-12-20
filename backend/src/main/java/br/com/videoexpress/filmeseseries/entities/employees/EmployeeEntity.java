package br.com.videoexpress.filmeseseries.entities.employees;

import br.com.videoexpress.filmeseseries.entities.departments.DepartmentEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    public DepartmentEntity departmentEntity;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Long id, String name, String email, DepartmentEntity departmentEntity) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.departmentEntity = departmentEntity;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DepartmentEntity getDepartment() {
        return departmentEntity;
    }

    public void setDepartment(DepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
    }
}
