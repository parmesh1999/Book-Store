package com.parmesh.myService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parmesh.myModel.Book;
import com.parmesh.myRepo.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo repo; 
	
	public Book save(Book book) {
		return repo.save(book);
	}

	public List<Book> fatchAllBook() {
		return repo.findAll();
	}

	public Book getBookById(int id) {
		return repo.findById(id).get();
		
	}

	public void deleteBookById(int id) {
		repo.deleteById(id);	
	}
}
