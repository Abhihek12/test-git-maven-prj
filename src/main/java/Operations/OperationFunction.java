package Operations;

import DB.Student;

public interface OperationFunction {

  void add(Student s) ;
		
  void delete(int rollno) ;
	
  void update(int cont,String em,int rollno);
  
  void searchRollNo(int rollno);
  
  void searchname(String name);
  
  void searchcity(String city);
 
  void searchstd(int std);
  
  void dsiplay();
}
