package lab.aikibo.epbb.util;


import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;

public class PiutangSpptModif implements ReturnData {

    @Getter @Setter
    private String tgl_tempo;
    @Getter @Setter
    private BigDecimal jumlah;
    @Getter @Setter
    private String tgl_skrg;
    @Getter @Setter
    private int denda_bln;
    @Getter @Setter
    private BigDecimal denda_jml;

}
