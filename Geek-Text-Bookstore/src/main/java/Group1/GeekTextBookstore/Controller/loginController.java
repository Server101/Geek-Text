package Group1.GeekTextBookstore.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Group1.GeekTextBookstore.Model.login;
import Group1.GeekTextBookstore.Repositories.loginRepository;

@RestController
@RequestMapping("/api/v1/login") // The api has version control
public class loginController {
    private loginRepository theLoginRepository;

    /// ===API can list Data===
    // creating books list from database

    @GetMapping
    public List<login> list() {
        return theLoginRepository.findAll();
    }

    /// ===API can Create Data===
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody login logbooks) {
        theLoginRepository.save(logbooks);

    }

    /// ===API can View Data===
    @GetMapping("/{id}")
    public login get(@PathVariable("id") long bookid) {
        return theLoginRepository.getOne(bookid);
    }
}
