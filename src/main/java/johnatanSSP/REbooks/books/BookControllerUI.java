package johnatanSSP.REbooks.books;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/books/ui")
public class BookControllerUI {

    private final BooksService booksService;

    public BookControllerUI(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/showall")
    public String showAll(Model model) {
        List<BookDTO> book = booksService.showAll();
        model.addAttribute("books", book);
        return "showall";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        booksService.deleteBookById(id);
        return "redirect:/books/ui/showall";
    }

    @GetMapping("/show/{id}")
    public String showAllID(@PathVariable Long id, Model model){
        BookDTO book = booksService.findById(id);
        if(book!=null){
            model.addAttribute("book", book);
            return "detailsbook";
        }else {
            model.addAttribute("mensagem", "book not found");
            return "showall";
        }
    }

    @GetMapping("/add")
    public String addBook(Model model){
        model.addAttribute("book", new BookDTO());
        return "addbook";
    }

    @PostMapping("/save")
    public String saveBook(@ModelAttribute BookDTO book, RedirectAttributes redirectAttributes){
        booksService.createBook(book);
        redirectAttributes.addFlashAttribute("mensagem", "Book saved successfully");
        return "redirect:/books/ui/showall";
    }
}
