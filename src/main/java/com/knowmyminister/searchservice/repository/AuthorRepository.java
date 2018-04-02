package com.knowmyminister.searchservice.repository;

import com.knowmyminister.searchservice.domain.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by mahendra.hiraman on 4/2/2018.
 */
public interface AuthorRepository extends ElasticsearchRepository<Author, String>
{
    Page<Author> findByFirstName(String firstName, Pageable pageable);

    List<Author> findByLastName(String lastName);
}
