/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureGoogleCloud.repository;

import SecureGoogleCloud.Model.Employee;
import java.util.List;
import java.util.Optional;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kevin
 */
@Repository
@Primary
public interface EmployeeRepository extends JpaRespository<Employee, Long> {

    public List<Employee> findAll();

    public Optional<Employee> findById(Long id);

    public void save(Employee employee);

    public void delete(Employee get);
    
}
    

