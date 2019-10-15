package io.nbaynham.arrowairlines;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArrowAirlinesFailureTests {
    private static final Flight flight = new Flight();

    @BeforeMethod
    public void before() {
    }

//    @Test(groups={"unit", "functional"})
//    public void shouldThrowIfFlightIsFullyBooked() throws ReservationException {
//        Confirmation confirmation = flight.bookFlight(new ItineraryRequest(), new SeatRequest());
//        assertNotNull(confirmation);
//    }

    @Test(expectedExceptions = FlightFullException.class)
    public void shouldThrowExceptionIfFlightIsFullyBooked() throws ReservationException{
        flight.bookAllSeats();
        flight.bookFlight(new ItineraryRequest(), new SeatRequest());
    }

    @Test(expectedExceptions = FlightCancelledException.class)
    public void shouldThrowExceptionIfCancelled() throws ReservationException {
        flight.cancelFlight();
        flight.bookFlight(new ItineraryRequest(), new SeatRequest());
    }
}
