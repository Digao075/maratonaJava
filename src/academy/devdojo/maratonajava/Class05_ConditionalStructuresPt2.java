package academy.devdojo.maratonajava;

public class Class05_ConditionalStructuresPt2 {
    public static void main(String[] args) {
        // use else if for many options
        // age < 15 = Kid class
        // age >= 15 && age < 18 = Junior class
        // age >= 18 = Adult class

        Integer age = 21;
        boolean kid = age < 15;
        boolean junior = age >= 15 && age < 18;
        boolean adult = age >= 18;

        if (kid) {
            System.out.println("You are in Kid Category");
        }
        if (junior) {
            System.out.println("You are in Junior Category");
        }
        if (adult) {
            System.out.println("You are in Adult Category");
        }
    }
}
