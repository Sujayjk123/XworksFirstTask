public class ArrayTraversal {
    public static void main(String[] args) {
       
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] decimalNumbersArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};
        char[] charactersArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        byte[] byteValuesArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        boolean[] booleanFlagsArray = {true, false, true, false, true, false, true, false, true, false};
        float[] floatNumbersArray = {1.5f, 2.6f, 3.7f, 4.8f, 5.9f, 6.1f, 7.2f, 8.3f, 9.4f, 10.5f};
        long[] largeNumbersArray = {100000L, 200000L, 300000L, 400000L, 500000L, 600000L, 700000L, 800000L, 900000L, 1000000L};
        short[] shortNumbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        
        System.out.println("Left to Right:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < decimalNumbersArray.length; i++) {
            System.out.print(decimalNumbersArray[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < charactersArray.length; i++) {
            System.out.print(charactersArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < byteValuesArray.length; i++) {
            System.out.print(byteValuesArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < booleanFlagsArray.length; i++) {
            System.out.print(booleanFlagsArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < floatNumbersArray.length; i++) {
            System.out.print(floatNumbersArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < largeNumbersArray.length; i++) {
            System.out.print(largeNumbersArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < shortNumbersArray.length; i++) {
            System.out.print(shortNumbersArray[i] + " ");
        }
        System.out.println();

        
        System.out.println("\nRight to Left:");
        for (int i = numbersArray.length - 1; i >= 0; i--) {
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();
        
        for (int i = decimalNumbersArray.length - 1; i >= 0; i--) {
            System.out.print(decimalNumbersArray[i] + " ");
        }
        System.out.println();
        
        for (int i = charactersArray.length - 1; i >= 0; i--) {
            System.out.print(charactersArray[i] + " ");
        }
        System.out.println();

        for (int i = byteValuesArray.length - 1; i >= 0; i--) {
            System.out.print(byteValuesArray[i] + " ");
        }
        System.out.println();

        for (int i = booleanFlagsArray.length - 1; i >= 0; i--) {
            System.out.print(booleanFlagsArray[i] + " ");
        }
        System.out.println();

        for (int i = floatNumbersArray.length - 1; i >= 0; i--) {
            System.out.print(floatNumbersArray[i] + " ");
        }
        System.out.println();

        for (int i = largeNumbersArray.length - 1; i >= 0; i--) {
            System.out.print(largeNumbersArray[i] + " ");
        }
        System.out.println();

        for (int i = shortNumbersArray.length - 1; i >= 0; i--) {
            System.out.print(shortNumbersArray[i] + " ");
        }
        System.out.println();

        
        System.out.println("\nMiddle to Right:");
        for (int i = numbersArray.length / 2; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();

        for (int i = decimalNumbersArray.length /2; i < decimalNumbersArray.length; i++) {
            System.out.print(decimalNumbersArray[i] + " ");
        }
        System.out.println();
        
        for (int i = charactersArray.length /2; i < charactersArray.length; i++) {
            System.out.print(charactersArray[i] + " ");
        }
        System.out.println();

        for (int i = byteValuesArray.length /2; i < byteValuesArray.length; i++) {
            System.out.print(byteValuesArray[i] + " ");
        }
        System.out.println();

        for (int i = booleanFlagsArray.length /2; i < booleanFlagsArray.length; i++) {
            System.out.print(booleanFlagsArray[i] + " ");
        }
        System.out.println();

        for (int i = floatNumbersArray.length /2; i < floatNumbersArray.length; i++) {
            System.out.print(floatNumbersArray[i] + " ");
        }
        System.out.println();

        for (int i = largeNumbersArray.length /2; i < largeNumbersArray.length; i++) {
            System.out.print(largeNumbersArray[i] + " ");
        }
        System.out.println();

        for (int i = shortNumbersArray.length /2; i < shortNumbersArray.length; i++) {
            System.out.print(shortNumbersArray[i] + " ");
        }
        System.out.println();

        
        System.out.println("\nMiddle to Left:");
        for (int i = numbersArray.length / 2 - 1; i >= 0; i--) {
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();

        for (int i = decimalNumbersArray.length/2 - 1; i >= 0; i--) {
            System.out.print(decimalNumbersArray[i] + " ");
        }
        System.out.println();
        
        for (int i = charactersArray.length/2 - 1; i >= 0; i--) {
            System.out.print(charactersArray[i] + " ");
        }
        System.out.println();

        for (int i = byteValuesArray.length/2 - 1; i >= 0; i--) {
            System.out.print(byteValuesArray[i] + " ");
        }
        System.out.println();

        for (int i = booleanFlagsArray.length/2 - 1; i >= 0; i--) {
            System.out.print(booleanFlagsArray[i] + " ");
        }
        System.out.println();

        for (int i = floatNumbersArray.length/2 - 1; i >= 0; i--) {
            System.out.print(floatNumbersArray[i] + " ");
        }
        System.out.println();

        for (int i = largeNumbersArray.length/2 - 1; i >= 0; i--) {
            System.out.print(largeNumbersArray[i] + " ");
        }
        System.out.println();

        for (int i = shortNumbersArray.length/2 - 1; i >= 0; i--) {
            System.out.print(shortNumbersArray[i] + " ");
        }
        System.out.println();

        
        System.out.println("\nSkipping 1 Index:");
        for (int i = 0; i < numbersArray.length; i += 2) {
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < decimalNumbersArray.length; i += 2) {
            System.out.print(decimalNumbersArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < charactersArray.length; i += 2) {
            System.out.print(charactersArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < booleanFlagsArray.length; i += 2) {
            System.out.print(booleanFlagsArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < shortNumbersArray.length; i += 2) {
            System.out.print(shortNumbersArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < largeNumbersArray.length; i += 2) {
            System.out.print(largeNumbersArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < byteValuesArray.length; i += 2) {
            System.out.print(byteValuesArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < floatNumbersArray.length; i += 2) {
            System.out.print(floatNumbersArray[i] + " ");
        }
        System.out.println();
        
    }
}
