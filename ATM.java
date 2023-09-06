import java.util.Scanner;
public class ATM {
    public static void main (String [] args) {
        int balance=0;
        int deposite=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name  : ");
        String name = sc.nextLine();
        System.out.println("Enter  your Account number : ");
        int acc= sc.nextInt();
        System.out.println("Please enter your bank number : ");
        int bank=1;
        while(bank ==1) {
            System.out.println(" 1 ICICI Bank");
            System.out.println(" 2 AXIS Bank");
            System.out.println(" 3 STATE Bank");
            System.out.println(" 4 HDFC Bank");
            int bak = sc.nextInt();
            switch(bak) {
                case 1:
                    System.out.println("WELCOME IN ICICI BANK---------------");
                    break;
                case 2:
                    System.out.println(" WELCOME IN AXIS BANK---------------");
                    break;
                case 3:
                    System.out.println(" WELCOME IN STATE BANK---------------");
                    break;
                case 4:
                    System.out.println(" WELCOME IN HDFC BANK----------------");
                    break;
            }
            break;



        }
        int a = 1;
        while(a==1) {
            System.out.print("\n select options" );
            System.out.println("\n 1 Deposite");
            System.out.println(" 2 Withdraw");
            System.out.println(" 3 Balance");
            System.out.println("\n 4 Exit");
            System.out.println("" );
            System.out.println("Enter the choice");
            int ch=sc.nextInt();
            if(ch==1) {
                System.out.println("Enter the amount to deposite :");
                deposite = sc.nextInt();
                balance = deposite + balance;
                System.out.println("Successfully Deposited-------------");

            } else if (ch==2) {
                System.out.println("Enter amout of withdraw : ");
                int withdraw= sc.nextInt();
                if(withdraw>deposite) {
                    System.out.println("Withdraw failed.....please check your account balance");
                } else {
                    balance=balance-withdraw;
                    System.out.println("Withdraw Successful-------------");
                }
            } else if(ch==3) {
                System.out.println("Your Balance Is: " +balance);
            } else if(ch==4) {
                System.out.println("Thank you"+ name);
                break;
            } else {

            }


        }
    }
}
