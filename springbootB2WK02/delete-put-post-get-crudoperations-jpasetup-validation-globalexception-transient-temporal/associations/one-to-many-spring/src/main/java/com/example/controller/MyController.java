package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.entity.Subjects;
import com.example.service.SubjectService;

@RestController
public class MyController {
	
	@Autowired
	private SubjectService service;
  
//	 @GetMapping(value="/subject")
//		public ResponseEntity<List<Subjects>> findAllUser() {
//		return new ResponseEntity<List<Subjects>>(service.getSubjects(), HttpStatus.OK);
//			
//		}
//	@PostMapping(value="/addsubject")
//	public ResponseEntity<String> addSubject(@RequestBody Subjects subjects) {
//		service.saveUser(subjects);
//		return new ResponseEntity<String>("subject added successfully",HttpStatus.OK);
//		}
//	


	@GetMapping(value="/student")
	public ResponseEntity<List<Student>> findAllStudentSubjects() {
	return new ResponseEntity<List<Student>>(service.getStudentSubjects(), HttpStatus.OK);
		
	}
	
	@PostMapping(value="/addstudent")
	public ResponseEntity<String> addStudentSubjects(@RequestBody Student student) {
		service.saveStudentSubjects(student);
		return new ResponseEntity<String>("record added successfully",HttpStatus.OK);
		}
}
