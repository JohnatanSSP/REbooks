package johnatanSSP.REbooks.archives;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArchivesService {

    private ArchivesRepository archivesRepository;

    public ArchivesService(ArchivesRepository archivesRepository) {
        this.archivesRepository = archivesRepository;
    }

    public List<ArchivesModel> ShowAll() {
        return archivesRepository.findAll();
    }

    public ArchivesModel ShowById(Long id) {
        return archivesRepository.findById(id).orElse(null);
    }

    public ArchivesModel create(ArchivesModel archives) {
        return archivesRepository.save(archives);
    }

    public void deleteArquivesByID(Long id) {
        archivesRepository.deleteById(id);
    }

    public ArchivesModel update(ArchivesModel archives) {
        return archivesRepository.save(archives);
    }



}
