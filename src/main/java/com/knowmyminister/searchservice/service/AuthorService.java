package com.knowmyminister.searchservice.service;

import com.knowmyminister.searchservice.domain.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

public interface AuthorService
{
    Author save(Author Author);

    void delete(Author Author);

    Optional<Author> findById(String id);

    Iterable<Author> findAll();

    Page<Author> findByFirstName(String author, PageRequest pageRequest);

    List<Author> findByLastName(String title);
}
