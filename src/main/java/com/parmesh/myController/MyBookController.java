package com.parmesh.myController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parmesh.myService.MyBookService;

@Controller
public class MyBookController {
	@Autowired
	private MyBookService myBookService;
	
	@RequestMapping("/deleteMyBook/{id}")
	public String deleteMyBook(@PathVariable int id) {
		myBookService.deleteMyBookById(id);
		return "redirect:/myBook";
	}
}
