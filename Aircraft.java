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
public class Aircraft
{
    private String name;            // Aircraft name
    private ArrayList<Pilots> pilots;       //list of all pilots for the aircraft
    private MaintainenceState maintainenceState; //Aircraft state : working/under repair
    private FlightState flightState; //landed/Airborme
    public enum MaintainenceState     //Aircraft state : working/under repair
    {
        working
                {
                    public String toString()
                    {
                        return "working";
                    }
                },
        UnderRepair
                {
                    public String toString()
                    {
                        return "under repair";
                    }
                };
    }
    public enum FlightState   //landed/Airborme
    {
        Landed,
        Airborne;
    }

    public Aircraft(String name, MaintainenceState maintainenceState, FlightState flightState, ArrayList<Pilots> pilots)
    {
        this.name = name;
        this.pilots = pilots;
        this.maintainenceState= maintainenceState;
        this.flightState = flightState;

    }

    public MaintainenceState getMaintainenceState()
    {
        return maintainenceState;
    }

    public FlightState getFlightState()
    {
        return flightState;
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Pilots> getPilots()
    {
        return pilots;
    }

    //TODO: Requirement 1 method - Done and tested
    //Method has no return value and simply adds the given object pilot, to the aircraft
    public void joinPilot(Pilots pilot)
    {
        pilots.add(pilot);
    }

    //TODO: Requirement 2 method - Done and tested
    //Method has no return value and prints out a list of the pilots working in the aircraft
    //Code might not work, used toString arbritrarily
    public void printPilot()
    {
        for (Pilots pilot : pilots)
        {
            System.out.println("Name: " + pilot.getName() + " ID: " + pilot.getId() + " Rank: " + pilot.getRank());
        }
    }
}
