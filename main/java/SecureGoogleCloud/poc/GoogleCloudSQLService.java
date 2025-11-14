/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureGoogleCloud.poc;

import SecureGoolgleCloud.Controller.DataController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/**
 *
 * @author Kevin
 */
@Service
public class GoogleCloudSQLService {
    
    Logger logger = LoggerFactory.getLogger(DataController.class);
    public static void main2(String[] args) {
        
        Properties connectionProperties = new Properties(); 
        connectionProperties.put("user", "root");
        connectionProperties.put("password", "root123");
        connectionProperties.put("sockectFactory", "com.google.cloud.sql.mysql.SocketFactory");    connectionProperties.put("cloudSqlInstance", "my-project-001-386612:us-central:test-mysql2");
        connectionProperties.put("cloudSqlInstance", "my-project-001-386612:us-central1:test-mysql2");
        
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///test.db", connectionProperties)) {
          
        }catch (SQLException e) { 
            e.printStackTrace();
        
        }
        
    }
    
    
public String checkConn() {
    
    logger.info ("checkConn:started"); 
    Properties connectionProperties;
        connectionProperties = new Properties();
    connectionProperties.put("user", "root");
    connectionProperties.put("password", "root123");
    connectionProperties.put("sockectFactory", "com.google.cloud.sql.mysql.SockectFactory");
    connectionProperties.put("cloudSqlInstance", "my-project-001-386612:us-central1:test-mysql2");


    logger.info("connection successful");

    logger.info("checkConn:ended"); 
    
    return HttpStatus.OK.toString();

}
}