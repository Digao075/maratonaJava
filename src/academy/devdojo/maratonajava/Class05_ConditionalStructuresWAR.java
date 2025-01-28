package academy.devdojo.maratonajava;

public class Class05_ConditionalStructuresWAR {
    public static void main(String[] args) {
        /* R$ 1.900     7,5%
           R$ 2.826,66   15%
           R$ 3.751,06   22,5%

         */
        double mensalSalary = 5000;
        double firstRange = 7.5 / 100;
        double secondRange = 15 / 100;
        double thirdRange = 22.5 / 100;
        double salaryTax;

        if (mensalSalary >= 1900) {
            mensalSalary = mensalSalary * firstRange;
        } else if (mensalSalary >= 2826.65 && mensalSalary <= 3751.05 ) {
            mensalSalary = mensalSalary * secondRange;
        } else {
            mensalSalary = mensalSalary * thirdRange;
        }
        System.out.println("You have to pay R$ " + mensalSalary + " like tax");
    }
}
