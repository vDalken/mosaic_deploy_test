package com.example.deploytest.books;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, UUID> {

}