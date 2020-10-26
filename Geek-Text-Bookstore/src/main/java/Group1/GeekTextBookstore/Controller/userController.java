package Group1.GeekTextBookstore.Controller;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Group1.GeekTextBookstore.Model.user;
import Group1.GeekTextBookstore.Repositories.userRepository;

@RestController
@RequestMapping("/api/v1/users")  //The api has version control
public class userController {
    @Autowired
    private userRepository USERRepository;
    
    
    ///===API can list Data===
   

    @GetMapping
    public List<user> list() {
        return USERRepository.findAll();
    }

    ///===API can Create Data===
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody user Users){
        USERRepository.save(Users);

    }

    ///===API can View Data===
    @GetMapping("/{id}")
    public user get(@PathVariable("id")Long id){
        return USERRepository.getOne(id);
    }
}
