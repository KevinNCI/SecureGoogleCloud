/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import Services.FlightOrderService;

/**
 *
 * @author x18208746
 */

@XmlRootElement
@Entity(name="flightorder")
@Table(name="flightorder")
public class FlightOrderEntities {
   
    @Id
	@Column(name="flightId=")
	int FlightOrderNum;
	
	@Column(name="Passengername")
	String PassengerName;
        
        public FlightOrderEntities() {
		
	}
    public FlightOrderEntities(int FlightOrderNum, String passengerName) {
		super();
		this.FlightOrderNum = FlightOrderNum;
		PassengerName = passengerName;
	}
    
     public int getFlightOrderNum() {
		return FlightOrderNum;
	}

	public void setFlightOrderNum(int FlightOrderNum) {
		this.FlightOrderNum = FlightOrderNum;
	}
    
        public String getPassengerName() {
		return PassengerName;
	}

	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
    
}
