public class String_reverse {
    public static void main(String[] args) {

        
    String greeting = "Hello";
    String planet = "World";
    String language = "Java";
    String concept = "Programming";
    String runtimeEnv = "JVM";
    String dataType = "String";
    String description = "Literal";
    String memoryType = "Heap";
    String duplicateMemoryType = "Heap"; 
    String storageArea = "Pool";


    String newGreeting = new String("Hello");
    String newPlanet = new String("World");
    String newLanguage = new String("Java");
    String newConcept = new String("Programming");
    String newRuntimeEnv = new String("JVM");
    String newDataType = new String("String");
    String newDescription = new String("Literal");
    String newEntity = new String("Object");
    String newMemoryType = new String("Heap");
    String newStorageArea = new String("Pool");

        
    System.out.println(checkEqual(greeting,planet));
    
    System.out.println(reverseString(newConcept));
    System.out.println(reverseString(newDescription));
    }

    private static String reverseString(String str4) {
        String reverse = "";
        char []newCharArray = str4.toCharArray();

        for(int i=str4.length()-1;i>=0;i--){
            reverse = reverse+newCharArray[i];
        }
        return reverse;
    }

    private static boolean checkEqual(String newStr1, String newStr10) {
        return newStr1.equals(newStr10);
    }
}
