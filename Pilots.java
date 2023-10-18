package airporttest;

/*
   User created class for the pilots who operate the airplanes
 */

import java.util.ArrayList;

public class Pilots
{
    //Pilot name
    private String name;
    private int id;
    private String rank;

    //Constructor method to instantiate a new Pilots object
    public Pilots (String name, int id, String rank)
    {
        this.name = name;
        this.id = id;
        this.rank = rank;
    }

    //Getter method to get the pilot's name
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public String getRank()
    {
        return rank;
    }
    //TODO: Requirement 5 method - Done and tested
    //Method returns a boolean value. If this pilot is working on the given aircraft, return true.
    //Else return false
    public boolean isPilotForFlight(Aircraft aircraft)
    {
        //Loop thru all the pilots to see if they are piloting the given aircraft
        for (Pilots pilot : aircraft.getPilots())
        {
            //If the current pilot in the list equals this pilot, return true
            if(pilot.getName().equals(this.getName()))
            {
                return true;
            }
        }
        //Otherwise no matching pilot - return false
        return false;
    }
}

// flight = CC3AG
// aircraft = boeing 1