/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureGoolgleCloud.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kevin
 */
@RestController
@RequestMapping("/ApiVer")
public class ApiVersion {
    @GetMapping("apiversion")
    public String apiVersion() {
        
        return "API is Version V2";
    }
    
}
