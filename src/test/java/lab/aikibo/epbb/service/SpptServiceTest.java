package lab.aikibo.epbb.service;

import lab.aikibo.epbb.util.PiutangSpptModif;
import lab.aikibo.epbb.util.SpptModif;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpptServiceTest {

    @Autowired SpptService spptService;

    @Test
    public void getSppt() {
        //List<SpptModif> result = spptService.getSppt("332901000100500390");
        List<SpptModif> result = spptService.getSppt("332901000100100010");
        for(int i=0; i<result.size(); i++) {
            System.out.println(result.get(i).getTahun());
        }
        Assert.assertEquals(8, result.size());
    }

    @Test
    public void getPiutang() {
        PiutangSpptModif result = spptService.getPiutang("332911090400000967", "1994");
        Assert.assertEquals(new BigDecimal("2088"), result.getJumlah());
    }
}