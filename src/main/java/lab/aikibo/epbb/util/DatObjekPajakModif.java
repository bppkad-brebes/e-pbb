package lab.aikibo.epbb.util;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class DatObjekPajakModif implements ReturnData {

    @Getter @Setter @NonNull
    private String op_kec;
    @Getter @Setter @NonNull
    private String op_kel;
    @Getter @Setter @NonNull
    private String op_jalan;
    @Getter @Setter @NonNull
    private String op_rtrw;
    @Getter @Setter @NonNull
    private BigDecimal op_luas_bumi;
    @Getter @Setter @NonNull
    private BigDecimal op_luas_bng;
    @Getter @Setter @NonNull
    private BigDecimal op_njop_bumi;
    @Getter @Setter @NonNull
    private BigDecimal op_njop_bng;
    @Getter @Setter @NonNull
    private String op_wp_id;

}
