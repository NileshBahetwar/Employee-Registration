package com.example.Employee_Registration_Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Employee,Integer> {
    Employee findByLoginId(String loginId);
}
