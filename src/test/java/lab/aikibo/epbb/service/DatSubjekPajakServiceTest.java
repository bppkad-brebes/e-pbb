package lab.aikibo.epbb.service;

import lab.aikibo.epbb.entity.DatObjekPajak;
import lab.aikibo.epbb.util.DatSubjekPajakModif;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatSubjekPajakServiceTest {

    @Autowired private DatSubjekPajakService datSubjekPajakService;

    @Test
    public void getSubjekPajak() {
        DatSubjekPajakModif result = datSubjekPajakService.getSubjekPajak("332901000100500390");
        Assert.assertEquals("KARSO", result.getWp_nama());
        Assert.assertEquals("KP RW 01", result.getWp_jalan());
        Assert.assertEquals("RT. 002 RW. 01", result.getWp_rtrw());
        Assert.assertEquals("GUNUNGJAYA", result.getWp_kel());
        Assert.assertEquals("KAB BREBES", result.getWp_kota());
    }

    @Test
    public void getListObjekPajakByNmWpTest() {
        Map<String, List<DatObjekPajak>> result = datSubjekPajakService.getListObjekPajakByNmWp("TAMAMI");

        Set resultSet = result.keySet();
        Iterator<String> it = resultSet.iterator();
        while(it.hasNext()) {
            String resultString = it.next();
            System.out.println(resultString);

            List list = result.get(resultString);
            System.out.println("banyaknya data : " + list.size());
            Assert.assertNotNull(list);
        }

    }
}