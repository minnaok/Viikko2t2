package fi1.oksa.Viikko2t2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi1.oksa.Viikko2t2.domain.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/hello")
	
	public String showStudents(Model model) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("Vellu", "Oksa"));
		studentList.add(new Student("Dante", "Oksa"));
		studentList.add(new Student("Minna", "Oksa"));
		System.out.println(studentList);
		
		model.addAttribute("students", studentList);
		
		return "students";
	}
	
}


