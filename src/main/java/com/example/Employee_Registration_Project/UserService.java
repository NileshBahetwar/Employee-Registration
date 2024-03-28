package com.example.Employee_Registration_Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void employeeRegistration(Employee employee){
        userRepository.save(employee);
    }

    public EmployeeResponseDto login(String loginId,String password) throws InvalidLoginIdException, WrongPasswordException {
        Employee employee = userRepository.findByLoginId(loginId);
        if(employee==null){
            throw new InvalidLoginIdException("entered login id is incorrect");
        }
        if(employee.getPassword().equals(password)==false){
            throw new WrongPasswordException("entered password is wrong");
        }
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setName(employee.getName());
        employeeResponseDto.setCity(employee.getCity());
        employeeResponseDto.setAddress(employee.getAddress());

        return employeeResponseDto;
    }
}
