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

import Group1.GeekTextBookstore.Model.wish;
import Group1.GeekTextBookstore.Repositories.wishRepository;

@RestController
@RequestMapping("/api/v1/wish")  //The api has version control
public class wishController {
    @Autowired
    private wishRepository wishRepository;
    
    
    ///===API can list Data===
   

    @GetMapping
    public List<wish> list() {
        return wishRepository.findAll();
    }

    ///===API can Create Data===
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody wish wishes){
        wishRepository.save(wishes);

    }

    ///===API can View Data===
    @GetMapping("/{id}")
    public wish get(@PathVariable("id")String id){
        return wishRepository.getOne(id);
    }
}
