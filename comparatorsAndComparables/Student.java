package comparatorsAndComparables;

public class Student /*implements Comparable<Student>*/ {

	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public int compareTo(Student obj) {	// For increasing order, if current object is bigger than return 1. For decreasing order return -1.
		if(this.marks > obj.marks) return 1;	
		else if(this.marks < obj.marks) return -1;	// if you interchange -1 with 1 the order of sort will reverse.
//		return 0;
		return this.name.compareTo(obj.name);	// If the marks are same, then they will get sorted by name.
	}

}
