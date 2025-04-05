class TicketBooking {

    public void bookSeat(int[] seats, int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("Invalid seat number");
            return;
        }

        if (seats[seatNumber - 1] == 0) {
            seats[seatNumber - 1] = 1;
            System.out.println("-> Seat " + seatNumber + " booked successfully");
        } else {
            System.out.println("-> Seat " + seatNumber + " is already booked");
        }
    }

    public void displaySeats(int[] seats) {
        for (int i = 0; i < seats.length; i++) {
            System.out.println("seat " + (i + 1) + ": " + (seats[i] == 0 ? "Available" : "Booked"));
        }
    }
}

public class ArraysExample {
    public static void main(String[] args) {
        int[] seats = new int[10];

        TicketBooking ticketBooking = new TicketBooking();

        System.out.println("Before Booking");
        ticketBooking.displaySeats(seats);

        System.out.println();

        System.out.println("After booking");
        ticketBooking.bookSeat(seats, 5);
        ticketBooking.displaySeats(seats);
    }
}
