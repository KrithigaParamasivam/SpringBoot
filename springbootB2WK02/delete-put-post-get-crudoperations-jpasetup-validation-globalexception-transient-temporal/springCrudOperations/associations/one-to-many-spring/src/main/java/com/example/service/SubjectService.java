package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Student;
import com.example.entity.Subjects;
import com.example.repository.StudentRepository;
import com.example.repository.SubjectsRepository;


@Service
public class  SubjectService  {
	
	@Autowired
	private SubjectsRepository repo;
	
	@Autowired
	private StudentRepository studentrepo;

	 public List<Subjects> getSubjects() {
	        return repo.findAll();
	    }

    public void saveUser(Subjects user) {
         repo.save(user);
    	}
    
    public void deleteUser(int id) {
        repo.deleteById(id);
        
    }
	
	 public void saveStudentSubjects(Student student) {
	        studentrepo.save(student);
	   	}

		public List<Student> getStudentSubjects() {
			return studentrepo.findAll();
		}

	
}
