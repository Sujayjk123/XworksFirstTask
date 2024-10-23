public class PalindromeAndSecondSmallest {
    public static void main(String[] args) {

        int []age = {28,45,33,20,59};
        String language = "malayalam";

        boolean result = isPali(language);
        System.out.println(result);
        int secMinage = secondSmallest(age);
        System.out.println(secMinage);

        //concat
        String city = "Bangalore";
        String area = "indiranagar";
        String address = city.concat(area);
        System.out.println("Concatenated String");
        System.out.println(address);

        //toupper
        String myname = "sujay";
        System.out.println("string to upper case");
        System.out.println(myname.toUpperCase());

        //toLower
        System.out.println("string to Lower case");
        System.out.println(myname.toLowerCase());

        //isEmpty
        System.out.println("Checking if the myname is empty or not");
        System.out.println(myname.isEmpty());

        //split
        String intro = "My name is sujay and i am from the jajur chitradurga.";
        String []introArray = intro.split(" ");
        System.out.println("split based on space");
        for(int i=0;i<introArray.length;i++){
            System.out.println(introArray[i]);
        }
    }
    //Second smallest
    public static int secondSmallest(int []ages){
        int secMinEle = 0;
        int minEle = ages[0];
        int len = ages.length;


        for(int i=0;i<len;i++){
            
            if(ages[i] < minEle){
                secMinEle = minEle;
                minEle = ages[i];  
            }
            else if(ages[i] < secMinEle){
                secMinEle = ages[i];
            }
        }
        return secMinEle;
    }
    //palindrome
    public static boolean isPali(String language){

        String reverse = "";
        char []charArray = language.toCharArray();
        for(int i=language.length()-1;i>=0;i--){
            reverse = reverse+charArray[i];
        }
       
        if(language.equals(reverse)){
            return true;
        }
        return false;
       
    }
}
