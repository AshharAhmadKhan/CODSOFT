package Task;
import java.util.*;
import java.util.Random;
public class NumberGame {
public static void main(String args[])
{
Scanner ob = new Scanner(System.in);
Random oc = new Random();
int min=1;
int max=100;
int al=5;
int s=0;
System.out.println("Welcome To The Number Game");
do
{
int rn =oc.nextInt(max-min+1)+min;
System.out.println("A Random Number Has Been Generated Between"+min+" and "+max+" Time To Guess It ");
for(int i=1;i<=al;i++)
{
System.out.println("Attempt "+i+"/"+al+" : Enter Your Guess: ");
int g =ob.nextInt();
if(g==rn)
{
System.out.println("Congratulations! You Have Guessed The Number Correctly");
s++;
break;
}
else if(g<rn)
	System.out.println("Too Low! Try Again.");
else
	System.out.println("Too High! Try Again");
if(i==al)
{
	System.out.println("You Have Run Out Of Attempts! The Correct Answer Is "+rn);
System.out.println("Better Luck Next Time");
}
}
System.out.println("Do You Want To Play Again?(Yes/No)");
String p=ob.next();
if(!p.equalsIgnoreCase("Yes"))
	break;
}
while(true);
System.out.println("Thanks For Playing! Your Final Score Is "+s);
ob.close();
}
}