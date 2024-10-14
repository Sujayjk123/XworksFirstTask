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

        
       
        class1.openClassroom();
        class1.conductLecture();
        class1.showStudentCount();
        class1.showFacilities();

        class2.openClassroom();
        class2.conductLecture();
        class2.showStudentCount();
        class2.showFacilities();

        class3.openClassroom();
        class3.conductLecture();
        class3.showStudentCount();
        class3.showFacilities();

        class4.openClassroom();
        class4.conductLecture();
        class4.showStudentCount();
        class4.showFacilities();

        class5.openClassroom();
        class5.conductLecture();
        class5.showStudentCount();
        class5.showFacilities();

        class6.openClassroom();
        class6.conductLecture();
        class6.showStudentCount();
        class6.showFacilities();

        class7.openClassroom();
        class7.conductLecture();
        class7.showStudentCount();
        class7.showFacilities();

        class8.openClassroom();
        class8.conductLecture();
        class8.showStudentCount();
        class8.showFacilities();

        class9.openClassroom();
        class9.conductLecture();
        class9.showStudentCount();
        class9.showFacilities();

        class10.openClassroom();
        class10.conductLecture();
        class10.showStudentCount();
        class10.showFacilities();

    }
}

