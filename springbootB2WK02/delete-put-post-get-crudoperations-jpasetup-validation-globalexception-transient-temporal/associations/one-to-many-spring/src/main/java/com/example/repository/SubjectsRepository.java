package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Subjects;

@Repository
public interface SubjectsRepository extends JpaRepository<Subjects,Integer> {
}


