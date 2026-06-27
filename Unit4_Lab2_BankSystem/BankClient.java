// On my honor as a student, I, Brian Soltani, have neither given nor recieved unauthorized help on this assignment


import java.text.*;
public class BankClient
{
   private String name, account, pin, balanceAsMoney;
   private double balance;
   
   public BankClient(String name, String pin, double balance)
   {
   
      this.name = name;
      this.pin = pin;
      this.balance = balance;
      setBalanceAsMoney();
      createAccountNum();
   
   }
   
   public BankClient(String name, String pin)
   {
      
      this.name = name;
      this.pin = pin;
      balance = 0;
      setBalanceAsMoney();
      createAccountNum();
      
   }
   
   public void createAccountNum()
   {
      account = String.valueOf((int)(Math.random() * 1000000)); //generates a random # between 0 and 999999 and converts to String
      while (account.length() < 6)
      { //in case a 6 digit account number wasn't generated
         account = "0" + account;
      }

   }
   
   public void setBalanceAsMoney()
   {
      balanceAsMoney = NumberFormat.getCurrencyInstance().format(balance);
   }
   
   public String getBalance()
   {
      return balanceAsMoney;
   }
   
   public String getAccount()
   {
      return account;
   }
   
   public boolean checkAccount(String tester)
   {
      if (account == tester)
      {
         return true;
      }
      return false;
   }
   
   public boolean pinCheck(String tester)
   {
      if (pin == tester)
      {
         return true;
      }
      return false;
   }
   
   public void deposite(double adder)
   {
      balance += adder;
      setBalanceAsMoney();
   }
   
   public boolean withdraw(double take)
   {
      if (balance > take)
      {
         balance -= take;
         setBalanceAsMoney();
         return true;
      }
      return false;
   }  
   
   @Override
   public String toString()
   {
      return "Account: " + account + "\nName: " + name + "\nBalance: " + balanceAsMoney;
   }
   
} // End of class