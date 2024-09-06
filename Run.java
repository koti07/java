import java.lang.*;
class Run
{
public static void main(String []args)throws NullPointerException
{
String num;
int val;
MOBILE.MobileNumber m = new MOBILE.MobileNumber();
MOBILE.RechargePlan r= new MOBILE.RechargePlan();
num=m.phno();
val=m.Simtype();
System.out.println("mobile number: "+num);
System.out.println("mobile plan: "+val);
}
}
