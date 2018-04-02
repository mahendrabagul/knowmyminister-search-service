package com.knowmyminister.searchservice.service.impl;

import com.knowmyminister.searchservice.domain.Author;
import com.knowmyminister.searchservice.repository.AuthorRepository;
import com.knowmyminister.searchservice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService
{
    private AuthorRepository authorRepository;

    @Autowired
    public void setAuthorRepository(AuthorRepository authorRepository)
    {
        this.authorRepository = authorRepository;
    }


    public Author save(Author author)
    {
        return authorRepository.save(author);
    }

    public void delete(Author author)
    {
        authorRepository.delete(author);
    }

    public Optional<Author> findById(String id)
    {
        return authorRepository.findById(id);
    }

    public Iterable<Author> findAll()
    {
        return authorRepository.findAll();
    }

    public Page<Author> findByFirstName(String firstName, PageRequest pageRequest)
    {
        return authorRepository.findByFirstName(firstName, pageRequest);
    }

    public List<Author> findByLastName(String lastName)
    {
        return authorRepository.findByLastName(lastName);
    }
}
