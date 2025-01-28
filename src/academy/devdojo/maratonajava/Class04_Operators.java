package academy.devdojo.maratonajava;

public class Class04_Operators {
    public static void main(String[] args) {
        // + - / *
        Integer number01 = 10;
        Integer number02 = 20;
        Integer sum = number01 + number02;
        Integer times = number01 * number02;
        Integer equals = number02 / number01;

//      %  = BOM PARA DESCOBRIR SE É PAR OU ÍMPAR
        Integer rest = 21 % 7;
//      < > <= >= == !=
        boolean tallerThan = number01 > number02;
        boolean smallerThan = number01 <= number02;
        boolean sameThan = number01 == number02;
        boolean samerThan = number01 == number01;
        boolean diffThan = number01 != number02;
        boolean differThan = number01 != number01;

//      && (and) || (or) !

        Integer idade = 18;
        float salary = 1200;
        boolean isOlderThan = idade <= 20 && salary >= 1500;

        double pcGamerNave = 4500;
        double pcGamerLow = 2500;
        boolean okPc = pcGamerNave >= 3000 || pcGamerLow >= 3000;
        boolean noPc = pcGamerNave <= 3000 || pcGamerLow >= 3000;


//      =, +=, -=, *=, /=, %=    sum, subtraction, multiplication, division and rest

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;


        System.out.println(sum);
        System.out.println(times);
        System.out.println(equals);
        System.out.println(rest);
        System.out.println(number01 + " is taller than " + number02 + "? " + tallerThan);
        System.out.println(number01 + " is smaller than " + number02 + "? " + smallerThan);
        System.out.println(number01 + " is same than " + number02 + "? " + sameThan);
        System.out.println(number01 + " is same than " + number01 + "? " + samerThan);
        System.out.println(number01 + " is different than " + number02 + "? " + diffThan);
        System.out.println(number01 + " is different than " + number01 + "? " + differThan);
        System.out.println(isOlderThan + " He is " + idade + "y and your salary is " + salary);
        System.out.println(okPc + " Ok, you can buy this pc bro");
        System.out.println(noPc + " F, you can't buy this pc bro");
    }
}
