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

import Group1.GeekTextBookstore.Model.bike;
import Group1.GeekTextBookstore.Repositories.bikeRepository;

@RestController
@RequestMapping("/api/v1/bikes")  //The api has version control
public class bikesController {
    @Autowired
    private bikeRepository BRepository;
    
    
    ///===API can list Data===
    //creating bike list

    @GetMapping
    public List<bike> list() {
        return BRepository.findAll();
    }

    ///===API can Create Data===
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody bike bike){
        BRepository.save(bike);

    }

    ///===API can View Data===
    @GetMapping("/{id}")
    public bike get(@PathVariable("id")long id){
        return BRepository.getOne(id);
    }
}
