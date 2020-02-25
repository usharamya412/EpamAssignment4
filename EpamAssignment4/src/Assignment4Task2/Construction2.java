package Assignment4Task2;

import java.util.Scanner;

public class Construction2 {
	public static void main(String[] args) {
		Construction obj=new Construction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area of the house");
		double feet=sc.nextDouble();
		System.out.println("1.StandardMaterials");
		System.out.println("2.AboveStandardMaterials");
		System.out.println("3.HighStandardMaterials");
		System.out.println("4.HighStandardMaterials and Fully Automated House");
		int op=sc.nextInt();
		double answer = 0;
		switch(op){
		case 1:answer=obj.StandardMaterials(feet);
		break;
		case 2:answer=obj.AboveStandardMaterials(feet);
		break;
		case 3:answer=obj.HighStandardMaterials(feet);
		break;		
		case 4:answer=obj.FullyStandardMaterials(feet);
		break;
		default:System.out.println("Error");
		}
		System.out.println("The total Construction cost is:"+answer);	
	}
}
