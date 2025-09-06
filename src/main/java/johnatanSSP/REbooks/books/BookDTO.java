package johnatanSSP.REbooks.books;
import johnatanSSP.REbooks.archives.ArchivesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookDTO {

    private long Id;
    private String Title;
    private String Author;
    private String ReleaseDate;
    private String Genre;
    private int Pages;
    private String Reader;
    private ArchivesModel archive;
    private String review;
}
