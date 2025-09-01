package johnatanSSP.REbooks.archives;

import jakarta.persistence.*;
import johnatanSSP.REbooks.books.BooksModel;


@Entity
@Table(name = "tb_archives")
public class ArchivesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(unique = true)
    private String Image;
    private String Download;

    @OneToOne(mappedBy = "archive")
    private BooksModel book;

    public BooksModel getBook() {
        return book;
    }

    public void setBook(BooksModel book) {
        this.book = book;
    }

    public ArchivesModel() {
    }

    public ArchivesModel(String image, String download, BooksModel book) {
        Image = image;
        Download = download;
        this.book = book;
    }

}
