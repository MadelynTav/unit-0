import java.util.Scanner;

public class ifThen {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("What is your password?");

        int password = in.nextInt();


        if (password == 1235) {
            System.out.println("You are a Hacker!");
        }


    }

}

