package Operations;

import DB.Records;
import DB.Student;

public class Logics implements OperationFunction {

	@Override
	public void add(Student s) {
		// TODO Auto-generated method stub
	 Records.A.add(s);
	}

	@Override
	public void delete(int rollno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int cont, String em, int rollno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchRollNo(int rollno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchname(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchcity(String city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchstd(int std) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dsiplay() {
		int i=0;
		for(Student s: Records.A)
		{
			System.out.println("\n\n # "+i);i++;
			System.out.println("\nRollNo : "+s.getRollNo());
			System.out.println("Name : "+s.getName());
			System.out.println("Contact : "+s.getContactNo());
			System.out.println("Email : "+s.getEmail());
			System.out.println("Standard : "+s.getStandard());
			System.out.println("City : "+s.getCity());
		}
	}

}
