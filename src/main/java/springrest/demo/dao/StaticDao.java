package springrest.demo.dao;

import java.util.ArrayList;
import java.util.List;

import springrest.demo.entity.Student;

public class StaticDao {

	public static List<Student> students = new ArrayList<Student>();
	
	static{
		students.add(new Student(1, "Vikas Rana", 26, "Delhi"));
		students.add(new Student(2, "Aman Singh", 22, "Agra"));
		students.add(new Student(3, "MS Dhoni", 40, "Chennai"));
	}
	
}
