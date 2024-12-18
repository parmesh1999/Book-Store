package com.parmesh.myController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.parmesh.myModel.Book;
import com.parmesh.myModel.MyBook;
import com.parmesh.myService.BookService;
import com.parmesh.myService.MyBookService;





@Controller
public class BookController {
	@Autowired
	private BookService service;
	@Autowired
	private MyBookService myBookService;
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/bookRegister")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@GetMapping("/availableBook")
	public ModelAndView availableBook() {
		List<Book> list = service.fatchAllBook();
//		ModelAndView mView = new ModelAndView();
//		mView.setViewName("availableBook");
//		mView.addObject("book", list);
//		return mView;
		return new ModelAndView("availableBook","book",list);
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book book) {
		service.save(book);
		return "/availableBook";
	}
	
	@GetMapping("/myBook")
	public String getMyBook(Model model) {
		List<MyBook> list = myBookService.getAllMyBook();
		model.addAttribute("book", list);
		return "myBook";
	}
	
	@RequestMapping("/myBookList/{id}")
	public String getMyBookList(@PathVariable int id) {
		Book b = service.getBookById(id); 
		MyBook myBook = new MyBook(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
		myBookService.saveMyBook(myBook);
		return "redirect:/myBook";
	}
	
	@GetMapping("/editBook/{id}")
	public String editBook(@PathVariable int id, Model model) {
		Book books = service.getBookById(id);
		model.addAttribute("book", books);
		return "editBook";
	}
	
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		service.deleteBookById(id);
		return "redirect:/availableBook";
		
	}
	
	
}
