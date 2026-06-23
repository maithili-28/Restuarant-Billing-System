import java.util.*;

class Restuarant_Billing_System{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       System.out.println("Welcome to Cravingzzz "+name);
       System.out.println("Here's our tempting menu! ");

        System.out.println("-----------------Menu-----------------");
        System.out.println("1. Noodles                         120");
        System.out.println("2. Pizza                           300");
        System.out.println("3. Burger                          220");
        System.out.println("4. French Fries                    180");
        System.out.println("5. Puff                             80");
        System.out.println("6. Choco Lava                      180");
        System.out.println("7. Waffle                          360");
        System.out.println("8. Blueberry Cheese Cake           400");
        System.out.println("9. Vanilla Shake                   200");

        int total = 0;
        int quantity = 0;
        int more = 1;
        int price = 0;

        while(more == 1) {
            System.out.println("Choose the cravings u want to add to your tummy from 1 to 9");
            int craving_no = sc.nextInt();

            switch (craving_no) {
                case 1:
                    System.out.println("Noodles");
                    price = 120;
                    break;
                case 2:
                    System.out.println("Pizza");
                    price = 300;
                    break;
                case 3:
                    System.out.println("Burger");
                    price = 220;
                    break;
                case 4:
                    System.out.println("French Fries");
                    price = 180;
                    break;
                case 5:
                    System.out.println("Puff");
                    price = 80;
                    break;
                case 6:
                    System.out.println("Choco Lava");
                    price = 180;
                    break;
                case 7:
                    System.out.println("Waffle");
                    price = 360;
                    break;
                case 8:
                    System.out.println("Blueberry Cheese Cake");
                    price = 400;
                    break;
                case 9:
                    System.out.println("Vanilla Shake");
                    price = 200;
                    break;
            }

            System.out.println("Enter quantity: ");
            quantity = sc.nextInt();
            System.out.println("Quantity: " + quantity);

            System.out.println("-----------------Bill-----------------");
            total = total + (price * quantity);
            System.out.println("Total Happiness: " + total);

            System.out.println("Anything more to be added to your tummy");
            System.out.println("Choose from below options: ");
            System.out.println("1. Yes");
            System.out.println("2. No");
            more = sc.nextInt();

        }

    }
}