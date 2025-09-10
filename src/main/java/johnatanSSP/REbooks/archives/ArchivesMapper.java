package johnatanSSP.REbooks.archives;

import org.springframework.stereotype.Component;

@Component
public class ArchivesMapper {
    public static ArchivesModel map(ArchivesDTO dto) {
        ArchivesModel archives = new ArchivesModel();
        archives.setId(dto.getId());
        archives.setImage(dto.getImage());
        archives.setDownload(dto.getDownload());
        return archives;
    }
    public ArchivesDTO map(ArchivesModel archives){
        ArchivesDTO archivesDTO = new ArchivesDTO();
        archivesDTO.setId(archives.getId());
        archivesDTO.setImage(archives.getImage());
        archivesDTO.setDownload(archives.getDownload());
        return archivesDTO;
    }
}
