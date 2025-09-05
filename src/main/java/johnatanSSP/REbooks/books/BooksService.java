
package johnatanSSP.REbooks.books;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {


    private BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    //show all books

    public List<BooksModel> showAll() {
        return booksRepository.findAll();
    }

    public BooksModel findById(Long id) {
        Optional<BooksModel> booksByID = booksRepository.findById(id);
        return booksByID.orElse(null);
    }

    public BooksModel createBook(BooksModel book) {
        return booksRepository.save(book);
    }

    public void deleteBookById(Long id){
        booksRepository.deleteById(id);
    }

    public BooksModel updateBook(Long id, BooksModel newBook) {
        if(booksRepository.existsById(id)){
            newBook.setId(id);
            return booksRepository.save(newBook);
        }
        return null;
    }


}
