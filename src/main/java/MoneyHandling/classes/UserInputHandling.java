package MoneyHandling.classes;

import java.util.Scanner;

public class UserInputHandling
{
    public Scanner userIn = new Scanner(System.in);
    private double checkValue;
    private double checkAmount;
    private double cashValue;
    private double cashAmount;
    private double coinValue;
    private double coinAmount;

    public double inputCheck() {
        String temp = userIn.nextLine();
        double doubleConvert = 0;
        try {
                doubleConvert = Double.parseDouble(temp);
                return doubleConvert;
            }  catch(Exception e)
                {
                System.out.println("An error has occurred, numerical value required.");
                QueryUser reRun = new QueryUser();
                reRun.qUser();
                }

       return doubleConvert;
    }

    public void setCheckValue()
    {
        System.out.println("Please enter the value of the check you'd like to deposit.\n");
        checkValue = inputCheck();
    }

    public void setCheckAmount()
    {
        System.out.println("Please enter the amount of "+ getCheckValue() + "$" +" checks you'd would like to deposit.\n");
        checkAmount = inputCheck();
    }

    public void setCashValue()
    {
        System.out.println("Please enter the value of the Cash bills you'd would like to deposit.\n");
        //String temp =  userIn.nextLine();
        cashValue = inputCheck();
    }

    public void setCashAmount()
    {
        System.out.println("Please enter the amount of " + getCashValue() + "$" + " bills you'd would like to deposit.\n");
        //String temp =  userIn.nextLine();
        cashAmount = inputCheck();
    }

    public void setCoinValue()
    {
        System.out.println("Please enter the value of any coins you'd would like to deposit.\n");
        //String temp = userIn.nextLine();
        coinValue = inputCheck();
    }

    public void setCoinAmount()
    {
        System.out.println("Please enter the amount of " + getCoinValue() + "c" + " coins you'd would like to deposit.\n");
        //String temp = userIn.nextLine();
        coinAmount = inputCheck();
    }

    public double getCheckValue() {return checkValue;}

    public double getCheckCount() {return checkAmount;}

    public double getCashValue(){return cashValue;}

    public double getCashAmount(){return cashAmount;}

    public double getCoinValue(){return coinValue;}

    public double getCoinAmount(){return coinAmount;}


}
