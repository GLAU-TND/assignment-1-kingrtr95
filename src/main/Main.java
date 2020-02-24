package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      //scanner object for scanning inputs
        System.out.println("Welcome to MY contact list:");
        System.out.println("-------- * -------- * -------- * --------\n" +
                "-------- * -------- * -------- * --------");

        System.out.println("Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program ");
        boolean n = true;
        ContactMenuMethods obj = new ContactMenuMethods();

        while (n) {
            int option = Integer.parseInt(scan.nextLine());


            switch (option) {
                case 1:
                    obj.addContact();
                    break;
                case 2:
                    obj.viewContact();
                    break;
                case 3:
                    obj.searchContact();
                    break;
                case 4:
                    obj.deleteContact();
                    break;
                case 5:
                    n = false;
                    System.out.println("Exit- Thankyou.....");
                    break;


            }
        }
    }
}
