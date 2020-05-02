package com.uca.capas.controller;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.student;

@Controller
public class mainController {
	private List<student> students = new ArrayList<student>();
	
	@GetMapping("/inicio")
	public String index(student student) {
		return"index";
	}
	
	@GetMapping(path="/ejemplo1", produces= org.springframework.http.MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String ejemplo1() {
		return "Bienvenidos a Ncapas";
	}
	@GetMapping("/ejemplo2")
	@ResponseBody
	public java.util.List<student> ejemplo2(){
		return Arrays.asList(
				new student("Daniel","Gomez","27/07/2017","Ing Sistemas",true), 
				new student("Marcela","Guerrero","01/07/2017","Ing Sistemas",false)
				);
	}
	
	@PostMapping("/formData")
	public ModelAndView procesar(student s) {
		students.add(s);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("student", new student());
		return mav;
	}
	
	@GetMapping("/listado")
	public ModelAndView listado() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("listado");
		mav.addObject("studentList", this.students);
		return mav;
	}
	
}
