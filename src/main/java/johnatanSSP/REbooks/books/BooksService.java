
package johnatanSSP.REbooks.books;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BooksService {


    private BooksRepository booksRepository;
    private BookMapper bookMapper;

    public BooksService(BooksRepository booksRepository, BookMapper bookMapper) {
        this.booksRepository = booksRepository;
        this.bookMapper = bookMapper;
    }

    //show all books

    public List<BookDTO> showAll() {
        List<BooksModel> books = booksRepository.findAll();
        return books.stream().map(bookMapper::map).collect(Collectors.toList());
    }

    public BookDTO findById(Long id) {
        Optional<BooksModel> booksByID = booksRepository.findById(id);
        return booksByID.map(bookMapper::map).orElse(null);
    }

    public BookDTO createBook(BookDTO bookDTO) {
        BooksModel books = new BookMapper().map(bookDTO);
        books = booksRepository.save(books);
        return bookMapper.map(books);
    }

    public void deleteBookById(Long id){
        booksRepository.deleteById(id);
    }

    public BookDTO updateBook(Long id, BookDTO BookDTO) {
        Optional<BooksModel> Book = booksRepository.findById(id);
        if(Book.isPresent()){
        BooksModel newBook = BookMapper.map(BookDTO);
        newBook.setId(id);
        BooksModel updatedBook = booksRepository.save(newBook);
        return bookMapper.map(updatedBook);
        }
        return null;
    }


}
