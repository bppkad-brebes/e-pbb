package lab.aikibo.epbb.util;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class SpptModif implements ReturnData {

    @Getter @Setter @NonNull
    private String tahun;
    @Getter @Setter @NonNull
    private BigDecimal jumlah;
    @Getter @Setter @NonNull
    private String status;

}
