package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springboot.model.Mwanafunzi;
import net.javaguides.springboot.service.MwanafunziService;

@Controller
public class MwanafunziController {

	@Autowired
	private MwanafunziService mwanafunziService;
	
	
	// display list of wanafunzi
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listWanafunzi", mwanafunziService.getAllWanafunzi());
		return "index";
	}

	@GetMapping("/showNewStudentForm")
	public String showNewStudentForm(Model model) {
		Mwanafunzi mwanafunzi = new Mwanafunzi();
		model.addAttribute("mwanafunzi", mwanafunzi);
		return "new_student";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("mwanafunzi") Mwanafunzi mwanafunzi) {
		
		//Save student into the database
		mwanafunziService.saveMwanafunzi(mwanafunzi);
		return "redirect:/";
	}
	
	@GetMapping("/showUpdateForm/{id}")
	public String showUpdateForm(@PathVariable (value = "id") long id, Model model) {
		
		//Get student from the service
		Mwanafunzi mashaa = mwanafunziService.getMwanafunziById(id);
		
		//Set student as a model attribute to pre-populate the form data
		model.addAttribute("mwanafunzi", mashaa);
		return "update_student";
		
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable (value = "id") long id, Model model) {
		
		//Call delete student Method
		this.mwanafunziService.deleteMwanafunziById(id);
		return "redirect:/";
		
	}
}
