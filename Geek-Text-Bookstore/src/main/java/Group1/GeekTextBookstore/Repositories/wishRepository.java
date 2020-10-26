package Group1.GeekTextBookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Group1.GeekTextBookstore.Model.wish;

//This is a new interface jpa repository for the 
public interface wishRepository extends JpaRepository<wish, String> {
    
}
