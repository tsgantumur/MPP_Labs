package Lab7.prob1.partB;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
	public boolean equals(Object e) {
		if(e == this)
			return true;
		if(!(e instanceof Employee))
			return false;
		
		Employee e2 = (Employee) e;
		
		return name == e2.name && salary == e2.salary;
		//return e.name.equals(name) && e.salary == salary;
	}
	
}
