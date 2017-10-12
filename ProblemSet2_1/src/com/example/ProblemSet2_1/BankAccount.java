package com.example.ProblemSet2_1;

public class BankAccount {
    private String accnum;
    private double balance;
    private Person customer = new Person();


    public void setAccnum(String accnum)
    {
        this.accnum = accnum;
    }//End of setAccnum

    public String getAccnum()
    {
        return accnum;
    }//End of getAccnum

    public void setBalance(double balance)
    {
        this.balance = balance;
    }//End of setBalance

    public double getBalance()
    {
        return balance;
    }//End of getBalance

    public void setCustomer(Person customer)
    {
        this.customer = customer;
    }//End of set Customer

    public Person getCustomer()
    {
        return customer;
    }//End of getCustomer

    public String toString()
    {
        return String.format("Account Number: %s \nBalance: €%-5.2f \naccount Holder: %s", accnum, balance, customer.getName());
    }//End of toString

    public BankAccount()
    {
        this("", 0f, null);
    }

    public BankAccount(String accnum, double balance, Person customer)
    {
        setAccnum(accnum);
        setBalance(balance);
        setCustomer(customer);
    }//End of BankAccount
}//End of BankAccount Class
