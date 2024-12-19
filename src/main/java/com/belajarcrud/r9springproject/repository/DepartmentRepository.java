package com.belajarcrud.r9springproject.repository;

import com.belajarcrud.r9springproject.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface DepartmentRepository extends CrudRepository<Department, Long> {

    }
