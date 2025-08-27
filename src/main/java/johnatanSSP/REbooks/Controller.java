package johnatanSSP.REbooks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/Hello")
    public String HelloSpring(){
      return "hello Spring";
    };
}
