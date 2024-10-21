public class String_reverse {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java";
        String str4 = "Programming";
        String str5 = "JVM";
        String str6 = "String";
        String str7 = "Literal";
        String str8 = "Heap";
        String str9 = "Heap";
        String str10 = "Pool";
        
        
        String newStr1 = new String("Hello");
        String newStr2 = new String("World");
        String newStr3 = new String("Java");
        String newStr4 = new String("Programming");
        String newStr5 = new String("JVM");
        String newStr6 = new String("String");
        String newStr7 = new String("Literal");
        String newStr8 = new String("Object");
        String newStr9 = new String("Heap");
        String newStr10 = new String("Pool");
        
        System.out.println(checkEqual(str8,str9));
        System.out.println(checkEqual(newStr1,newStr10));
        System.out.println(reverseString(str7));
        System.out.println(reverseString(newStr4));
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
