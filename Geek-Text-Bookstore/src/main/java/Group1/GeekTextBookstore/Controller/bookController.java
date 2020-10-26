package Group1.GeekTextBookstore.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Group1.GeekTextBookstore.Repositories.bookRepository;
import Group1.GeekTextBookstore.Model.book;



@RestController
@RequestMapping("/api/v1/books")  //The api has version control
public class bookController {
    @Autowired
    private bookRepository BooksRepository;
    
    
    ///===API can list Data===
    //creating bike list

    @GetMapping
    public List<book> list() {
        return BooksRepository.findAll();
    }

    ///===API can Create Data===
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody book books){
        BooksRepository.save(books);

    }

    ///===API can View Data===
    @GetMapping("/{id}")
    public book get(@PathVariable("id")long id){
        return BooksRepository.getOne(id);
    }

}