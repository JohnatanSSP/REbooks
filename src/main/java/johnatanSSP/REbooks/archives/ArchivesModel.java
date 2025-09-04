package johnatanSSP.REbooks.archives;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import johnatanSSP.REbooks.books.BooksModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


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
    @JsonIgnore
    private List <BooksModel> book;


}
