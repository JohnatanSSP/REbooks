package johnatanSSP.REbooks.archives;

import johnatanSSP.REbooks.books.BookDTO;
import johnatanSSP.REbooks.books.BookMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/archives")
public class ArchivesController {

    private final ArchivesService archivesService;

    public ArchivesController(ArchivesService archivesService) {
        this.archivesService = archivesService;
    }

    @PostMapping("/create_archives")
    public ResponseEntity<String> createArchives(@RequestBody ArchivesDTO archives) {
        ArchivesDTO newArchives = archivesService.createBook(archives);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("archives created with succes" + newArchives.getId());
    };

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        if( archivesService.ShowById(id)!= null){
            archivesService.deleteArchivesByID(id);
            return ResponseEntity.ok("Archives with ID" + id + "deleted");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Archives with ID " + id + " NOT FOUND...");
        }
    }
}
