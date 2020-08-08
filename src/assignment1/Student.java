package assignment1;



public class Student {
	private String rollno;
	private int age;
	public Student(String rollno,int age) {
		this.rollno=rollno;
		this.age=age;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
      public int hashCode() {
		int hash=rollno.hashCode();
		return hash;
		
		
	}
	
	
	@Override
	
	  public boolean equals(Object argument) {
		if(this==argument)
		{
			return true;
		}
		if(argument==null ||!(argument instanceof Student)) {
			return false;
		}
		Student that=(Student)argument;
		boolean equals=this.rollno.equals(that.rollno);
		return equals;
		

		
		

	}
	

}
