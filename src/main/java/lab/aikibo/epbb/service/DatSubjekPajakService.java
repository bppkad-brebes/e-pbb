package lab.aikibo.epbb.service;

import lab.aikibo.epbb.entity.DatObjekPajak;
import lab.aikibo.epbb.entity.DatSubjekPajak;
import lab.aikibo.epbb.repo.DatObjekPajakRepo;
import lab.aikibo.epbb.repo.DatSubjekPajakRepo;
import lab.aikibo.epbb.util.DatSubjekPajakModif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class DatSubjekPajakService {

    @Autowired
    private DatSubjekPajakRepo datSubjekPajakRepo;

    @Autowired
    private DatObjekPajakRepo datObjekPajakRepo;

    public DatSubjekPajakModif getSubjekPajak(String subjekPajakId) {
        DatSubjekPajak data = datSubjekPajakRepo.findBySubjekPajakId(String.format("%-30s", subjekPajakId));
        return new DatSubjekPajakModif(data.getNmWp(), data.getJalanWp(),
                "RT. " + data.getRtWp() + " RW. " + data.getRwWp(), data.getKelurahanWp(), data.getKotaWp());
    }

    public Map<String, List<DatObjekPajak>> getListObjekPajakByNmWp(String nmWp) {
        List<DatSubjekPajak> listSp = datSubjekPajakRepo.findByNmWpLike(nmWp);
        Map<String, List<DatObjekPajak>> result = new HashMap<>();

        for(DatSubjekPajak sp : listSp) {
            List<DatObjekPajak> listOp = datObjekPajakRepo.findBySubjekPajakId(sp.getSubjekPajakId());
            result.put(sp.getSubjekPajakId(), listOp);
        }

        return result;
    }

}
