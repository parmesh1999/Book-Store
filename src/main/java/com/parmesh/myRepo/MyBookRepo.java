package com.parmesh.myRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parmesh.myModel.MyBook;

@Repository
public interface MyBookRepo extends JpaRepository<MyBook, Integer>{

}
