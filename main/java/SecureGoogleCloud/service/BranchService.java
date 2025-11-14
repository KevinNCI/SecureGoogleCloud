/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureGoogleCloud.service;

import SecureGoogleCloud.Model.Branch;

import SecureGoogleCloud.Model.Branch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * 
 * @author Kevin
 */
@Service
public class BranchService {
    
    Logger logger = LoggerFactory.getLogger(BranchService.class);
    List<Branch> branches = new ArrayList(); 
    
    public List<Branch> getBranches() throws SQLException {
         logger.info("checkconn:started");
         Properties connectionProperties = new Properties(); 
         connectionProperties.put("user", "root"); 
         connectionProperties.put("password", "root123");
         connectionProperties.put("socketFactory", "com.google.cloud.sql.mysql.SocketFactory" ); 
         connectionProperties.put("cloudSqlInstance", "my-project-001-386612:us-central:test-mysql2");
         
         try (Connection connection = DriverManager.getConnection("jdbc:mysql:///branchdb", connectionProperties)) {
          logger.info("connection sucessful");
          String query = "SELECT * FROM branch";
          try (Statement statement = connection.createStatement();
                  ResultSet resultSet = statement.executeQuery(query)) {
                 while (resultSet.next()) {
                     int branchId;
                     branchId = resultSet.getInt("branch_Id");
                    String branchname = resultSet.getString("branch_Name");
                     String location = resultSet.getString("location");
                     String mangerName = resultSet.getString("manger_Name");
                     
                     Branch branch;
                     branch = new Branch(branchId, branchname, location, mangerName);
                     branches.add(branch);
                 }
              
          } catch (SQLException e) { 
              e.printStackTrace();
          }
             logger.info("checkConn:ended");
             return branches;
             
         }
    }
   
}


    


