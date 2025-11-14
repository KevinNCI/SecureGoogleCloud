/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureGoolgleCloud.Controller;

import SecureGoogleCloud.Model.Employee;
import SecureGoogleCloud.Model.Start;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;
/**
 *
 * @author Kevin
 */
@RestController
@RequestMapping("/start")
public class StartController {
    
    @Value("${APP_MOD:#{null}}#")
    private String APP_MODE;
    @Value("${listofValues:#{null}}")
    private String[] valueArray;
    @Value("#{${valuesMap:{}}}")
    private Map<String, Integer> valuesMap;
    
    @GetMapping("/")
    public ResponseEntity<Start> getStart(String[] valuesArray) {
        Start start = new Start();
        start.setAppMode(APP_MODE);
        start.setValuesMap(valuesMap);
        start.setValuesArray(valuesArray);
        System.out.println(start);
        return new ResponseEntity<>(start, HttpStatus.OK);
        
        
        
    }
    
    
    
    
    
}
