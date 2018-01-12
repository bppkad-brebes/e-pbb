package lab.aikibo.epbb.service;

import lab.aikibo.epbb.entity.Sppt;
import lab.aikibo.epbb.repo.SpptRepo;
import lab.aikibo.epbb.util.PiutangSpptModif;
import lab.aikibo.epbb.util.SpptModif;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.LinkedList;
import java.util.List;

@Service
public class SpptService {

    @Autowired
    private SpptRepo spptRepo;

    public List<SpptModif> getSppt(String nop) {
        List<SpptModif> result = new LinkedList();

        List<Sppt> data = spptRepo.findByKdPropinsiAndKdDati2AndKdKecamatanAndKdKelurahanAndKdBlokAndNoUrutAndKdJnsOp(
          nop.substring(0,2), nop.substring(2,4), nop.substring(4,7), nop.substring(7,10), nop.substring(10,13),
          nop.substring(13,17), nop.substring(17,18), new Sort("thnPajakSppt")
        );

        for(int i=0; i<data.size(); i++) {
            result.add(new SpptModif(data.get(i).getThnPajakSppt(), data.get(i).getPbbYgHarusDibayarSppt(),
                    data.get(i).getStatusPembayaranSppt() == '1' ? "LUNAS" : "BLM BAYAR"));
        }

        return result;
    }

    public PiutangSpptModif getPiutang(String nop, String thnPajak) {
        DateTimeFormatter dateFormatOut = DateTimeFormat.forPattern("dd-MM-yyyy");

        Sppt data = spptRepo.findOneByKdPropinsiAndKdDati2AndKdKecamatanAndKdKelurahanAndKdBlokAndNoUrutAndKdJnsOpAndThnPajakSpptAndStatusPembayaranSppt(
            nop.substring(0,2), nop.substring(2,4), nop.substring(4,7), nop.substring(7,10), nop.substring(10,13),
            nop.substring(13,17), nop.substring(17,18), thnPajak, '0'
        );

        PiutangSpptModif result = new PiutangSpptModif();
        DateTime tglJatuhTempo = new DateTime(data.getTglJatuhTempoSppt());
        result.setTgl_tempo(dateFormatOut.print(tglJatuhTempo));
        result.setJumlah(data.getPbbYgHarusDibayarSppt());
        result.setTgl_skrg(dateFormatOut.print(new DateTime()));
        int selisih = Months.monthsBetween(new DateTime(data.getTglJatuhTempoSppt()), new DateTime()).getMonths();
        result.setDenda_bln(selisih);
        result.setDenda_jml(
                (selisih > 15) ?
                    (new BigDecimal("15").multiply(new BigDecimal("0.02")).multiply(data.getPbbYgHarusDibayarSppt())).round(new MathContext(3, RoundingMode.UP)) :
                    (new BigDecimal(selisih).multiply(new BigDecimal("0.02")).multiply(data.getPbbYgHarusDibayarSppt())).round(new MathContext(3, RoundingMode.UP))
        );

        return result;
    }

}
