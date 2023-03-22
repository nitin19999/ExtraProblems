import java.util.Scanner;
class Area{
Scanner sc1=new Scanner(System.in);
void circul_area(){
	float pi=3.14f;
	System.out.println("Enter Radius Of Circule");
	float radius=sc1.nextFloat();
	float area=pi*radius*radius;
	System.out.println("Area Of Circule="+area+" unit");	
}
void triangle_area(){
	System.out.println("Enter Base of Triangle--");
	float base=sc1.nextFloat();
	System.out.println("Enter Hight of Triangle");
	float hight=sc1.nextFloat();
	float area=0.5f*base*hight;
	System.out.println("Area Of Triangle="+area+" unit");
}
void rectangle_area(){
	System.out.println("Enter Length of Rectangle ");
	float length=sc1.nextFloat();
	System.out.println("Enter Hight of Rectangle");
	float hight=sc1.nextFloat();
	float area=length*hight;
	System.out.println("Area Of Rectangle="+area+" unit");
	
}
void squre_area(){
	System.out.println("Enter Length of Squre ");
	float side=sc1.nextFloat();
	float area=side*side;
	System.out.println("Area Of Squre="+area+" unit");
}
public static void main(String args[])
{
	Area sc=new Area();
	System.out.println("Which Area Do You Want To Find....");
    System.out.println("1)  Circule");
    System.out.println("2)  Triangle");
    System.out.println("3)  Rectangle");
    System.out.println("4)  Squre"); 
	System.out.println("Enter Your Choise...");
    Scanner sc1=new Scanner(System.in);
    int choise=sc1.nextInt();
 switch(choise)
 {
	 case 1:sc.circul_area();break;
	 case 2:sc.triangle_area();break;
	 case 3:sc.rectangle_area();break;
	 case 4:sc.squre_area();break;
    default:System.out.println("Wrong Choice Error...");break;	 
 }
	
}

}