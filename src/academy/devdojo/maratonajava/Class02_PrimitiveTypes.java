package academy.devdojo.maratonajava;

public class Class02_PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
//      Integer transform to object  vs  int is primitive types
//      string = always object
        Integer age = 21;
//      int age = 18;
        long longnumber = 10000;
        double salaryDouble = 2000;
        float salaryFloat = 2500;
        byte ageByte = 10;
        short ageShort = 10;
        boolean yeah = true;
        boolean no = false;
        char character = 'M';
        String name = "Teco";


        System.out.println("His name is " + name);
        System.out.println("He is " + age + " years old");
        System.out.println("His salary is " + salaryFloat);
    }
}