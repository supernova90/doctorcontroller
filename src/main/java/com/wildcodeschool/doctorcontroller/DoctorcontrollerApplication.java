package com.wildcodeschool.doctorcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DoctorcontrollerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorcontrollerApplication.class, args);
	}
@RequestMapping("/")
@ResponseBody
public String index() {
	return "select your doctor from the list below:"
	+"<br>"+
	"<a href='/doctor/1'>Doctor n°1</a>"
	+"<br>"+
	"<a href='/doctor/2'>Doctor n°2</a>"
	+"<br>"+
	"<a href='/doctor/3'>Doctor n°3</a>"
	+"<br>"+
	"<a href='/doctor/4'>Doctor n°4</a>";
}

@RequestMapping("/doctor/1")
@ResponseBody
public String doctorOne() {
	return "Peter Davison";
}

@RequestMapping("/doctor/2")
@ResponseBody
public String doctorTwo() {
	return "Tom Baker";
}


@RequestMapping("/doctor/3")
@ResponseBody
public String doctorThree() {
	return "Matt Smith";
}


@RequestMapping("/doctor/4")
@ResponseBody
public String doctorFour() {
	return "David Tennant";
}

}
