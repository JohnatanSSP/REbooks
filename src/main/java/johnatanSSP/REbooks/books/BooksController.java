package johnatanSSP.REbooks.books;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {

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
    @GetMapping("/allShow")
    public String all(){
        return "all Books";
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
