package lab.aikibo.epbb.entity;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class DatObjekPajakPK implements Serializable {

    @Getter @Setter
    private String kdPropinsi;
    @Getter @Setter
    private String kdDati2;
    @Getter @Setter
    private String kdKecamatan;
    @Getter @Setter
    private String kdKelurahan;
    @Getter @Setter
    private String kdBlok;
    @Getter @Setter
    private String noUrut;
    @Getter @Setter
    private String kdJnsOp;

}
