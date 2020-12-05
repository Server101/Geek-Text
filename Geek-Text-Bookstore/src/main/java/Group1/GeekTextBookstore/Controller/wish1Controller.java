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

import Group1.GeekTextBookstore.Model.wish1;
import Group1.GeekTextBookstore.Repositories.wish1Repository;

@RestController
@RequestMapping("/api/v1/wish1") // The api has version control
public class wish1Controller {
    @Autowired
    private wish1Repository wish1_Repository;

    /// ===API can list Data===

    @GetMapping
    public List<wish1> list() {
        return wish1_Repository.findAll();
    }

    /// ===API can Create Data===
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody wish1 wishes1) {
        wish1_Repository.save(wishes1);

    }

    /// ===API can View Data===
    @GetMapping("/{id}")
    public wish1 get(@PathVariable("id") Long id) {
        return wish1_Repository.getOne(id);
    }
}
