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

import Group1.GeekTextBookstore.Model.wish2;
import Group1.GeekTextBookstore.Repositories.wish2Repository;

@RestController
@RequestMapping("/api/v1/wish2") // The api has version control
public class wish2Controller {
    @Autowired
    private wish2Repository wish_Repository;

    /// ===API can list Data===

    @GetMapping
    public List<wish2> list() {
        return wish_Repository.findAll();
    }

    /// ===API can Create Data===
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody wish2 wishes2) {
        wish_Repository.save(wishes2);

    }

    /// ===API can View Data===
    @GetMapping("/{id}")
    public wish2 get(@PathVariable("id") Long id) {
        return wish_Repository.getOne(id);
    }
}
