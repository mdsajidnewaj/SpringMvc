package com.Tas.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Tas.Entity.Student;
import com.Tas.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student>GetAllStudents(){
		return studentService.GetAllStudents();
	
}	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id){
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE )
	public void deleteStudentById(@PathVariable("id") int id){
		studentService.removeStudentById(id);
	}
	
	@RequestMapping (method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE )
	public void deleteStudentById(@RequestBody Student student){
		studentService.updateStudent(student);
	}
	
	@RequestMapping (method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public void insertStudent(@RequestBody Student student){
		this.studentService.insertStudent(student);
	}
	
	
	
}