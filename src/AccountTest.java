import java.util.Scanner;

public class AccountTest {


    public static void main(String[] args) {
        //read user input
        Scanner input = new Scanner(System.in);

        //Create an instance of account
        Account myAccount = new Account();

        //Display the default account info.

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        //promt the user for an account name
        System.out.println("Please enter an account name: ");
        String accName = input.nextLine(); // Read input and save to accName
        myAccount.setName(accName);
        System.out.println();

        //Display account information
        System.out.printf("Name of myAccount is: %s%n", myAccount.getName());
    }
}
