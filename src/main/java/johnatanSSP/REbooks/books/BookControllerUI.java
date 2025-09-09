package johnatanSSP.REbooks.books;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books/ui")
public class BookControllerUI {

    private final BooksService booksService;

    public BookControllerUI(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/show-all")
    public String showAll(Model model) {
        List<BookDTO> book = booksService.showAll();
        model.addAttribute("books", book);
        return "showAll";
    }
}
