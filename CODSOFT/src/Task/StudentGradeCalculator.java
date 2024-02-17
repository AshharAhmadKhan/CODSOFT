package Task;
import java.util.*;
public class StudentGradeCalculator {
public static void main(String args[])
{
Scanner ob = new Scanner(System.in);
System.out.println("Enter Name Of The Student");
String n = ob.nextLine();
System.out.println("Enter The Number Of Subjects");
int nn=ob.nextInt();
int tm=0;
System.out.println("Enter The Marks Scored In Each");
for(int i=0;i<nn;i++)
{
int a=ob.nextInt();
tm=tm+a;
}
double avg =(double)tm/nn;
String g= GradeCalculator(avg);
System.out.println("Total Marks Scored : "+tm);
System.out.println("Average Percentaged Attained : "+avg);
System.out.println("Grade Achieved : "+g);
}
public static String GradeCalculator(double avgg)
{
if(avgg>=90)
	return("A");
else if(avgg<=80)
	return("B");
else if(avgg>=70)
	return("C");
else if(avgg>=60)
	return("D");
else
	return("F");
}
}
