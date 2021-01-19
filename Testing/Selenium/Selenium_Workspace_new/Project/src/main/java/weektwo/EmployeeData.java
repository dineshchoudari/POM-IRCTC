package weektwo;

public class EmployeeData {
	//Encapsulation Concept 
	private int Sssnum;
	private String Empname;
	private int EmpAge;
	
	public static void main(String[] args) {
		
		EmployeeData emp=new EmployeeData();
		
	      emp.setEmpname("Dinesh");
	      emp.setEmpAge(33);
	      emp.setSssnum(12345666);
	      
	      System.out.println("employee name is:"+emp.getEmpname());
	      System.out.println("employee age is :"+emp.getEmpAge());
		 System.out.println("employee Ssnnum is:"+emp.getSssnum());
		
	}


	public int getSssnum() {
		return Sssnum;
	}


	public void setSssnum(int sssnum) {
		Sssnum = sssnum;
	}


	public String getEmpname() {
		return Empname;
	}


	public void setEmpname(String empname) {
		Empname = empname;
	}


	public int getEmpAge() {
		return EmpAge;
	}


	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}

	
}
