package johnatanSSP.REbooks.books;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/Hello")
    public String HelloSpring(){
      return "hello Spring";
    };

    //add books (create)
    @PostMapping("/create")
    @Operation(summary = "cria um objeto novo no DB")
    public ResponseEntity<String> createBooks(@RequestBody BookDTO book) {
        BookDTO newBook = booksService.createBook(book);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Book created with succes" + newBook.getTitle());
    };

    //search books
    @GetMapping("/showall")
    @Operation(summary = "mostra todos objetos do DB")
    public ResponseEntity<List<BookDTO>>  showAll(){
        List<BookDTO> books = booksService.showAll();
        return ResponseEntity.status(HttpStatus.OK)
                .body(books);
    }
    @GetMapping("/show/{id}")
    @Operation(summary = "mostra em detalhes o objeto")
    public ResponseEntity<?> showAllID(@PathVariable Long id){

        BookDTO book = booksService.findById(id);
        if(book == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Book not found");
        }else {
            return ResponseEntity.ok().body("Book found with succes" + book.getTitle());
        }

    }

    //alter database
    @PutMapping("/update/{id}")
    @Operation(summary = "atualiza objeto")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody BookDTO newBook){

        BookDTO book = booksService.updateBook(id, newBook);
        if(book == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Book not found");
        }else  {
            return ResponseEntity.ok().body("Book updated with succes" + book.getTitle());

        }
    }

    //delete books
    @DeleteMapping("/delete/{id}")
    @Operation(summary = "deleta objeto especifico")
    public ResponseEntity<String> delete(@PathVariable Long id){

        if( booksService.findById(id)!= null){
            booksService.deleteBookById(id);
            return ResponseEntity.ok("Book with ID" + id + "deleted");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book with ID " + id + " NOT FOUND...");
        }
    }

}
