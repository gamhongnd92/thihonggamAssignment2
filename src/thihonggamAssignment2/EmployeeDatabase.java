package thihonggamAssignment2;

import java.util.Scanner;

public class EmployeeDatabase {

	public static void main(String[] args) {
		Employee[] empArray = new Employee[25];
		Scanner sc = new Scanner(System.in);
		String userOption = "";
		int count = 0;
	
		do {
			
			System.out.println("Do you want to (A)dd, (D)elete, or (C)hange or (Q)uit >> ");
			userOption = sc.nextLine();
			String userSelected = userOption.toLowerCase();
			
			switch (userSelected) {
			case "a":
				
				if(count<25)
				{
					System.out.println("Enter Employee ID >> ");
					int newEmpId = sc.nextInt();
					System.out.println("Enter salary >> ");
					double newEmpSal = sc.nextDouble();

					Employee newEmployee = new Employee(newEmpId, newEmpSal);					
					
					empArray[count] = newEmployee;
										
					for(int i=0; i<count; i++)
					{
						if(newEmpId==empArray[i].getID())
						{
							System.out.println("the id has existed");						
							count--;
						}						
					}				
										
					count++;
					
					
					for(int i=0; i<count; i++)
					{			
						Employee temp = new Employee(0,0);
						for(int j=0; j<count-1;j++)
						{
							if(empArray[j].getID()>empArray[j+1].getID())
							{
								temp = empArray[j];
								empArray[j] = empArray[j+1];
								empArray[j+1] = temp;
							}							
						}						
					}
					System.out.println("The current database is >> ");
					for (int i = 0; i < count; i++) {				
						
						System.out.println("ID #" + empArray[i].getID() + " $" + empArray[i].getSalary());
					}
								
					
				
					sc.nextLine();
					
				}
				else
				{
					System.out.println("database is full");
				}
				
				break;

			case "d":
				if(count==0)
				{
					System.out.println("Database is empty cannot delete ");
				}
				else {
					System.out.println("Enter ID to delete >> ");
					int deleteID = sc.nextInt();


					for(int i=0; i<count; i++)
					{
						if(deleteID==empArray[i].getID())
						{						
							for(int j = i; j<count-1;j++)
							{
								empArray[j]=empArray[j+1];
							}
							
							count--;
						}
						else {
							System.out.println("The id not match with database ");
						}
						
											
					}
					System.out.println("The current database is >> ");
					for(int i=0; i<count; i++)
					{
						System.out.println("ID #" + empArray[i].getID() + " $" + empArray[i].getSalary());
					}
					sc.nextLine();
				}
				
				break;

			case "c":
				if(count==0)
				{
					System.out.println("Database is empty cannot change data");
				}
				else
				{
					System.out.println("Enter ID to change >> ");
					int changeID= sc.nextInt();
					System.out.println("Enter the salary >> ");
					
					
					for(int i=0; i<count; i++)
					{
						if(changeID==empArray[i].getID())
						{
							double changeSalary = sc.nextDouble();
							empArray[i]= new Employee(changeID,changeSalary);									
						}
						else 
						{
							System.out.println("The id not match with database ");
						}
			
					}
					
					System.out.println("The current database is >> ");
					for(int i=0; i<count; i++)
					{
						System.out.println("ID #" + empArray[i].getID() + " $" + empArray[i].getSalary());
					}			
					
					sc.nextLine();
				}
				
				break;
				
					
			
			}


		} while (!userOption.toLowerCase().equals("q"));
		

//		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
