package Operations;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import DB.Records;
import DB.Student;

public class Transaction {
   
	
	Student st;
	
	
	void enterRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number");
		int r =sc.nextInt();
		System.out.println("Enter Name");
		
		String nm = sc.next();
		System.out.println("Enter Contact no");
		long ph =sc.nextLong();
		System.out.println("Enter Enter City");
		
		String ct =sc.next();
		System.out.println("Enter Standerd");
		int sd =sc.nextInt();
		System.out.println("Enter Email");
		
		String em =sc.next();
		
		st= new Student(r,nm,ph,ct,em,sd);
	
		Logics l = new Logics();
		l.add(st);
	
	}
	
	
	
	public static void main(String... g)
	{
		Scanner sc = new Scanner(System.in);
		int option1;
		Transaction obj = new Transaction();
		String choice="";
		while(!(choice.equals("N") || choice.equals("n")))
		{
			
		MenuOption mu =new MenuOption();
		option1 = mu.mainMenu();
		
		switch(option1)
		{
		case 1:
			obj.enterRecord();
			break;
			
		case 2:
			int op =mu.searchmenu();
			Student s;
			switch(op)
			{
			case 1 :
				System.out.println("Enter roll num to Search");
				int rn = sc.nextInt();
				 s = Records.A.stream().filter(m->m.getRollNo() == rn).collect(Collectors.toList()).get(0);
				System.out.println(s);
				break;
				
			case 2 :
				System.out.println("Enter Name to Search");
				String nm = sc.next();
				System.out.println(nm);
				s = (Student) Records.A.stream().filter(m->m.getName().equals(nm)).collect(Collectors.toList()).get(0);
				System.out.println(s);
				break;
				
			case 3 :
				System.out.println("Enter the city to search : ");
			    String city = sc.next();
			    List<Object> L1 = Records.A.stream().filter(m->m.getCity().equals(city)).collect(Collectors.toList());
			    L1.forEach(m->{System.out.println(m);});
			    break;
			
			case 4 :
				System.out.println("Enter City to Search");
				int std = sc.nextInt();
				s = Records.A.stream().filter(m->m.getStandard() == std).collect(Collectors.toList()).get(0);
				System.out.println(s);
				break;
			
			case 5 :
				break;
			}
		case 3:
	
					System.out.println("Enter roll num to Search & Update");
					int rn = sc.nextInt();
					 s = Records.A.stream().filter(m->m.getRollNo() == rn).collect(Collectors.toList()).get(0);
			         
					int index = Records.A.indexOf(s);
					System.out.println("Enter Contact to update ");
					
					long con = sc.nextLong();
					
					Records.A.get(index).setContactNo(con);
					System.out.println("New Contact Updated ");
			break;	
			
		case 4:
			System.out.println("Enter the roll no to search and delete : ");
			int q = sc.nextInt();
			
			s=Records.A.stream().filter(m->m.getRollNo() == q).collect(Collectors.toList()).get(0);
			int in = Records.A.indexOf(s);
			
			Records.A.remove(in);
			System.out.println("Record is removed successfully ! ");
			
			break;
			
		case 5:
			Logics ob = new Logics();
			ob.dsiplay();
			break;
			
		case 6:
			System.exit(0);
			
	   default:
		   System.out.println("Invalid Choice");
		   break;
			
		}
		System.out.println("\n Do you Want to Continue");
		choice= sc.next();
		
		}
		System.out.println("\n Succesfully Exit");
	}
}
