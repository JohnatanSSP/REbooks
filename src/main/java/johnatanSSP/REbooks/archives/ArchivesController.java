package johnatanSSP.REbooks.archives;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/arquives")
public class ArchivesController {

    @GetMapping("/show_all")
    public String showAll(){return "show all";}

    @PostMapping("/create")
    public String createArquives(){return "create arquives";}

    @PutMapping("/alter")
    public String Archives(){
        return "alter archives";
    };

    @DeleteMapping("delete")
    public String deleteArquives(){return "delete arquives";}


}
