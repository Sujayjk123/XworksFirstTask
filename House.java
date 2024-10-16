public class House {
    
    String address;
    int numberOfRooms;
    boolean hasGarden;
    int numberOfFloors;
    boolean isForSale;

    static House []arrayOfHouse = new House[8];

    public House(String address, int numberOfRooms, boolean hasGarden, int numberOfFloors, boolean isForSale) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.hasGarden = hasGarden;
        this.numberOfFloors = numberOfFloors;
        this.isForSale = isForSale;
    }

    public void displayDetails() {
        System.out.println("House Address: " + this.address);
        System.out.println("Number of Rooms: " + this.numberOfRooms);
        System.out.println("Has Garden: " + (this.hasGarden ? "Yes" : "No"));
        System.out.println("Number of Floors: " + this.numberOfFloors);
        System.out.println("Is For Sale: " + (this.isForSale ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        
        House house1 = new House("123 Maple St, Springfield", 5, true, 2, true);
        House house2 = new House("456 Oak Ave, Rivertown", 3, false, 1, false);
        House house3 = new House("789 Pine Rd, Hillcrest", 4, true, 2, true);
        House house4 = new House("101 Birch Blvd, Lakeside", 6, true, 3, false);
        House house5 = new House("102 Cedar St, Sunnyside", 2, false, 1, true);
        House house6 = new House("103 Elm St, Greenwood", 4, true, 2, false);
        House house7 = new House("104 Walnut Ln, Seaview", 3, false, 1, true);
        House house8 = new House("105 Maple Grove, Riverside", 5, true, 2, false);

        House.saveHouse(house1);
        House.saveHouse(house2);
        House.saveHouse(house3);
        House.saveHouse(house4);
        House.saveHouse(house5);
        House.saveHouse(house6);
        House.saveHouse(house7);
        House.saveHouse(house8);
        
        for(House h : arrayOfHouse){
            h.displayDetails();
        }


       
    }
    public static boolean saveHouse(House house){
        for(int i=0;i<=arrayOfHouse.length;i++){
            if (arrayOfHouse[i] == null) {
                arrayOfHouse[i] = house;
                System.out.println("house saved");
                return true;
            }
        }
        System.out.println("house cannot be saved");
        return false;
        
    }
}
