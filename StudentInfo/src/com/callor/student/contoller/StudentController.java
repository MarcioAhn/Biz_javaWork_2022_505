package com.callor.student.contoller;

import com.callor.student.impl.StudentServiceImpl;
import com.callor.student.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		StudentService scService = new StudentServiceImpl();
		scService.inputStudent();
		scService.loadStudent();
		scService.saveStudent();
		scService.printStudent();
		
	}
}

