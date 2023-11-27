package Codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employees
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

	public Employees(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public static Comparator<Employees> Salcom=new Comparator<Employees>() {
		@Override
        public int compare(Employees e1, Employees e2) {
            return (int) (e2.getSalary() - e1.getSalary());
        }
	};
	
	public static Comparator<Employees> Ncom = new Comparator<Employees>() {

        @Override
        public int compare(Employees e1, Employees e2) {
            return e2.getName().compareTo(e1.getName());
        }
    };
}

public class EmployeeExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employees> emp=new ArrayList<>();
		emp.add(new Employees(4,"kiran",27000.00));
		emp.add(new Employees(5,"hemanth",27868.00));
		emp.add(new Employees(1,"sai",55000.00));
		emp.add(new Employees(3,"Gopu",52000.00));
		emp.add(new Employees(2,"madhu",20878.00));
		
		//System.out.println("Before sorting:"+"\n"+ emp);
		
		
//		List<Employee>list=emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
//		
//		
//		System.out.println("After sorting using comparator:"+list);
		
		//emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList()).forEach(n->System.out.println(n));
		
		Collections.sort(emp, Employees.Ncom);
		
		System.out.println(emp);
	}

}
