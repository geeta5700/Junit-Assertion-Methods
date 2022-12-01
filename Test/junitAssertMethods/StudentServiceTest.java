package junitAssertMethods;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTest {
StudentService studentService = new StudentService();
	
	@Test
	@DisplayName("Here we are comparing objects with positive test case")
	public void assertObjectEqualsTest1() {
		
		Student student1 = new Student("101ACE", "Geeta", "Conestoga College");
		Student student2 = new Student("102BCD", "Anjali", "Seneca College");
		
		studentService.addStudent(student1);
		studentService.addStudent(student2);
		
		Student conestogaStudent  = studentService.getStudentById("101ACE");
		
		assertEquals("101ACE", conestogaStudent.getStudentId(),()-> "Test Passed as Student ID(objects) matched");
		assertEquals("Geeta", conestogaStudent.getName(), ()-> "Test Passed as Student name(objects) matched!");
	}
	
	@Test
	@DisplayName("Here we are comparing objects with negative test case")
	public void assertObjectEqualsTest2() {
		
		
		Student student1 = new Student("101ACE", "Geeta", "Conestoga College");
		Student student2 = new Student("102BCD", "Anjali", "Seneca College");
		
		studentService.addStudent(student1);
		studentService.addStudent(student2);
		
		Student conestogaStudent = studentService.getStudentById("101ACE");
		
		assertEquals("101AC", conestogaStudent.getStudentId(), ()->"Test Failed as Student ID(objects) didn't match!");
		assertEquals("Seeta", conestogaStudent.getName(), ()->"Test Failed as Student name(objects) didn't match!");
	}
}

