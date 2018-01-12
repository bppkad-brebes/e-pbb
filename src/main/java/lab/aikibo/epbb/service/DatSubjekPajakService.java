package lab.aikibo.epbb.service;

import lab.aikibo.epbb.entity.DatSubjekPajak;
import lab.aikibo.epbb.repo.DatSubjekPajakRepo;
import lab.aikibo.epbb.util.DatSubjekPajakModif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatSubjekPajakService {

    @Autowired
    private DatSubjekPajakRepo datSubjekPajakRepo;

    public DatSubjekPajakModif getSubjekPajak(String subjekPajakId) {
        DatSubjekPajak data = datSubjekPajakRepo.findBySubjekPajakId(String.format("%-30s", subjekPajakId));
        System.out.println("nm wp : " + data.getNmWp());
        return new DatSubjekPajakModif(data.getNmWp(), data.getJalanWp(),
                "RT. " + data.getRtWp() + " RW. " + data.getRwWp(), data.getKelurahanWp(), data.getKotaWp());

    }

}
