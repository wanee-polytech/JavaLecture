package kr.ac.kopo.day10.project.project10;

public class Student extends Person{

	int id;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int id) {
		this.setName(name);
		this.setAge(age);
		this.setId(id);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public void print() {
		System.out.printf("이   름 : %-5s 나 이 : %-5d 학      번 : %-5d\n", getName(), getAge(), getId() );
	}
}
