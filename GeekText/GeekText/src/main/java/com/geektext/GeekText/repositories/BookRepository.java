package com.geektext.GeekText.repositories;

import com.geektext.GeekText.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
