import java.util.Scanner;
class Matrix{
	Matrix()
	{
		System.out.println("Welcome to Matrices...!!");
	}
public static void main(String args[])
{
	Matrix sc=new Matrix();
	Scanner sc1=new Scanner(System.in);
System.out.println("Enter the number of Rows and Column You want..");
int row=sc1.nextInt();
int column=sc1.nextInt();
int mat_1 [][]=new int[row][column];
int mat_2 [][]=new int[row][column];
System.out.println("Enter the element in First Matrices (Row wise...)");
for(int i=0;i<row;i++){
	for(int j=0;j<column;j++)
	{
		mat_1[i][j]=sc1.nextInt();
	}
  }
System.out.println("Enter the element in Second Matrices (Row wise...)");
for(int i=0;i<row;i++){
	for(int j=0;j<column;j++)
	{
		mat_2[i][j]=sc1.nextInt();
	}
 }
 System.out.println("Which Operation Do want to Perform on Matrices");
	System.out.println("1) Addition Of Two Matrices..");
	System.out.println("2) Substraction Of Two Matrices..");
	System.out.println("3) Multiplication Of Two Matrices..");
	int choise=sc1.nextInt();
	System.out.println();
	switch(choise)
	{
		case 1:
		       sc.show1(mat_1,row,column);
			   System.out.println("--(+)--");
			   sc.show2(mat_2,row,column);
			   System.out.println("--(=)--");
			   sc.sum(mat_1,mat_2,row,column);
			   break;
	    case 2:
		       sc.show1(mat_1,row,column);
			   System.out.println("--(-)--");
			   sc.show2(mat_2,row,column);
			   System.out.println("--(=)--");
			   sc.sub(mat_1,mat_2,row,column);
			   break;
	    case 3:
		       sc.show1(mat_1,row,column);
			   System.out.println("--(*)--");
			   sc.show2(mat_2,row,column);
			   System.out.println("--(=)--");
			   sc.multiplication(mat_1,mat_2,row,column);
			   break;
		default:
                System.out.println("Wrong Choise Error..!!");		
				break;
	}

}
void sum(int mat_1[][],int mat_2[][],int row,int column){
	int mat_3[][]=new int[row][column];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			mat_3[i][j]=mat_1[i][j]+mat_2[i][j];
		}
	}
	for(int i1=0;i1<row;i1++)
	{
		for(int j1=0;j1<column;j1++)
		{
			System.out.print(mat_3[i1][j1]+" ");
		}
		System.out.println();
	}
	
	
}
void sub(int mat_1[][],int mat_2[][],int row,int column){
	int mat_3[][]=new int[row][column];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			mat_3[i][j]=mat_1[i][j]-mat_2[i][j];
		}
	}
	for(int i1=0;i1<row;i1++)
	{
		for(int j1=0;j1<column;j1++)
		{
			System.out.print(mat_3[i1][j1]+" ");
		}
		System.out.println();
	}
	
	
}
void multiplication(int mat_1[][],int mat_2[][],int row,int column){
	int mat_3[][]=new int[row][column];
	int sum=0;
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
		    for(int k=0;k<row;k++)
			{
			 sum=mat_1[i][k]*mat_2[k][j]+sum;
			}	
            mat_3[i][j]=sum;
		    sum=0;			
		}
		sum=0;
	}
	for(int i1=0;i1<row;i1++)
	{
		for(int j1=0;j1<column;j1++)
		{
			System.out.print(mat_3[i1][j1]+" ");
		}
		System.out.println();
	}
	
}

void show1(int mat_1[][],int row,int column){
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			System.out.print(mat_1[i][j]+" ");
		}
		System.out.println();
	}
}
void show2(int mat_2[][],int row,int column){
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			System.out.print(mat_2[i][j]+" ");
		}
		System.out.println();
	}
}

}