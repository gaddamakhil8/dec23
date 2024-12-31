package dec23;

class stu{
	int rollno;
	String Name;
	int fee;
	String college_name,Dept;
	@Override
	public String toString() {
		return "stu [rollno=" + rollno + ", Name=" + Name + ", fee=" + fee + ", college_name=" + college_name
				+ ", Dept=" + Dept + "]";
	}
	public stu(int rollno, String name, int fee, String college_name, String dept) {
		super();
		this.rollno = rollno;
		Name = name;
		this.fee = fee;
		this.college_name = college_name;
		Dept = dept;
	}
	
	
}

public class student {

	public static void main(String[] args) {
		stu st =new stu(12,"sssf",20000,"stprt","aids");		
System.out.println(st);
	}

}
