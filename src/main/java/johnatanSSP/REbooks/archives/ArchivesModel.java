package johnatanSSP.REbooks.archives;

import jakarta.persistence.*;
import johnatanSSP.REbooks.books.BooksModel;

@Entity
@Table(name = "tb_archives")
public class ArchivesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String Image;
    private String Download;
    private BooksModel book;

    public void Archives(){

    }

    public ArchivesModel(String image, String download, BooksModel book) {
        Image = image;
        Download = download;
        this.book = book;
    }

}
