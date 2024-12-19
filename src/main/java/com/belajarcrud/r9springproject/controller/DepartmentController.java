package com.belajarcrud.r9springproject.controller;


import com.belajarcrud.r9springproject.entity.Department;
import com.belajarcrud.r9springproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    @Autowired private DepartmentService departmentService;

    //Save operation
    @PostMapping ("/departments")

    public Department saveDepartment(@Validated @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
    //read operation
    @GetMapping("/departments")

    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }
    //update operation
    @PutMapping("/departments/{id}")

    public Department updateDepartment(@RequestBody Department department, @PathVariable ("id") Long departmentId) {

        return departmentService.updateDepartment(department, departmentId);

    }
    //delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable ("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }


}
