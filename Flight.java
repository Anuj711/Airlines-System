package airporttest;

/*
   User created class for the Flights in the airline
   FROM REQUIREMENTS DOC:
   - Each flight has an ID and departure airport and an arrival airport.
   - Each flight has a pilot and co-pilot, and it uses an aircraft of a certain type. A flight also has
    a departure time and an arrival time.
 */

import java.util.Date;

public class Flight
{
    //flight ID
    private int id;
    //flight departure time
    private Date departureTime;
    //flight arrival time
    private Date arrivalTime;
    //Flight aircraft used
    private Aircraft aircraft;
    //Arrival airport
    private Airport arriveAt;
    //Departure airport
    private Airport departFrom;

    //Constructor for flight class
    public Flight (int id, Date departureTime, Date arrivalTime, Aircraft aircraft, Airport arriveAt, Airport departFrom)
    {
        this.id = id;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
        this.arriveAt = arriveAt;
        this.departFrom = departFrom;
    }
    //Getter method to get the flight ID
    public int getID()
    {
        return id;
    }
    //Getter method to get the flight departure time
    public Date getDepartureTime()
    {
        return departureTime;
    }
    //Getter method to get the flight arrival time
    public Date getArrivalTime()
    {
        return arrivalTime;
    }

    public Aircraft getAircraft()
    {
        return aircraft;
    }
    public Airport getArriveAt()
    {
        return arriveAt;
    }
    public Airport getDepartFrom()
    {
        return departFrom;
    }

}
