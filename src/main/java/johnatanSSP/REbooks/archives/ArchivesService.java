package johnatanSSP.REbooks.archives;


import org.springframework.stereotype.Service;


@Service
public class ArchivesService {

    private final ArchivesRepository archivesRepository;
    private final ArchivesMapper archivesMapper;

    public ArchivesService(ArchivesRepository archivesRepository, ArchivesMapper archivesMapper) {
        this.archivesRepository = archivesRepository;
        this.archivesMapper = archivesMapper;
    }

    public ArchivesModel ShowById(Long id) {
        return archivesRepository.findById(id).orElse(null);
    }

    public ArchivesDTO createBook(ArchivesDTO archivesDTO) {
        ArchivesModel archives = ArchivesMapper.map(archivesDTO);
        archives = archivesRepository.save(archives);
        return archivesMapper.map(archives);
    }

    public void deleteArchivesByID(Long id) {
        archivesRepository.deleteById(id);
    }




}
