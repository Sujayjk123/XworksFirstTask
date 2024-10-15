
class Airplane {
    
    String airline;       
    String model;          
    int seatingCapacity;   
    boolean isInFlight;    

    
    public Airplane() {
        this.airline = "Unknown";
        this.model = "Unknown";
        this.seatingCapacity = 0;
        this.isInFlight = false;
    }

    
    public Airplane(String airline, String model, int seatingCapacity, boolean isInFlight) {
        this.airline = airline;
        this.model = model;
        this.seatingCapacity = seatingCapacity;
        this.isInFlight = isInFlight;
    }

    
    public void takeOff() {
        if (!isInFlight) {
            isInFlight = true;
            System.out.println(airline + " " + model + " is taking off.");
        } else {
            System.out.println(airline + " " + model + " is already in flight.");
        }
    }

    public void land() {
        if (isInFlight) {
            isInFlight = false;
            System.out.println(airline + " " + model + " is landing.");
        } else {
            System.out.println(airline + " " + model + " is already on the ground.");
        }
    }

    public void displayDetails() {
        System.out.println("Airplane Details: ");
        System.out.println("Airline: " + airline);
        System.out.println("Model: " + model);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("In Flight: " + (isInFlight ? "Yes" : "No"));
        System.out.println();
    }



    public static void main(String[] args) {
        
        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane();
        Airplane plane3 = new Airplane();

       
        Airplane plane4 = new Airplane("Emirates", "Boeing 777", 350, true);
        Airplane plane5 = new Airplane("Qatar Airways", "Airbus A350", 315, false);
        Airplane plane6 = new Airplane("Singapore Airlines", "Boeing 787", 290, true);
        Airplane plane7 = new Airplane("British Airways", "Airbus A380", 450, false);
        Airplane plane8 = new Airplane("Lufthansa", "Boeing 747", 370, false);
        Airplane plane9 = new Airplane("Delta Airlines", "Airbus A330", 300, true);
        Airplane plane10 = new Airplane("Air India", "Boeing 737", 180, false);

        
        plane1.displayDetails();
        plane2.displayDetails();
        plane3.displayDetails();

        
        plane4.displayDetails();
        plane5.displayDetails();
        plane6.displayDetails();
        plane7.displayDetails();
        plane8.displayDetails();
        plane9.displayDetails();
        plane10.displayDetails();

       
        plane4.takeOff();
        plane4.land();
    }
}

