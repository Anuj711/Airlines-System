/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airporttest;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 100895219
 * @date October 15, 2023
 */
public class Airline
{
    private String id;              // airline id
    private ArrayList<Flight> flightsList;      // list of flights for this airline
    private ArrayList<Aircraft> aircraftList;   // list of aircraft for this airline

    public Airline(String id, ArrayList<Flight> flights, ArrayList<Aircraft> aircraft)
    {
        this.id = id;
        this.flightsList = flights;
        this.aircraftList = aircraft;
    }


    public String getId() {
        return id;
    }

    public ArrayList<Flight> getFlightsList() {
        return flightsList;
    }

    public ArrayList<Aircraft> getAircraftList() {
        return aircraftList;
    }

    //TODO: Requirement 3 method - Done and tested
    //Method has no return value and adds an aircraft to an airline
    //If the aircraft is already owned by the airline then the method does nothing.
    public void owns(Aircraft aircraft)
    {
       if (!this.aircraftList.contains(aircraft))
       {
           this.aircraftList.add(aircraft);
       }
    }
    //TODO: Requirement 4 method - Done and tested
    //Method has no return value and displays a list of all flights who are owned by the current airline.
    //This method shows all flight information such as:
    // 1. Flight ID
    // 2. Flight arrival time
    // 3. Flight departure time
    // 4. aircraft used by the flight
   public void printFlightByName()
   {
	   for (Flight f: flightsList)
       {
		   System.out.println("Flight ID: " + f.getID() + " " + "Flight aircraft: " + f.getAircraft().getName() + " " + "Flight arrival time: " + f.getArrivalTime()
                   + " " + "Flight departure time: " + f.getDepartureTime());
	   }   
   } 
   

   //TODO: Requirement 6 method - Done and Tested
   //Method returns an ArrayList containing all pilots who are working in the given airline identified by
   // the airline code.
    // I think there was a mistake in the requirements doc - Prof updated requirements doc and corrected
     public ArrayList<Pilots> pilotsWorkingForAirlines(Airline airline)
     {
        ArrayList<Pilots> workingForAirlinesList = new ArrayList<Pilots> ();
        for(Aircraft aircraft : airline.getAircraftList())
        {
            for (Pilots pilot : aircraft.getPilots())
            {
                workingForAirlinesList.add(pilot);
            }
        }
        return workingForAirlinesList;
     }

     //TODO: Requirement 7 method - Code came completed for me - Tested
    // Method returns list of flights that have the desired departure airport and departure time
     public ArrayList<Flight> getDepartureFlightByAirport(Airport airport, Date departTime)
     {

         //Test to see if departtime is printed correctly System.out.println(departTime);
       ArrayList<Flight> list = new ArrayList<Flight>();
       for (Flight flight : flightsList)
       {
           if((flight.getDepartFrom().equals(airport)) && (flight.getDepartureTime().equals(departTime)))
           {
               list.add(flight);
           }
       }
       return list;
     }

    //TODO: Requirement 8 method -  Code came completed for me - Tested
    //Method returns list of flights that have the desired arrival airport and arrival time
     public ArrayList<Flight> getArrivalFlightByAirport(Airport airport, Date arrivalTime)
     {
         ArrayList<Flight> list = new ArrayList<Flight>();
         for (Flight flight : flightsList)
         {
             if((flight.getArriveAt().equals(airport)) && (flight.getArrivalTime().equals(arrivalTime)))
             {
                 list.add(flight);
             }
         }
         return list;

     }

     //Function outputs the list of pilots in pilots list as string format identified by their name
    public void displayListPilot(ArrayList<Pilots> list)
    {
        for (Pilots pilot : list)
        {
            System.out.println("Pilot: " + pilot.getName());
        }
    }
    //Function outputs the individual flights from flight list as strings identified by their flight ID
    public void displayListFlights(ArrayList<Flight> list)
    {
        for (Flight flight : list)
        {
            System.out.println("Flight: " + flight.getID());
        }
    }

}
