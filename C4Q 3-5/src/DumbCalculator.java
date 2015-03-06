import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 3/5/15.
 * C4Q 2.1
 * This class creates a Calculator which asks the user to input
 * three numbers then returns the sum of those numbers
 * Divided by two
 */
public class DumbCalculator {
    public static void main(String[] args) {
        double firstNum;
        double secondNum;
        double thirdNum;
        double answer;
        Scanner input= new Scanner(System.in);
        System.out.println("What is your first number?");
        firstNum= input.nextDouble();
        System.out.println("What is your second Number?");
        secondNum=input.nextDouble();
        System.out.println("What is your final number?");
        thirdNum=input.nextDouble();
        answer= (firstNum+secondNum+thirdNum)/2;
        System.out.println("("+firstNum+"+"+secondNum+"+"+thirdNum+")/2"+" is equal to..."+answer);


    }
}