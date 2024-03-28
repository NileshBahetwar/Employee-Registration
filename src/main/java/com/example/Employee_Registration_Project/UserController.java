package com.example.Employee_Registration_Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register/employee")
    public String employeeRegistration(@RequestBody Employee employee){
          userService.employeeRegistration(employee);
          return "employee register successfully!!!";
    }

    @GetMapping("/login")
    public EmployeeResponseDto login(@RequestParam String loginId,@RequestParam String password) throws InvalidLoginIdException, WrongPasswordException {
        return userService.login(loginId,password);
    }

    @GetMapping("/welcome/page")
    public String welcomePage(@RequestParam String loginId,@RequestParam String password) throws InvalidLoginIdException, WrongPasswordException {
        EmployeeResponseDto employee = userService.login(loginId,password);
        return "welcome to your new career journey with us "+employee.getName();
    }
}
