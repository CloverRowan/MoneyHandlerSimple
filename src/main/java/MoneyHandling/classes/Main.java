package MoneyHandling.classes;
import java.util.Scanner;
/*
that computes the total amount of money you are depositing in your bank account.
Your program does this by asking you to first enter the number and amount of each check you are depositing,
and then it asks you to enter the type of cash bills being deposited and how many of each type,
also the types of coins being deposited and the number of each coin type.
 */
public class Main
{
    public static void main(String[] args)
    {
         UserInputHandling input1 = new UserInputHandling();
         Scanner userInputMain = new Scanner(System.in);
         System.out.println("Welcome User, please select the type of currency you'd like to deposit.\n Options: Checks, Cash, Coins.\n");
         String monType = userInputMain.nextLine() ;
         switch(monType.toLowerCase())
         {
             case"checks":
                 input1.setCheckValue();
                 input1.setCheckAmount();

             case "cash":
                 input1.setCashValue();
                 input1.setCashAmount();

             case "coins":
                 input1.setCoinValue();
                 input1.setCoinAmount();

             case "total":
                 double total = (input1.getCashValue() * input1.getCashAmount()) + (input1.getCheckValue()* input1.getCheckCount()) + (input1.getCoinValue()* input1.getCoinAmount());
                 System.out.println("Total Amount deposited is " + total + "$");
             default:
                 System.out.println("Program closing..\n Thank you, Have a good day.\n");
                 System.exit(0);
                 break;

         }
    }
}