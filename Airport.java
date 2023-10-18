 /*
	SOFE 2710 Assignment
	
 */
 
package airporttest;

import java.util.ArrayList;

 /**
  *
  * @author 100895219
  * @date October 15, 2023
  */

 public class Airport {
    private String city;    //airport city
    private String country; //airport country
    private String id;      //airport id
    
    public Airport(String city,String country, String id){        
        this.city = city;
        this.country = country;
        this.id = id;        
    }
    
    public String getAirportCity(){
        return city;
    }
    public String getAirportCountry(){
        return country;
    }    
    public String getAirportId(){
        return id;
    }    
  
  

}
