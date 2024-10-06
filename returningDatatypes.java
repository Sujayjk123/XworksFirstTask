public interface returningDatatypes {
    public static void main(String[] args) {

      System.out.println("Returned Byte value : "+returnByte());

      System.out.println("Returned Int Value : " + returnInt(2278891,278222));
      
      System.out.println("Returned Short Value : "+returnShort(2323,1921));

      System.out.println("Returned Long Value : "+returnLong((long)2828282,(long)2829821));

      System.out.println("Returning Double Value : "+returnDouble(3838.9599,383883.4748));

      System.out.println("Returning Float Value : "+returnFloat(38.9599f,38.4748f));
      
      System.out.println("Return a first letter of your name : "+ returnFirstChar());

      System.out.println("Is given number 10 is Even : " + checkIfEven((byte) 10));

    }

    public static Byte returnByte(){
        System.out.println("Declaring a Byte value");
        byte aByteValue= 10;
        return aByteValue;
    }

    public static int returnInt(int num1,int num2){
        return (num1 + num2);
    }

    public static short returnShort(int num3,int num4){
        return (short) (num3-num4);
    }

    public static long returnLong(long num5,long num6){
        return  (num5*num6);
    }

    public static double returnDouble(Double num7,Double num8){
        return (num7*num8);
    }

    public static float returnFloat(float num9,float num10){
        return  (num9/num10);
    }

    public static char returnFirstChar(){
        char aCharacter = 's';
        return aCharacter;
    }

    public static boolean checkIfEven(Byte valueToCheck){
        if(valueToCheck%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
