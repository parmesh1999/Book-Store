package com.parmesh.myService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parmesh.myModel.MyBook;
import com.parmesh.myRepo.MyBookRepo;

@Service
public class MyBookService {
	@Autowired
	private MyBookRepo repo;
	
	public void saveMyBook(MyBook myBook) {
		repo.save(myBook);
	}

	public List<MyBook> getAllMyBook(){
		return repo.findAll();
	}
	
	public void deleteMyBookById(int id) {
		repo.deleteById(id);
	}
}
