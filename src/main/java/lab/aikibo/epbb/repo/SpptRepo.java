package lab.aikibo.epbb.repo;

import lab.aikibo.epbb.entity.Sppt;
import lab.aikibo.epbb.entity.SpptPK;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface SpptRepo extends PagingAndSortingRepository<Sppt, SpptPK> {

    List<Sppt> findByKdPropinsiAndKdDati2AndKdKecamatanAndKdKelurahanAndKdBlokAndNoUrutAndKdJnsOp(
            String kdPropinsi, String kdDati2, String kdKecamatan, String kdKelurahan, String kdBlok,
            String noUrut, String kdJnsOp, Sort sort
    );

    List<Sppt> findByKdPropinsiAndKdDati2AndKdKecamatanAndKdKelurahanAndKdBlokAndNoUrutAndKdJnsOpAndStatusPembayaranSpptIn(
            String kdPropinsi, String kdDati2, String kdKecamatan, String kdKelurahan, String kdBlok,
            String noUrut, String kdJnsOp, Collection<Character> status, Sort sort
    );

    Sppt findOneByKdPropinsiAndKdDati2AndKdKecamatanAndKdKelurahanAndKdBlokAndNoUrutAndKdJnsOpAndThnPajakSpptAndStatusPembayaranSppt(
        String kdPropinsi, String kdDati2, String kdKecamatan, String kdKelurahan, String kdBlok, String noUrut,
        String kdJnsOp, String thnPajak, char statusPembayaranSppt
    );

}
