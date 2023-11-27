package Codingpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{
	private int id;
	
	private String name;
	
	private Double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
//	@Override
//    public int compareTo(Employee p) {
////        if(id==p.id)
////        	return 0;
////        else if(id>p.id)
////        	return 1;
////        else
////            return -1;
//		return (this.id-p.id);
//    }
	
	public int compareTo(Employee o) {
        return o.name.compareTo(this.name) + (o.salary.compareTo(this.salary));
                    
 }
}

public class EmployeeExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(4,"kiran",27878.00));
		emp.add(new Employee(5,"hemanth",27878.00));
		emp.add(new Employee(1,"sai",55000.00));
		emp.add(new Employee(3,"Gopu",52000.00));
		emp.add(new Employee(2,"madhu",27878.00));
		
		System.out.println("Before sorting:"+"\n"+ emp);
		
		Collections.sort(emp);
		
		System.out.println("After sorting using comparable:"+emp);
		
	}

}
