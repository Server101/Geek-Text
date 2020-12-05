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

import Group1.GeekTextBookstore.Model.wish3;
import Group1.GeekTextBookstore.Repositories.wish3Repository;

@RestController
@RequestMapping("/api/v1/wish3") // The api has version control
public class wish3Controller {
    @Autowired
    private wish3Repository wish3_Repository;

    /// ===API can list Data===

    @GetMapping
    public List<wish3> list() {
        return wish3_Repository.findAll();
    }

    /// ===API can Create Data===
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody wish3 wishes3) {
        wish3_Repository.save(wishes3);

    }

    /// ===API can View Data===
    @GetMapping("/{id}")
    public wish3 get(@PathVariable("id") Long id) {
        return wish3_Repository.getOne(id);
    }
}
