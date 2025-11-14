/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureGoogleCloud.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 *
 * @author Kevin
 */

@Entity 
@Table(name = "EMPLOYEE" )
public class Employee {
    @Id 
    
    private Long id;
    private String name; 
    private double salary; 
    
    public Long getId() { 
        return id;
    }
    
    public void setId(long id) {
        this.id = id; 
    }
    
    public String getName() { 
        return name; 
    }
    
    public void setName(String name) {
        this.name = name;
        
    }
    
    public double getSalary() { 
        
        return salary; 
    }
    
    public void setSalary (double salary) { 
        this.salary = salary; 
    }
}
