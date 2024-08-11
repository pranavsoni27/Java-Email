package emailapp;

import java.util.Scanner;

public class EmailApp {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter first name = ");
                String a = sc.next();
                System.out.print("Enter last name = ");
                String b = sc.next();

                Email em1 = new Email(a, b);
                System.out.println(em1.showInfo());
                
        }
}
