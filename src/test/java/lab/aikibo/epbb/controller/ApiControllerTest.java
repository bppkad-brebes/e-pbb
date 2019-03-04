package lab.aikibo.epbb.controller;

import lab.aikibo.epbb.entity.JsonObject;
import lab.aikibo.epbb.util.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiControllerTest {

    @Autowired ApiController apiController;

    // - op

    @Test
    public void nopTest() {
        JsonObject jo = new JsonObject();
        jo.setNop("332901000100500390");
        Assert.assertEquals("332901000100500390", jo.getNop());
    }

    @Test
    public void luasBumiOpTest() {
        String body = "keyword=op&nop=332901000100500390";
        DatObjekPajakModif result = (DatObjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals(new BigDecimal("80"), result.getOp_luas_bumi());
    }

    @Test
    public void luasBngOpTest() {
        String body = "keyword=op&nop=332901000100500390";
        DatObjekPajakModif result = (DatObjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals(new BigDecimal("40"), result.getOp_luas_bng());
    }

    @Test
    public void njopBumiTest() {
        String body = "keyword=op&nop=332901000100500390";
        DatObjekPajakModif result = (DatObjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals(new BigDecimal("1600000"), result.getOp_njop_bumi());
    }

    @Test
    public void njopBngTest() {
        String body = "keyword=op&nop=332901000100500390";
        DatObjekPajakModif result = (DatObjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals(new BigDecimal("9000000"), result.getOp_njop_bng());
    }

    @Test
    public void namaJalanOpTest() {
        String body = "keyword=op&nop=332901000100500390";
        DatObjekPajakModif result = (DatObjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals("KP RW 01", result.getOp_jalan());
    }

    @Test
    public void rtRwOpTest() {
        String body = "keyword=op&nop=332901000100500390";
        DatObjekPajakModif result = (DatObjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals("RT. 002 RW. 01", result.getOp_rtrw());
    }

    @Test
    public void kelurahanOpTest() {
        String body = "keyword=op&nop=332901000100500390";
        DatObjekPajakModif result = (DatObjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals("GUNUNGJAYA", result.getOp_kel());
    }

    @Test
    public void kecamatanOpTest() {
        String body = "keyword=op&nop=332901000100500390";
        DatObjekPajakModif result = (DatObjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals("SALEM", result.getOp_kec());
    }

    @Test
    public void subjekPajakIdTest() {
        String body = "keyword=op&nop=332901000100500390";
        DatObjekPajakModif result = (DatObjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals("332901000100500390", result.getOp_wp_id().trim());
    }

    // - wp

    @Test
    public void namaWpTest() {
        String body = "keyword=wp&subjek_pajak_id=332901000100500390";
        DatSubjekPajakModif result = (DatSubjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals("KARSO", result.getWp_nama());
    }

    @Test
    public void jalanWpTest() {
        String body = "keyword=wp&subjek_pajak_id=332901000100500390";
        DatSubjekPajakModif result = (DatSubjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals("KP RW 01", result.getWp_jalan());
    }

    @Test
    public void rtRwTest() {
        String body = "keyword=wp&subjek_pajak_id=332901000100500390";
        DatSubjekPajakModif result = (DatSubjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals("RT. 002 RW. 01", result.getWp_rtrw());
    }

    @Test
    public void kelurahanWpTest() {
        String body = "keyword=wp&subjek_pajak_id=332901000100500390";
        DatSubjekPajakModif result = (DatSubjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals("GUNUNGJAYA", result.getWp_kel());
    }

    @Test
    public void kotaWpTest() {
        String body = "keyword=wp&subjek_pajak_id=332901000100500390";
        DatSubjekPajakModif result = (DatSubjekPajakModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals("KAB BREBES", result.getWp_kota());
    }

    // - list sppt

    @Test
    public void listSpptTest() {
        String body = "keyword=sppt&nop=332901000100500390";
        List<SpptModif> result = (List<SpptModif>) apiController.getListSppt2(body, new InstanHttpServletResponse());
        Assert.assertEquals(8, result.size());
    }

    // - besar pbb, sample 3 tahun pajak

    @Test
    public void pajakTerhutangTest() {
        String body = "keyword=bayar&nop=332911090400000967&tahun=1994";
        PiutangSpptModif result = (PiutangSpptModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals(new BigDecimal("2088"), result.getJumlah());

        body = "keyword=bayar&nop=332912090500003797&tahun=1994";
        result = (PiutangSpptModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals(new BigDecimal("2720"), result.getJumlah());

        body = "keyword=bayar&nop=332912090500003657&tahun=1994";
        result = (PiutangSpptModif) apiController.getDataOp2(body, new InstanHttpServletResponse());
        Assert.assertEquals(new BigDecimal("3920"), result.getJumlah());
    }

    @Test
    public void statusPembayaranTest() {
        String body = "keyword=sppt&nop=332901000100500390";
        List<SpptModif> result = (List<SpptModif>) apiController.getListSppt2(body, new InstanHttpServletResponse());
        Assert.assertEquals("LUNAS", result.get(0).getStatus());
        Assert.assertEquals("LUNAS", result.get(1).getStatus());
        Assert.assertEquals("LUNAS", result.get(2).getStatus());
    }

}
