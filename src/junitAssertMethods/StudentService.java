package junitAssertMethods;//method for assertEquals test of an object
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentService {
	
	private List<Student> listOfStudents = new ArrayList<>();
	
	public void addStudent(Student student) {
		listOfStudents.add(student);
	}	
	
	public List<Student> students(){
		return Collections.unmodifiableList(listOfStudents);
	}
	
	public Student getStudentById(String studentId) {
		for(Student student  : listOfStudents) {
			if(studentId.equals(student.getStudentId())) {
				return student;
			}
		}
		return null;
	}
	
	
}

