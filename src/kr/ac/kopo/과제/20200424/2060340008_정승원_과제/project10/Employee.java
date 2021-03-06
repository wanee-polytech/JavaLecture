package kr.ac.kopo.day10.project.project10;

public class Employee extends Person{

	private String dept;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, String dept) {
		this.setName(name);
		this.setAge(age);
		this.setDept(dept);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public void print() {
		System.out.printf("이   름 : %-5s 나 이 : %-5d 부      서 : %-5s\n", getName(), getAge(), getDept() );
	}
}
