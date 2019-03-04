package lab.aikibo.epbb.repo;

import lab.aikibo.epbb.entity.DatObjekPajak;
import lab.aikibo.epbb.entity.DatObjekPajakPK;
import lab.aikibo.epbb.util.DatObjekPajakModif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatObjekPajakRepo extends JpaRepository<DatObjekPajak, DatObjekPajakPK> {

    DatObjekPajak findByKdKecamatanAndKdKelurahanAndKdBlokAndNoUrut(String kdKecamatan, String kdKelurahan,
                                                                    String kdBlok, String noUrut);
    List<DatObjekPajak> findBySubjekPajakId(String subjekPajakId);

}
