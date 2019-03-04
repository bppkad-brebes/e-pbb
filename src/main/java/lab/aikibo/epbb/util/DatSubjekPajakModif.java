package lab.aikibo.epbb.util;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class DatSubjekPajakModif implements ReturnData {

    @Getter @Setter @NonNull
    private String wp_nama;
    @Getter @Setter @NonNull
    private String wp_jalan;
    @Getter @Setter @NonNull
    private String wp_rtrw;
    @Getter @Setter @NonNull
    private String wp_kel;
    @Getter @Setter @NonNull
    private String wp_kota;

}
