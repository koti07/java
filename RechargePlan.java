package MOBILE;
import java.util.*;
import java.lang.*;
public class RechargePlan
{
 int[] plan = new int[20];
 Scanner sc = new Scanner(System.in);
 int i,choice,p;
 public int Plans()
 {
 plan[0]=100;
 plan[1]=200;
 plan[2]=300;
 plan[3]=400;
 plan[4]=500;
 plan[5]=600;
 plan[6]=120;
 plan[7]=90;
 System.out.println("Available plans:");
 for(i=0;i<8;i++)
 {
 System.out.println("\t"+(i+1)+" "+plan[i]+"$");
 }
 System.out.println("Select the plan:");
 choice=sc.nextInt();
 switch(choice)
 {
 
 case 1:
 p=plan[0];
 break;
case 2:
 p=plan[1];
 break;
 case 3:
 p=plan[2];
 break;
 case 4:
 p=plan[3];
 break;
 case 5:
 p=plan[4];
 break;
 case 6:
 p=plan[5];
 break;
 case 7:
 p=plan[6];
 break;
 default:
 System.out.println("Wrong choice..!");
 }
 return p;
 }
}