package johnatanSSP.REbooks.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/Hello")
    public String HelloSpring(){
      return "hello Spring";
    };

    //add books (create)
    @PostMapping("/create")
    public String create(){
        return "create Book";
    };

    //search books
    @GetMapping("/showAll")
    public List<BooksModel> showAll(){
        return booksService.showAll();
    }
    @GetMapping("/allShowID")
    public String allID(){
        return "show all ID";
    }

    //alter database
    @PutMapping("/alterID")
    public String update(){
        return "update Book";
    }

    //delete books
    @DeleteMapping("/deleteID")
    public String delete(){
        return "delete Book";
    }

}
