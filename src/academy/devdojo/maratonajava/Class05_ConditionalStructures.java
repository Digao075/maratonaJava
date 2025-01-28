package academy.devdojo.maratonajava;

public class Class05_ConditionalStructures {
    public static void main(String[] args) {
        Integer age = 21;
//  use "!" for negative rules if(!age)...

        if (age >= 18) {
            System.out.println("Ok, you can buy this!");
        } else {
            System.out.println("Sorry, you can't buy this");
        }
    }
}
