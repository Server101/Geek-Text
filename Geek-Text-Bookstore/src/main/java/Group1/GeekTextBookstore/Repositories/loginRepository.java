package Group1.GeekTextBookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Group1.GeekTextBookstore.Model.login;

//This is a new interface jpa repository for the 
public interface loginRepository extends JpaRepository<login, Long> {

}