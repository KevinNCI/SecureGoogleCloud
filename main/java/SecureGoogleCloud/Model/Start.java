/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureGoogleCloud.Model;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author Kevin
 */
public class Start {
    
    private String appMode;
    private String[] valuesArray;
    private Map<String, Integer> valuesMap;
    
    public String[] getValuesArray() {
        return valuesArray; 
    }
    
    public void setValuesArray(String[] valuesArray) {
        this.valuesArray = valuesArray;
    }
    
    public String getAppMode() {
        return appMode;
    }
    
    public void setAppMode(String appMode) { 
        this.appMode = appMode;
    }

    public void setValuesMap(Map<String, Integer> valuesMap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
