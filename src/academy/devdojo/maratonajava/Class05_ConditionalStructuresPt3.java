package academy.devdojo.maratonajava;

public class Class05_ConditionalStructuresPt3 {
    public static void main(String[] args) {
        double salary = 6000;
        double donation = salary /= 3;
        String donateok = "You will give R$ " + donation + " as a donation";
        String nodonate = "You can't give a donation";
        //  String name = (condition) ? true : false;
        String result = salary > 500 ? donateok : nodonate;

    /*  or

        if (donation >= 500) {
            result = donateok;
        } else {
            result = nodonate;
        } */
        System.out.println(result);

        // Use && when all the things need to be true
        // Use || when you can bypass in 50 50
    }
}
