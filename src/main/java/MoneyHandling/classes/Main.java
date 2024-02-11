package MoneyHandling.classes;
import java.util.Scanner;
/**
*that computes the total amount of money you are depositing in your bank account.
*Your program does this by asking you to first enter the number and amount of each check you are depositing,
*and then it asks you to enter the type of cash bills being deposited and how many of each type,
*also the types of coins being deposited and the number of each coin type.
 */

public class Main
{
    public static void main(String[] args)
    {
        QueryUser input = new QueryUser();
        while (true)
        {
            input.qUser();
        }
    }
}
   // }
//}