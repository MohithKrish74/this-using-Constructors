package com.thiskeyword;
class BankDetails
{
    String Name;
    int Balance;
    Boolean recent_deposit;
    public BankDetails()
    {
        Name="Ram";
        Balance=5000;
        recent_deposit=true;
        System.out.println(Name+" has balance of Rupees "+Balance+" and his recent deposit was successful "+recent_deposit);

    }
    public BankDetails(String name)
    {
        this();

    }
}

public class ThisUsingConstructor
{
    public static void main(String[] args)
    {
        BankDetails obj = new BankDetails("Ram");
    }
}
