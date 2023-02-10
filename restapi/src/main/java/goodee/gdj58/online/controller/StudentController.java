package goodee.gdj58.online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import goodee.gdj58.online.vo.Student;

@Controller
public class StudentController {
	@GetMapping("/addStudent")
	public String addStudent() {
		System.out.println("addStudent.............................");
		return "addStudent";
	}
	@PostMapping("/addStudent")
	public String addStudent(Student student) {
		return "redirect:";
	}
}