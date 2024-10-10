public class MethodOverloading {

   
    public void display(int a) {
        System.out.println("Display with one integer: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Display with two integers: " + a + ", " + b);
    }

    public void display(int a, int b, int c) {
        System.out.println("Display with three integers: " + a + ", " + b + ", " + c);
    }

   
    public void print(String a) {
        System.out.println("Print with one string: " + a);
    }

    public void print(String a, String b) {
        System.out.println("Print with two strings: " + a + ", " + b);
    }

    public void print(int a, String b) {
        System.out.println("Print with an integer and a string: " + a + ", " + b);
    }

   
    public void show(String a,int b, double c) {
        System.out.println("Show with a string and a double and int: " + a + ", " + b + " " + c);
    }

    public void show(double a, String b,int c) {
        System.out.println("Show with a string and a double and int: " + a + ", " + b + " "+c);
    }
    public void show(int a,double b,String c){
        System.out.println("Show with a string and a double and int: " + a +" "+ b + " " + c);
    }

   
    public void varArgsMethod(int... numbers) {
        System.out.print("Varargs method called with: ");
        for (int number = 1;number<=numbers.length;number++) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MethodOverloading demo = new MethodOverloading();

       
        demo.display(5);
        demo.display(5, 10);
        demo.display(5, 10, 15);

        demo.print("Hello");
        demo.print("Hello", "World");
        demo.print(100, "Test");

        demo.show("Java", 29,99.9);
        demo.show(99.9, "Java",29);
        demo.show(29, 99.9, "Java");

        
        demo.varArgsMethod(1, 2, 3, 4, 5);
    }
}