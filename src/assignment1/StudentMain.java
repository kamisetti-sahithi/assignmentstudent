package assignment1;
import java.util.*;

public class StudentMain {
	public static void main(String[] args) {
		StudentMain s=new StudentMain();
		s.runApp();
		}
	
	
	Map<String,Student> map=new HashMap<String,Student>();
	Set<Student> even = new HashSet<>();
	Set<Student> odd = new LinkedHashSet<>();
	List<String> rollno=new ArrayList<>();
    
	public void runApp() {
		Student s1=new Student("1A",20);
		map.put("1A",s1);
		Student s2=new Student("1B",21);
		map.put("1B",s2);
		Student s3=new Student("1C",22);
		map.put("1C",s3);
		Student s4=new Student("1D",23);
		map.put("1D",s4);
		fun();
		
		
	}
	public void fun() {
		
		 Set<String> targetSet =map.keySet();
		 for(String str:targetSet) {
			 Student s=map.get(str);
			 int age=s.getAge();
			 String rollno=s.getRollno();
			 if((s.getAge())%2==0) {
				 even.add(s);
				 
			 }
			 else {
				 odd.add(s);
				 
			 }
			 System.out.println("age is"+s.getAge()+" "+"roll no is"+s.getRollno());
				 
			 
			 
			 
			 
		 }
		 
		 
		 
		 }
		 
		
	}
	
	
	
	

}
