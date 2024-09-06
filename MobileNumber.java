package MOBILE;
import java.util.*;
import java.lang.*;
class JIO extends MobileNumber
{
int rp;
 int m1()
{
MOBILE.RechargePlan r1 = new MOBILE.RechargePlan();
 rp=r1.Plans();
return rp;
 }
}
class AIRTEL extends MobileNumber
{ 
int rp1;
int m2()
{
MOBILE.RechargePlan r2 = new MOBILE.RechargePlan();
rp1=r2.Plans();
return rp1;
}
}
class BSNL extends MobileNumber
{
int rp2;
int m3()
{
MOBILE.RechargePlan r3 = new MOBILE.RechargePlan();
rp2=r3.Plans();
return rp2;
}
}
class PhnoException extends Exception
{
PhnoException(String mn)
{
System.out.println(mn);
}
}
public class MobileNumber
{
String mobileNumber;
String mnumber;
int n,z;
Scanner sc =new Scanner(System.in);
public String phno() // method to number 
{
try
{
System.out.println("Enter Mobile Number: ");
mobileNumber =sc.nextLine();
if(mobileNumber.length() > 10 ||mobileNumber.length<10)
{
throw new PhnoException("Invalid Number");
}
else
{
mnumber=mobileNumber;
}
}
catch(PhnoException p)
{
System.out.println("--");
}
return mnumber;
} 
public int Simtype()
{
System.out.println("ENTER SIM TYPE.....");
System.out.println("1-->JIO");
System.out.println("2-->AIRTEL");
System.out.println("3-->BSNL");
n = sc.nextInt();
switch(n)
{
case 1:
JIO j = new JIO();
z=j.m1();
break;
case 2:
AIRTEL a = new AIRTEL();
z=a.m2();
break;
case 3:
BSNL b = new BSNL();
z=b.m3();
break;
}
return z;
}
}