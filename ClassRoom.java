public class ClassRoom {
    
    String roomNumber;    
    String buildingName;  
    int numberOfStudents; 
    boolean isProjectorAvailable; 
    boolean isAirConditioned;    

    public ClassRoom(String roomNumber, String buildingName, int numberOfStudents, 
                     boolean isProjectorAvailable, boolean isAirConditioned) {
        this.roomNumber = roomNumber;
        this.buildingName = buildingName;
        this.numberOfStudents = numberOfStudents;
        this.isProjectorAvailable = isProjectorAvailable;
        this.isAirConditioned = isAirConditioned;
    }

   
    public void openClassroom() {
        System.out.println("Classroom " + roomNumber + " in " + buildingName + " is now open.");
    }

    public void conductLecture() {
        System.out.println("Lecture is being conducted in classroom " + roomNumber + ".");
    }

    public void showStudentCount() {
        System.out.println("Classroom " + roomNumber + " has " + numberOfStudents + " students.");
    }

    public void showFacilities() {
        System.out.println("Classroom " + roomNumber + " has " + 
                           (isProjectorAvailable ? "a projector" : "no projector") + 
                           " and is " + (isAirConditioned ? "air-conditioned." : "not air-conditioned."));
    }

    
    public void printDetails() {
        System.out.println("Classroom Details:");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Building: " + buildingName);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Projector Available: " + (isProjectorAvailable ? "Yes" : "No"));
        System.out.println("Air Conditioned: " + (isAirConditioned ? "Yes" : "No"));
        System.out.println();
    }
    public static void main(String[] args) {
        
        ClassRoom class1 = new ClassRoom("101", "Science Building", 30, true, true);
        ClassRoom class2 = new ClassRoom("102", "Math Building", 25, false, false);
        ClassRoom class3 = new ClassRoom("201", "Engineering Building", 50, true, true);
        ClassRoom class4 = new ClassRoom("202", "Engineering Building", 45, true, false);
        ClassRoom class5 = new ClassRoom("301", "Arts Building", 20, false, true);
        ClassRoom class6 = new ClassRoom("302", "Arts Building", 22, false, false);
        ClassRoom class7 = new ClassRoom("101", "Business Building", 35, true, true);
        ClassRoom class8 = new ClassRoom("102", "Business Building", 40, true, false);
        ClassRoom class9 = new ClassRoom("201", "Medical Building", 60, true, true);
        ClassRoom class10 = new ClassRoom("202", "Medical Building", 55, false, true);

        
        class1.printDetails();
        class1.openClassroom();
        class1.conductLecture();
        class1.showStudentCount();
        class1.showFacilities();

        class2.printDetails();
        class2.openClassroom();
        class2.conductLecture();
        class2.showStudentCount();
        class2.showFacilities();

        
        class3.printDetails();
        class4.printDetails();
        class5.printDetails();
        class6.printDetails();
        class7.printDetails();
        class8.printDetails();
        class9.printDetails();
        class10.printDetails();
    }
}

