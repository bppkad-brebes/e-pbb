package lab.aikibo.epbb.service;

import lab.aikibo.epbb.util.DatObjekPajakModif;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatObjekPajakServiceTest {

    @Autowired private DatObjekPajakService datObjekPajakService;

    @Test
    public void getOp() {
        DatObjekPajakModif result = datObjekPajakService.getOp("332901000100500390");
        Assert.assertEquals("SALEM", result.getOp_kec());
        Assert.assertEquals("GUNUNGJAYA", result.getOp_kel());
        Assert.assertEquals("KP RW 01", result.getOp_jalan());
        Assert.assertEquals("RT. 002 RW. 01", result.getOp_rtrw());
        Assert.assertEquals(new BigDecimal("80"), result.getOp_luas_bumi());
        Assert.assertEquals(new BigDecimal("40"), result.getOp_luas_bng());
        Assert.assertEquals(new BigDecimal("1600000"), result.getOp_njop_bumi());
        Assert.assertEquals(new BigDecimal("9000000"), result.getOp_njop_bng());
        Assert.assertEquals("332901000100500390", result.getOp_wp_id().trim());
    }

}