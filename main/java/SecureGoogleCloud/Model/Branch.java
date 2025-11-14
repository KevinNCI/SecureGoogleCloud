/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SecureGoogleCloud.Model;

/**
 *
 * @author Kevin
 */
public class Branch {
    private int branchId;
    private String branchName;
    private String location;
    private String mangerName;
    
    
    public Branch() {
    }
        public Branch(int branchId, String branchName, String location, String mangerName ){
            
            this.branchId = branchId;
            this.branchName = branchName;
            this.location = location;
            this.mangerName = mangerName;
        }
            public int getBranchId(){
                return branchId;
            }
            
            public void setBranchId(int branchId){
                this.branchId = branchId;
            }
            public String getBranchName() {
                return branchName;
            }
            
            public void setBranchName(String branchName) {
                this.branchName = branchName;
            }
            
            public String getLocation() {
                return location;
            }
            
            public void SetLocation(String location) {
                this.location = location;
            }
            
            public String getMangerName() {
                return mangerName; 
            }
            
            public void setMangerName(String mangerName) {
                this.mangerName = mangerName;
            }
            
            @Override 
            
            public String toString() {
                return "Branch{" + 
                       "branchId = " + branchId + 
                        ", branchName= '" + branchName +
                        ", location'" + location + '\'' + 
                        ", mangerName'" + mangerName + '\'' + 
                        '}';
                
            }
                        
            
        }
    
