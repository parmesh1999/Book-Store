package com.parmesh.myRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parmesh.myModel.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
