package lab.aikibo.epbb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(RefKecamatanPK.class)
public class RefKecamatan {

    @Id @Getter @Setter
    private String kdPropinsi;
    @Id @Getter @Setter
    private String kdDati2;
    @Id @Getter @Setter
    private String kdKecamatan;
    @Getter @Setter
    private String nmKecamatan;

}
