package springrest.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import springrest.demo.dao.StaticDao;
import springrest.demo.entity.Student;
import springrest.demo.exceptionhandling.StudentNotFoundException;

@RestController
public class StudentController {

	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = StaticDao.students;
		return students;
	}

	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) throws StudentNotFoundException {
		List<Student> students = StaticDao.students;
		for (Student student : students) {
			if (student.getId() == id)
				return student;
		}
		throw new StudentNotFoundException("Student not found with id: " + id);
	}

	/*- @PostMapping
	public void createStatment(Student student) {
		StaticDao.students.add(student);
	}*/

}
