package lab.aikibo.epbb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DatSubjekPajak {

    @Id @Getter @Setter
    private String subjekPajakId;
    @Getter @Setter
    private String nmWp;
    @Getter @Setter
    private String jalanWp;
    @Getter @Setter
    private String blokKavNoWp;
    @Getter @Setter
    private String rwWp;
    @Getter @Setter
    private String rtWp;
    @Getter @Setter
    private String kelurahanWp;
    @Getter @Setter
    private String kotaWp;
    @Getter @Setter
    private String kdPosWp;
    @Getter @Setter
    private String telpWp;
    @Getter @Setter
    private String npwp;
    @Getter @Setter
    private char statusPekerjaanWp;

}
