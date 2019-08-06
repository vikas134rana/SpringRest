package springrest.demo.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import springrest.demo.entity.Student;

public class TestStudentJackson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		// READ (JSON to POJO)
		Student student = mapper.readValue(new File("src/main/resources/data/student.json"), Student.class);
		System.out.println(student);

		// WRITE (POJO to JSON)
		Student newStudent = new Student(101, "Aman", 22, "Delhi");
		mapper.writeValue(new File("src/main/resources/data/new_student.json"), newStudent);
	}

}
