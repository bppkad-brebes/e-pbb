package lab.aikibo.epbb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(DatObjekPajakPK.class)
public class DatObjekPajak {

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
    @Getter @Setter
    private String subjekPajakId;
    @Getter @Setter
    private String noFormulirSpop;
    @Getter @Setter
    private String noPersil;
    @Getter @Setter
    private String jalanOp;
    @Getter @Setter
    private String blokKavNoOp;
    @Getter @Setter
    private String rwOp;
    @Getter @Setter
    private String rtOp;
    @Getter @Setter
    private int kdStatusCabang;
    @Getter @Setter
    private char kdStatusWp;
    @Getter @Setter
    private BigDecimal totalLuasBumi;
    @Getter @Setter
    private BigDecimal totalLuasBng;
    @Getter @Setter
    private BigDecimal njopBumi;
    @Getter @Setter
    private BigDecimal njopBng;
    @Getter @Setter
    private int statusPetaOp;
    @Getter @Setter
    private char jnsTransaksiOp;
    @Getter @Setter
    private Date tglPendataanOp;
    @Getter @Setter
    private String nipPendata;
    @Getter @Setter
    private Date tglPemeriksaanOp;
    @Getter @Setter
    private String nipPemeriksaOp;
    @Getter @Setter
    private Date tglPerekamanOp;
    @Getter @Setter
    private String nipPerekamOp;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "kdPropinsi", referencedColumnName = "kdPropinsi", insertable = false, updatable = false),
            @JoinColumn(name = "kdDati2", referencedColumnName = "kdDati2", insertable = false, updatable = false),
            @JoinColumn(name = "kdKecamatan", referencedColumnName = "kdKecamatan", insertable = false, updatable = false)
    })
    @Getter @Setter
    private RefKecamatan refKecamatan;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name="kdPropinsi", referencedColumnName = "kdPropinsi", insertable = false, updatable = false),
        @JoinColumn(name="kdDati2", referencedColumnName = "kdDati2", insertable = false, updatable = false),
        @JoinColumn(name="kdKecamatan", referencedColumnName = "kdKecamatan", insertable = false, updatable = false),
        @JoinColumn(name = "kdKelurahan", referencedColumnName = "kdKelurahan", insertable = false, updatable = false)
    })
    @Getter @Setter
    private RefKelurahan refKelurahan;



}
