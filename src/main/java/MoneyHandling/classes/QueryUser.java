package MoneyHandling.classes;

import java.util.Scanner;

public class QueryUser
{
    public void qUser() {
        UserInputHandling input1 = new UserInputHandling();
        Scanner userInputMain = new Scanner(System.in);

        System.out.println("Welcome User, please select the type of currency you'd like to deposit.\n Options: Checks, Cash, Coins, Close.\n");

        String monType = userInputMain.nextLine();


        switch (monType.toLowerCase()) {
            case "checks":
                input1.setCheckValue();
                input1.setCheckAmount();

            case "cash":
                input1.setCashValue();
                input1.setCashAmount();

            case "coins":
                input1.setCoinValue();
                input1.setCoinAmount();

            case "total":

                double total = (input1.getCashValue() * input1.getCashAmount()) + (input1.getCheckValue() * input1.getCheckCount()) + (input1.getCoinValue() * input1.getCoinAmount());
                System.out.println("Total Amount deposited is " + total + "$");
                break;

            case "close":
                System.out.println("Program closing..\n Thank you, Have a good day.\n");
                System.exit(0);
                break;

            default:
                System.out.println("Term not recognized,try again.\n");
                break;
        }
    }

}
