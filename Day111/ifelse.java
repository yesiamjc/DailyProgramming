import java.io.*;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age: ");
        Scanner s = new Scanner(System.in);
        age = s.nextInt();
        if (age > 18) {
            System.out.print("You are eligible to VOTE");
        } else
            System.out.print("You are not eligible to VOTE");
    }
}