package johnatanSSP.REbooks.archives;

import jakarta.persistence.*;
import johnatanSSP.REbooks.books.BooksModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_archives")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ArchivesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name = "ImgUrl")
    private String Image;
    @Column(name = "DownloadUrl")
    private String Download;

    @OneToOne(mappedBy = "archive")
    private BooksModel book;


}
