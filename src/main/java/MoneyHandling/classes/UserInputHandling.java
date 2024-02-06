package MoneyHandling.classes;

import java.util.Scanner;

public class UserInputHandling
{
    public Scanner userIn = new Scanner(System.in);
    private double checkValue;
    private double checkCount;
    private double cashValue;
    private double cashAmount;
    private double coinValue;
    private double coinAmount;


    public void setCheckValue()
    {
        System.out.println("Please enter the value of the check you'd like to deposit.\n");
        checkValue = userIn.nextDouble();
    }
    public void setCheckAmount()
    {
        System.out.println("Please enter the amount of "+ getCheckValue() + "$" +" checks you'd would like to deposit.\n");
        checkCount = userIn.nextDouble();
    }
    public void setCashValue()
    {
        System.out.println("Please enter the value of the Cash bills you'd would like to deposit.\n");
        cashValue = userIn.nextDouble();
    }
    public void setCashAmount()
    {
        System.out.println("Please enter the amount of " + getCashValue() + "$" + " bills you'd would like to deposit.\n");
        cashAmount = userIn.nextDouble();
    }
    public void setCoinValue()
    {
        System.out.println("Please enter the value of any coins you'd would like to deposit.\n");
        coinValue = userIn.nextDouble();
    }
    public void setCoinAmount()
    {
        System.out.println("Please enter the amount of " + getCoinValue() + "c" + " coins you'd would like to deposit.\n");
        coinAmount = userIn.nextDouble();
    }
    public double getCheckValue() {return checkValue;}
    public double getCheckCount() {return checkCount;}
    public double getCashValue(){return cashValue;}
    public double getCashAmount(){return cashAmount;}
    public double getCoinValue(){return coinValue;}
    public double getCoinAmount(){return coinAmount;}


}
