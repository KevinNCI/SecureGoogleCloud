/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureGoolgleCloud.Controller;

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sql")
/**
 *
 * @author Kevin
 */
public class CloudSQL {
    
    Logger logger = LoggerFactory.getLogger(CloudSQL.class);
    
    @Autowired 
    CloudSQL cloudSQL; 
    
    @GetMapping("/check")
    public String sqlCheck() {
        
        logger.info("sqlCheck : started"); 
        cloudSQL.checkConn();
        logger.info("sqlCheck : ended");
        return HttpStatus.OK.toString();
        
    }

    private void checkConn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
