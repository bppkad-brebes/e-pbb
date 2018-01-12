package lab.aikibo.epbb.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;

@Entity
@IdClass(RefKelurahanPK.class)
public class RefKelurahan {

    @Id @Getter @Setter
    private String kdPropinsi;
    @Id @Getter @Setter @Column(insertable = false, updatable = false)
    private String kdDati2;
    @Id @Getter @Setter
    private String kdKecamatan;
    @Id @Getter @Setter
    private String kdKelurahan;
    @Getter @Setter
    private String kdSektor;
    @Getter @Setter
    private String nmKelurahan;
    @Getter @Setter
    private BigDecimal noKelurahan;
    @Getter @Setter
    private String kdPosKelurahan;


}
