package emailapp;

import java.util.Scanner; 

public class Email {
        private String firstName;
        private String lastName;
        private String password;
        private String department;
        private int mailboxCapacity = 500;
        private String alternateEmail;
        private int defaultPasswordLength = 10;
        private String email;
        private String companySuffix = ".company.com";

        public Email(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;

                this.department = setDepartment();
                
                this.password = randomPassword(defaultPasswordLength);
                System.out.println("Your password = " + this.password);

                email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
                System.out.println("Your email is = " + email);
        }

        private String setDepartment(){
                System.out.println("New worker = " + firstName + " " + lastName + "\nDepartment CODES");
                System.out.println("1 for sales");
                System.out.println("2 for development");
                System.out.println("3 for accounting");
                System.out.println("4 for none");
                System.out.print("Enter department code = ");
                Scanner sc = new Scanner(System.in);
                int depChoice = sc.nextInt();
                if(depChoice == 1){
                        return "sales";
                }else if(depChoice == 2){
                        return "development";
                }else if(depChoice == 3){
                        return "accounting";
                }else{
                        return "";
                }
        }

        private String randomPassword(int length){
               String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
               char[] password = new char[length];
               for(int i=0; i<length; i++){
                int rand = (int)(Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(rand);
               }
               return new String(password);
        }

        public void setMailboxCapacity(int capacity){
                this.mailboxCapacity = capacity;  
        }

        public void setAlternateEmail(String altEmail){
                this.alternateEmail = altEmail;  
        }

        public void changePassword(String password){
                this.password = password;
        }

        public int getMailboxCapacity(){
                return mailboxCapacity;
        }

        public String getAlternateEmail(){
                return alternateEmail;
        }

        public String getPassword(){
                return password;
        }

        public String showInfo(){
                return "Display Name = " + firstName + " " + lastName + "\nCompany Email = " + email + "\nMailbox Capacity = " + mailboxCapacity + "mb";
        }
}
