import java.util.Scanner;

public class Services {

    public String Services[] = { "Ticket booking", "Hotel booking", "Uber booking" };

    public String TicketCategories[] = { "Bus", "Train", "Flight" };
    public String HotelCategories[] = { "3 star", "4 star", "5 star" };
    public String UberCategories[] = { "Mini", "Micro", "Sedan" };

    public int TicketPrices[] = { 500, 1000, 2000 };
    public int HotelPrices[] = { 1000, 2000, 3000 };
    public int UberPrices[] = { 500, 1000, 2000 };

    public void displayServices() {
        System.out.println("Welcome to Travel Companion");
        System.out.println("Choose a service below");
        System.out.println("*************************");
        for (int i = 0; i < Services.length; i++) {
            System.out.println(i + 1 + " " + Services[i]);
        }
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        displayCategories(choice);
    }

    public void displayCategories(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Choose a ticket category");
                System.out.println("*****************");
                for (int i = 0; i < TicketCategories.length; i++) {
                    System.out.println(i + 1 + " " + TicketCategories[i] + " " + TicketPrices[i]);
                }
                Scanner sc = new Scanner(System.in);
                int choice2 = sc.nextInt();
                for (int i = 0; i < TicketPrices.length; i++) {
                    if (choice2 == i + 1) {
                        System.out.println(TicketPrices[i]);
                        System.out.println("Your ticket has been booked successfully");
                        System.out.println("Total amount to be paid is " + TicketPrices[i]);
                    }
                }
                System.out.println("You booked: " + TicketCategories[choice2 - 1] + " " + TicketPrices[choice2 - 1]);
                break;
            case 2:
                System.out.println("Choose hotel category");
                System.out.println("*****************");
                for (int i = 0; i < HotelCategories.length; i++) {
                    System.out.println(i + 1 + " " + HotelCategories[i] + " " + HotelPrices[i]);
                }
                Scanner sc1 = new Scanner(System.in);
                int choice1 = sc1.nextInt();
                for (int i = 0; i < HotelPrices.length; i++) {
                    if (choice1 == i + 1) {
                        System.out.println(HotelPrices[i]);
                        System.out.println("Your Hotel has been booked successfully");
                        System.out.println("Total amount to be paid is " + HotelPrices[i]);
                    }
                }
                System.out.println("You booked: " + HotelCategories[choice1 - 1] + " " + HotelPrices[choice1 - 1]);

                break;
            case 3:
                System.out.println("Choose an Uber category");
                System.out.println("*****************");
                for (int i = 0; i < UberCategories.length; i++) {
                    System.out.println(i + 1 + " " + UberCategories[i] + " " + UberPrices[i]);
                }
                Scanner sc3 = new Scanner(System.in);
                int choice3 = sc3.nextInt();
                for (int i = 0; i < UberPrices.length; i++) {
                    if (choice3 == i + 1) {
                        System.out.println(UberPrices[i]);
                        System.out.println("Your Uber has been booked successfully");
                        System.out.println("Total amount to be paid is " + UberPrices[i]);
                    }
                }
                System.out.println("You booked: " + UberCategories[choice3 - 1] + " " + UberPrices[choice3 - 1]);

                break;
            default:
                System.out.println("Invalid choice");
                break;

        }
    }

    public void displayPrices(int choice) {
        for (int i = 0; i < TicketPrices.length; i++) {
            if (choice == i + 1) {
                System.out.println(TicketPrices[i]);

            }
        }
    }

}
