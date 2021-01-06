package thihonggamAssignment2;

import java.util.Scanner;

public class EmployeeSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of employee: ");
		int eNums = input.nextInt();
		Employee[] empArray = new Employee[eNums];
		
		int Ids[] = new int[eNums];
		double eSalary[] = new double[eNums];
		
		for(int i=0; i<eNums;i++)
		{
			System.out.println("Please enter Id of employees number: "+(i+1));
			Ids[i]=input.nextInt();
			System.out.println("Please enter salary of employees: "+ (i+1));	
			eSalary[i]=input.nextDouble();
			Employee newEmp = new Employee(Ids[i],eSalary[i]); 
			empArray[i] = newEmp;
		}
		
		
//		
		
		input = new Scanner(System.in);
		System.out.println("Do you want to sort data in order by (I)d or by (S)alary");
		String option = input.nextLine().toLowerCase();
		Employee temp = new Employee(0,0);
		if(option.equals("s"))
		{
			for(int i =0; i<eNums-1;i++)
			{
				for(int j=0;j<eNums-1;j++)
				{
					if(empArray[j].getSalary()>empArray[j+1].getSalary())
					{
						temp = empArray[j];
						empArray[j] = empArray[j+1];
						empArray[j+1] = temp;
					}				
				}
			}
			
			for(int i=0; i<eNums;i++)
			{
				System.out.println("Employee has ID number is "+empArray[i].getID()+", has salary is "+empArray[i].getSalary());					
			}		
			
			
		}
		
		if(option.equals("i"))
		{
			
			for(int i =0; i<eNums-1;i++)
			{
				for(int j=0;j<eNums-1;j++)
				{
					if(empArray[j].getID()>empArray[j+1].getID())
					{
						temp = empArray[j];
						empArray[j] = empArray[j+1];
						empArray[j+1] = temp;
					}				
				}
			}
			
			for(int i=0; i<eNums;i++)
			{
				System.out.println("Employee has ID number is "+empArray[i].getID()+", has salary is "+empArray[i].getSalary());			
			}		
			
		}

	}

}
