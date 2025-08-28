package johnatanSSP.REbooks.archives;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ArchivesController {

    @GetMapping("/archives")
    public String Archives(){
        return "archives";
    };
}
