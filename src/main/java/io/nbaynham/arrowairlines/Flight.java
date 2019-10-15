package io.nbaynham.arrowairlines;

public class Flight {
    private boolean fullyBooked;
    private boolean cancelled;

    public void bookAllSeats() {
        fullyBooked = true;
    }

    public void cancelFlight() {
        cancelled = true;
    }

    private boolean isFullyBooked() {
        return fullyBooked;

    }

    private boolean isCancelled() {
        return cancelled;
    }

    public Confirmation bookFlight(ItineraryRequest itinerary, SeatRequest seatRequest) throws FlightFullException, FlightCancelledException {
        if (isFullyBooked()) throw new FlightFullException();
        if (isCancelled()) throw new FlightCancelledException();
        return new Confirmation();
    }
}
