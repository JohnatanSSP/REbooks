
package johnatanSSP.REbooks.books;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {


    private BooksRepository booksRepository;
    private BookMapper bookMapper;

    public BooksService(BooksRepository booksRepository, BookMapper bookMapper) {
        this.booksRepository = booksRepository;
        this.bookMapper = bookMapper;
    }

    //show all books

    public List<BooksModel> showAll() {
        return booksRepository.findAll();
    }

    public BooksModel findById(Long id) {
        Optional<BooksModel> booksByID = booksRepository.findById(id);
        return booksByID.orElse(null);
    }

    public BookDTO createBook(BookDTO bookDTO) {
        BooksModel books = new BookMapper().map(bookDTO);
        books = booksRepository.save(books);
        return bookMapper.map(books);
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
