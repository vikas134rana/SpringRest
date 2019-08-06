package springrest.demo.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import springrest.demo.entity.Address;
import springrest.demo.entity.Employee;

public class TestEmployeeJackson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		// READ (JSON to POJO)
		Employee employee = mapper.readValue(new File("src/main/resources/data/employee.json"), Employee.class);
		System.out.println(employee);

		// Write (POJO to JSON)
		Employee newEmployee = new Employee("Aman", "Singh", 22, 25000, new Address("Katwaria", "Delhi", 110016, "India"), new String[] { "Travel", "Movies" });
		mapper.writeValue(new File("src/main/resources/data/new_employee.json"), newEmployee);
	}

}
