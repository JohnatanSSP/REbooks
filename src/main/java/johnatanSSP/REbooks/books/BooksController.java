package johnatanSSP.REbooks.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> createBooks(@RequestBody BookDTO book) {
        BookDTO newBook = booksService.createBook(book);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Book created with succes" + newBook.getTitle());
    };

    //search books
    @GetMapping("/showAll")
    public List<BookDTO> showAll(){
        return booksService.showAll();
    }
    @GetMapping("/show/{id}")
    public BookDTO showAllID(@PathVariable Long id){
        return booksService.findById(id);
    }

    //alter database
    @PutMapping("/update/{id}")
    public BookDTO update(@PathVariable Long id, @RequestBody BookDTO newBook){
        return booksService.updateBook(id, newBook);
    }

    //delete books
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){

        if( booksService.findById(id)!= null){
            booksService.deleteBookById(id);
            return ResponseEntity.ok("Book with ID" + id + "deleted");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book with ID " + id + " NOT FOUND...");
        }
    }

}
