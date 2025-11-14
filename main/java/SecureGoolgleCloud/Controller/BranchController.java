/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureGoolgleCloud.Controller;

import SecureGoogleCloud.Model.Branch;
import SecureGoogleCloud.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import java.util.ArrayList;

import java.util.List;
import ProjectModel.Quizinformation;



/**
 *
 * @author Kevin
 */
@RestController
@RequestMapping("/branch")

public class BranchController {
    
    @Autowired
    BranchService branchService;

    
    
    static Client client = ClientBuilder.newClient();
	static WebTarget baseQuizinformationURL = client
    	.target("http://localhost:49000/jerseytutorial/Questions/Quizinformation");
	static WebTarget QuizinformationURL = baseQuizinformationURL.path("{PassengerPassportNum}");
      
	public static void main(String[] args) {

		Quizinformation[] response = baseQuizinformationURL.request(MediaType.APPLICATION_JSON)
				.get(Quizinformation [].class);
		
		for(Quizinformation quizinformation: response) {
			System.out.println(quizinformation);
		}
		
		
	}

}

