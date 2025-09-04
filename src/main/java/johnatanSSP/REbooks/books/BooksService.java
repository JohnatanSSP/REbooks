
package johnatanSSP.REbooks.books;
import org.springframework.stereotype.Service;

import java.util.List;

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



}
