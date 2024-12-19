package com.belajarcrud.r9springproject.service;

import com.belajarcrud.r9springproject.entity.Department;

import java.util.List;

public interface DepartmentService {

    //Save the operation
    Department saveDepartment(Department department);

    //To read the operation
    List<Department> fetchDepartmentList();

    //Update the operation
    Department updateDepartment(Department department, Long departmentId);

    //To delete the operation
    void deleteDepartmentById(Long departmentId);

}
