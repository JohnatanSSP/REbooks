package johnatanSSP.REbooks.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BooksController {

    @GetMapping("/Hello")
    public String HelloSpring(){
      return "hello Spring";
    };
}
