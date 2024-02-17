package Task;
import java.util.*;
class ATM  
{
private double b;
public ATM(double bb) 
{
this.b = bb;
}
public double getBalance() 
{
return b;
}
public void deposit(double a)
{
b = b + a;
}
public boolean withdraw(double a)
{
if (a <= b) 
{
b = b - a;
return true;
}
return false;
}
}
class ATMBanking 
{
private ATM acc;
public ATMBanking(ATM acc)
{
this.acc = acc;
}
public void displayMenu() 
{
System.out.println("ATM Menu :");
System.out.println("1. Check Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Exit");
System.out.println("Enter Your Choice");
}
public void checkBalance()
{
System.out.println("Your Balance Is : $ " + acc.getBalance());
}
public void deposit(double a) 
{
acc.deposit(a);
System.out.println("$ " + a + " deposited successfully");
}
public void withdraw(double a) 
{
if (acc.withdraw(a)) 
{
System.out.println("$ " + a + " withdrawn successfully");
} else
System.out.println("Insufficient Balance");
}
}
public class Banking 
{
public static void main(String args[])
{
Scanner ob = new Scanner(System.in);
System.out.println("Enter Initial Balance");
double in = ob.nextDouble();
ATM bc = new ATM(in);
ATMBanking as = new ATMBanking(bc);
int ch;
do 
{
as.displayMenu();
ch = ob.nextInt();
switch (ch)
{
case 1:
    as.checkBalance();
    break;
case 2:
    System.out.print("Enter Deposit Amount"+"\t");
    double da = ob.nextDouble();
    as.deposit(da);
    break;
case 3:
    System.out.print("Enter Withdrawal Amount"+"\t");
    double wa = ob.nextDouble();
    as.withdraw(wa);
    break;
case 4:
    System.out.print("Thank You For Using Atm");
    break;
default:
    System.out.print("Invalid Choice! Please Choose A Valid Option");
}
}
while (ch != 4);
}
}
