package com.example.bookProject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bookProject.entity.Book;

public interface BookRepo extends JpaRepository<Book,Long> {

	@Query(value="select * from Book", nativeQuery=true)
	List<Book> getAllBooks();

}
