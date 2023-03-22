import java.util.Scanner;
class Area1{
float pi=3.14f;	
float radius;
float base_triangle;	
float hight_triangle;
float length_rectangle;
float hight_rectangle;
float side_squre;
float area;
void circul_area1(){
	area=pi*radius*radius;
	System.out.println("Area Of Circule="+area+" unit");
}
void triangle_area1(){
	area=0.5f*base_triangle*hight_triangle;
	System.out.println("Area Of Triangle="+area+" unit");

}
void rectangle_area1(){
	 area=length_rectangle*hight_rectangle;
	 System.out.println("Area Of Rectangle="+area+" unit");
}
void squre_area1(){
     area=side_squre*side_squre;
	 System.out.println("Area Of Squre="+area+" unit");
}
public static void main(String args[])
{
	Area1 sc1=new Area1();
	System.out.println("Which Area Do You Want To Find....");
    System.out.println("1)  Circule");
    System.out.println("2)  Triangle");
    System.out.println("3)  Rectangle");
    System.out.println("4)  Squre"); 
	System.out.println("Enter Your Choise...");
    Scanner sc2=new Scanner(System.in);
    int choise=sc2.nextInt();
 switch(choise)
 {
	 case 1:
	        System.out.println("Enter Radius Of Circule");
	        sc1.radius=sc2.nextFloat();
	        sc1.circul_area1();
	        break;   
	 case 2:
	        System.out.println("Enter Base of Triangle--");
	        sc1.base_triangle=sc2.nextFloat();
	        System.out.println("Enter Hight of Triangle");
	        sc1.hight_triangle=sc2.nextFloat();
	        sc1.triangle_area1();break;
	 case 3:
	       System.out.println("Enter Length of Rectangle ");
	       sc1.length_rectangle=sc2.nextFloat();
	       System.out.println("Enter Hight of Rectangle");
	       sc1.hight_rectangle=sc2.nextFloat();
	       sc1.rectangle_area1();break;
	 case 4:
	       System.out.println("Enter Length of Squre ");
	       sc1.side_squre=sc2.nextFloat();
	       sc1.squre_area1();break;
    default:
	       System.out.println("Wrong Choice Error...");break;	 
 }
	
}

}