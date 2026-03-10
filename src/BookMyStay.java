abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
        System.out.println();
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 250, 1500.0);
    }

    public void showDetails() {
        System.out.println("Single Room:");
        displayRoomDetails();
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 350, 2500.0);
    }

    public void showDetails() {
        System.out.println("Double Room:");
        displayRoomDetails();
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 500, 5000.0);
    }

    public void showDetails() {
        System.out.println("Suite Room:");
        displayRoomDetails();
    }
}

public class BookMyStay {
    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization\n");

        SingleRoom single = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suite = new SuiteRoom();

        single.showDetails();
        doubleRoom.showDetails();
        suite.showDetails();
    }
}