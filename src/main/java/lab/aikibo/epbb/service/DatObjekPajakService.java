package lab.aikibo.epbb.service;

import lab.aikibo.epbb.entity.DatObjekPajak;
import lab.aikibo.epbb.entity.DatObjekPajakPK;
import lab.aikibo.epbb.repo.DatObjekPajakRepo;
import lab.aikibo.epbb.util.DatObjekPajakModif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatObjekPajakService {

    @Autowired
    private DatObjekPajakRepo datOpRepo;

    public DatObjekPajakModif getOp(String nop) {
        DatObjekPajakPK pk = new DatObjekPajakPK();
        pk.setKdPropinsi(nop.substring(0,2));
        pk.setKdDati2(nop.substring(2,4));
        pk.setKdKecamatan(nop.substring(4,7));
        pk.setKdKelurahan(nop.substring(7,10));
        pk.setKdBlok(nop.substring(10,13));
        pk.setNoUrut(nop.substring(13,17));
        pk.setKdJnsOp(nop.substring(17,18));

        DatObjekPajak data = datOpRepo.findOne(pk);

        return new DatObjekPajakModif(data.getRefKecamatan().getNmKecamatan(),
                data.getRefKelurahan().getNmKelurahan(), data.getJalanOp(), "RT. " + data.getRtOp() + " RW. " + data.getRwOp(), data.getTotalLuasBumi(),
                data.getTotalLuasBng(), data.getNjopBumi(), data.getNjopBng(), data.getSubjekPajakId());
    }

}
