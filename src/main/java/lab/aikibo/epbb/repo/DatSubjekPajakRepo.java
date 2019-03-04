package lab.aikibo.epbb.repo;

import lab.aikibo.epbb.entity.DatSubjekPajak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatSubjekPajakRepo extends JpaRepository<DatSubjekPajak, String> {

    DatSubjekPajak findBySubjekPajakId(String subjekPajakId);
    List<DatSubjekPajak> findBySubjekPajakIdLike(String subjekPajakId);
    List<DatSubjekPajak> findByNmWpLike(String nmWp);

}
