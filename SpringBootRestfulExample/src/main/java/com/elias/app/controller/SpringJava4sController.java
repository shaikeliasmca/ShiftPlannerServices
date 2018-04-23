/* 
 * Author ::. Elias
 *
 */

package com.elias.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringJava4sController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Java4s Spring Boot Tutorials";
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
	}
}