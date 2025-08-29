package johnatanSSP.REbooks.books;

import jakarta.persistence.*;
import johnatanSSP.REbooks.archives.ArchivesModel;

import java.util.List;

@Entity
@Table(name = "tb_register")
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

    public BooksModel() {
    }

    public BooksModel(String title, String author, String releaseDate, String genre, int pages, String reader) {
        Title = title;
        Author = author;
        ReleaseDate = releaseDate;
        Genre = genre;
        Pages = pages;
        Reader = reader;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        Pages = pages;
    }

    public String getReader() {
        return Reader;
    }

    public void setReader(String reader) {
        Reader = reader;
    }
}
