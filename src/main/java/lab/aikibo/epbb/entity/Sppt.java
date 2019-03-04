package lab.aikibo.epbb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(SpptPK.class)
public class Sppt {

    @Id @Getter @Setter
    private String kdPropinsi;
    @Id @Getter @Setter
    private String kdDati2;
    @Id @Getter @Setter
    private String kdKecamatan;
    @Id @Getter @Setter
    private String kdKelurahan;
    @Id @Getter @Setter
    private String kdBlok;
    @Id @Getter @Setter
    private String noUrut;
    @Id @Getter @Setter
    private String kdJnsOp;
    @Id @Getter @Setter
    private String thnPajakSppt;
    @Getter @Setter
    private int siklusSppt;
    @Getter @Setter
    private String kdKanwilBank;
    @Getter @Setter
    private String kdKppbbBank;
    @Getter @Setter
    private String kdBankTunggal;
    @Getter @Setter
    private String kdBankPersepsi;
    @Getter @Setter
    private String kdTp;
    @Getter @Setter
    private String nmWpSppt;
    @Getter @Setter
    private String jlnWpSppt;
    @Getter @Setter
    private String blokKavNoWpSppt;
    @Getter @Setter
    private String rwWpSppt;
    @Getter @Setter
    private String rtWpSppt;
    @Getter @Setter
    private String kelurahanWpSppt;
    @Getter @Setter
    private String kotaWpSppt;
    @Getter @Setter
    private String kdPosWpSppt;
    @Getter @Setter
    private String npwpSppt;
    @Getter @Setter
    private String noPersilSppt;
    @Getter @Setter
    private String kdKlsTanah;
    @Getter @Setter
    private String thnAwalKlsTanah;
    @Getter @Setter
    private String kdKlsBng;
    @Getter @Setter
    private String thnAwalKlsBng;
    @Getter @Setter
    private Date tglJatuhTempoSppt;
    @Getter @Setter
    private BigDecimal luasBumiSppt;
    @Getter @Setter
    private BigDecimal luasBngSppt;
    @Getter @Setter
    private BigDecimal njopBumiSppt;
    @Getter @Setter
    private BigDecimal njopBngSppt;
    @Getter @Setter
    private BigDecimal njopSppt;
    @Getter @Setter
    private BigDecimal njoptkpSppt;
    @Getter @Setter
    private BigDecimal njkpSppt;
    @Getter @Setter
    private BigDecimal pbbTerhutangSppt;
    @Getter @Setter
    private BigDecimal faktorPengurangSppt;
    @Getter @Setter
    private BigDecimal pbbYgHarusDibayarSppt;
    @Getter @Setter
    private char statusPembayaranSppt;
    @Getter @Setter
    private char statusTagihanSppt;
    @Getter @Setter
    private char statusCetakSppt;
    @Getter @Setter
    private Date tglTerbitSppt;
    @Getter @Setter
    private Date tglCetakSppt;
    @Getter @Setter
    private String nipPencetakSppt;

}
