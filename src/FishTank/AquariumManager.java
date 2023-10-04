package FishTank;

import java.util.Scanner;

public class AquariumManager {
    public static void main(String[] args) {
        new AquariumManager().run();
    }
    public void run(){
        Scanner in = new Scanner(System.in);
        Aquarium aquarium = new Aquarium("Diana's Akvarium!");
        while (true) {
            System.out.println("to choose one of the options from the menu" +
                    " you should enter the number that stands by the side of the option");
            System.out.println("menu:");
            System.out.println("1.Change water" +
                    "\n" + "2. Feed the fish" +
                    "\n" + "3. Check the fish health" +
                    "\n" + "4. Check the water quality" +
                    "\n"  + "5. Exit"  );

            int menuChoice = in.nextInt();
            switch (menuChoice) {
                case 1:
                    System.out.println("Enter the date for water change(dd-mm-yyyy)");
                    String waterChangeDate = in.nextLine();
                    System.out.println("enter the commentary");
                    String waterChangeNote = in.nextLine();
                    aquarium.ChangeWater(waterChangeDate, waterChangeNote);
                    break;
                case 2:
                    aquarium.feedFish(3);
                    System.out.println("the fish were fed during 3 days");
                    break;
                case 3:
                    aquarium.checkFishHealth();
                    break;
                case 4:
                    Fish fish=new Fish();
                    aquarium.addFish(fish);
                    break;
                case 5:
                    System.out.println("What is the water quality (1. PERFECT,2. GOOD,3. OKAY,4. BAD)");
                    String waterQuality = in.nextLine();
                    break;
                case 6:
                    System.out.println("The program shuts down . . .");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect input, choose on of the options from menu");
            }
        }
    }
}
