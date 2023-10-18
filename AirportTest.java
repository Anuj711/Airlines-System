
package airporttest; 
import java.util.ArrayList;
import java.util.*;
import java.text.*;


/**
 *
 * @author 100895219
 * @date October 15, 2023
 */
 
 
 
public class AirportTest {
    /**
     * @param args the command line arguments
     */



    public static void main(String[] args)throws ParseException {
        // TODO code application logic here
		
	   //instantiate objects from Airport class
       Airport pearson = new Airport("Toronto","Canada","YYZ");
	   Airport montreal = new Airport("Montreal","Canada","YUL");
	   Airport ottawa = new Airport("Ottawa","Canada","YOW");	 
	   
	   //instantiate objects from Pilots class
	   Pilots johnSmith = new Pilots ("John Smith",540,"Captain");
	   Pilots SarahEric = new Pilots ("Sarah Eric",651,"Co Pilot");
	   Pilots monnaKam = new Pilots ("Monna Kam",785,"navigator");
	   Pilots TestPilot1 = new Pilots ("TestPilot1",799,"Private");
	   Pilots TestPilot2 = new Pilots ("TestPilot2",923,"General");
	   Pilots TestPilot3 = new Pilots ("TestPilot3",206,"Captain");


		//instantiate objects from Aircraft class
		ArrayList<Pilots> pilots = new ArrayList<Pilots>();
		ArrayList<Pilots> pilots2 = new ArrayList<Pilots>();
		//Tests requirement 1
		pilots.add(johnSmith);
		pilots.add(SarahEric);
		pilots.add(monnaKam);
		//Tests requirement 6
		pilots2.add(TestPilot1);
		pilots2.add(TestPilot2);
		pilots2.add(TestPilot3);
		Aircraft.MaintainenceState working = Aircraft.MaintainenceState.working;
		Aircraft.MaintainenceState underRepair = Aircraft.MaintainenceState.UnderRepair;
		Aircraft.FlightState landed = Aircraft.FlightState.Landed;
		Aircraft.FlightState Airborne = Aircraft.FlightState.Airborne;
		Aircraft boeing787 = new Aircraft("boeing787", working , Airborne,pilots);
		Aircraft airbusA380 = new Aircraft("airbusA380 ", working , Airborne,pilots2);
	
	//instantiate objects from Flight class  
	 SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
	 Date departureTime = dateformat.parse("07/17/2018 03:19");
     Date arrivalTime = dateformat.parse("07/20/2018 04:50");	 
     Flight ac472 = new Flight(1234,departureTime,arrivalTime, boeing787, pearson, montreal);

		
	//instantiate objects from Airline class  	 
    ArrayList<Flight> flights= new ArrayList<Flight>(); 
	flights.add(ac472);	
	ArrayList<Aircraft> aircrafts= new  ArrayList<Aircraft>(); 
	aircrafts.add(boeing787);
	aircrafts.add(airbusA380);
	Airline airCanada = new Airline("Air Canada",flights,aircrafts);
	Airline airLabu = new Airline("Air Labu", flights, aircrafts);

	//Tests Requirement 2 - Success
	boeing787.printPilot();
	//Tests Requirement 3 - Success
	airCanada.owns(boeing787);
	airLabu.owns(airbusA380);
	//Tests Requirement 4 - Success
	airCanada.printFlightByName();
	//Tests Requirement 5 - Success for both cases
	System.out.println(johnSmith.isPilotForFlight(boeing787));
	System.out.println(TestPilot1.isPilotForFlight(boeing787));
	//Tests Requirement 6 - Success
	airLabu.displayListPilot(airLabu.pilotsWorkingForAirlines(airLabu));
	//Test 7 - Success
	airCanada.displayListFlights(airCanada.getDepartureFlightByAirport(montreal, departureTime));
	//Test 8 - Success
	airCanada.displayListFlights(airCanada.getArrivalFlightByAirport(pearson, arrivalTime));
	//Testing enums for maintainence state and flight state
	System.out.println(boeing787.getMaintainenceState());
	System.out.println(boeing787.getFlightState());
	}


}
