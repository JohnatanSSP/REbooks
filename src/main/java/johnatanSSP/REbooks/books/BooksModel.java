package johnatanSSP.REbooks.books;

import jakarta.persistence.*;
import johnatanSSP.REbooks.archives.ArchivesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_register")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BooksModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String Title;
    private String Author;
    private String ReleaseDate;
    private String Genre;
    private int Pages;
    private String Reader;
    @OneToOne
    @JoinColumn(name = "archive_id")
    private ArchivesModel archive;
    private String Review;


}
