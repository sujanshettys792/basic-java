import java.util.*;
class pay
{
	String name;
	double da,hra,pf,grosssal,netsal;
	pay(String s,double s)
	{
		name=n;
		da=0;
		hra=0;
		pf=0
		grosssal=0;
		netsal=0;
	}
		void calculate()
	{
		da=salary*15%/100;
		hra=salary*15%/100;
		pf=salary*12%/100;
		grosssal=salary+da+hra;
		netsal=grosssal-pf;
	}
	void display()
	{
		System.out.println("employee name="+name");
		System.out.println("employee salary="+salary");
		System.out.println("dearness aollownes="+da");
		System.out.println("house rent aollowances="+hra");
		System.out.println("provident fund="+pf");
		System.out.println("grosssal="+grosssal");
		System.out.println("netsal="+netsal");
	}
		class basis
{
public static void main(String arg[])
Scanner Sc=new Scanner(System.in);
System.out.println('enter employee name");
String name=Sc.nextLine();
System.out.println=("enter the employye name");
String name=Sc.nextLine()(;
pay ob=new pay(pay,salary)
ob.calculate();
ob.display();
}
}