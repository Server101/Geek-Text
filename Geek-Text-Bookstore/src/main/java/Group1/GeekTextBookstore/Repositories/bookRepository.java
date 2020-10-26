package Group1.GeekTextBookstore.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import Group1.GeekTextBookstore.Model.book;

//This is a new interface jpa repository for the 
public interface bookRepository extends JpaRepository<book, Long> {
    
}