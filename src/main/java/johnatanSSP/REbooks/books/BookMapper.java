package johnatanSSP.REbooks.books;

import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public static BooksModel map(BookDTO bookDTO) {
        BooksModel book = new BooksModel();
        book.setId(bookDTO.getId());
        book.setAuthor(bookDTO.getAuthor());
        book.setTitle(bookDTO.getTitle());
        book.setPages(bookDTO.getPages());
        book.setReader(bookDTO.getReader());
        book.setReview(bookDTO.getReview());
        book.setArchive(bookDTO.getArchive());
        book.setTitle(bookDTO.getTitle());
        book.setGenre(bookDTO.getGenre());
        book.setPages(bookDTO.getPages());
        return book;
    }
    public BookDTO map(BooksModel book) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setAuthor(book.getAuthor());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setPages(book.getPages());
        bookDTO.setReader(book.getReader());
        bookDTO.setReview(book.getReview());
        bookDTO.setArchive(book.getArchive());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setGenre(book.getGenre());
        bookDTO.setPages(book.getPages());
        return bookDTO;
    }
}
