package com.Tas.Dao;

import java.util.Collection;

import com.Tas.Entity.Student;

public interface StudentDao {

	Collection<Student> GetAllStudents();

	Student getStudentById(int id);

	void removeStudentById(int id);

	void updateStudent(Student student);

	void insertStudentToDb(Student student);

}