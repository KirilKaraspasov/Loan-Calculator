package Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете размер на заема");
        double sumOfLoan = Double.parseDouble(scanner.nextLine());
        System.out.println("Въведете срок на заема");
        double lenghtOfLoan = Double.parseDouble(scanner.nextLine());
        System.out.println("Въведете годишна лихва на заема");
        double interestOfloan = Double.parseDouble(scanner.nextLine());
        double yearInterest = ((interestOfloan * sumOfLoan) * 0.01) / 12;


        double totalSum = sumOfLoan + (yearInterest * lenghtOfLoan);
        double totalInterestOfLoan = lenghtOfLoan * yearInterest;
        double sumPerMonth = (sumOfLoan + totalInterestOfLoan) / lenghtOfLoan ;


        System.out.printf(" Месечна вноска ");
        System.out.println(sumPerMonth);

        System.out.printf(" Общо лихва за период ");
        System.out.println(totalInterestOfLoan);

        System.out.printf(" Обща сума за погасяване ");
        System.out.println(totalSum);
        System.out.println(totalSum);


    }
}
