package Group1.GeekTextBookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Group1.GeekTextBookstore.Model.user;

//This is a new interface jpa repository for the 
public interface userRepository extends JpaRepository<user, Long> {
    
}
