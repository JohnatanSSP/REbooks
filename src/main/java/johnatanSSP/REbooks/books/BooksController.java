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
    public BookDTO createBooks(@RequestBody BookDTO book) {
        return booksService.createBook(book);
    };

    //search books
    @GetMapping("/showAll")
    public List<BooksModel> showAll(){
        return booksService.showAll();
    }
    @GetMapping("/show/{id}")
    public BooksModel showAllID(@PathVariable Long id){
        return booksService.findById(id);
    }

    //alter database
    @PutMapping("/update/{id}")
    public BooksModel update(@PathVariable Long id, @RequestBody BooksModel newBook){
        return booksService.updateBook(id, newBook);
    }

    //delete books
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        booksService.deleteBookById(id);
    }

}
