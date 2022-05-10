import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PratoTest {

    //Testes com valores:
    @Test
    void deveRetornarValorPrato() {
        Prato prato  = new Feijoada (1.0f);

        assertEquals(1.0f, prato.getValorPedido());
    }

    @Test
    void deveRetornarValorPratoComEspetinho() {
        Prato prato  = new Espetinho(new Feijoada (1.0f));

        assertEquals(16.0f, prato.getValorPedido());
    }

    @Test
    void deveRetornarValorPratoComRefrigerante() {
        Prato prato = new Refrigerante(new Feijoada(1.0f));

        assertEquals(9.0f,prato.getValorPedido());
    }

    @Test
    void deveRetornarValorPratoComSobremesa() {
        Prato prato = new Sobremesa(new Feijoada(1.0f));

        assertEquals(11, prato.getValorPedido());
    }

    @Test
    void deveRetornarValorPratoComEspetinhoERefrigerante() {
        Prato prato  = new Refrigerante(new Espetinho(new Feijoada (1.0f)));

        assertEquals(24.0f, prato.getValorPedido());
    }

    @Test
    void deveRetornarValorPratoComEspetinhoESobremesa() {
        Prato prato = new Sobremesa(new Espetinho( new Feijoada(1.0f)));

        assertEquals(26.0f, prato.getValorPedido());
    }

    @Test
    void deveRetornarValorPratoComRefrigeranteESobremesa() {
        Prato prato = new Sobremesa(new Refrigerante(new Feijoada(1.0f)));

        assertEquals(19.0f, prato.getValorPedido());
    }

    @Test
    void deveRetornarValorPratoComRefrigeranteEspetinhoESobremesa() {
        Prato prato  = new Sobremesa(new Espetinho(new Refrigerante(new Feijoada(1.0f))));

        assertEquals(34.0f, prato.getValorPedido());
    }

    //Testes com String:
    @Test
    void deveRetornarNomePrato() {
        Prato prato  = new Feijoada ();

        assertEquals("Feijoada", prato.getNomePedido());
    }

    @Test
    void deveRetornarNomePratoComEspetinho() {
        Prato prato  = new Espetinho(new Feijoada ());

        assertEquals("Feijoada + Espetinho", prato.getNomePedido());
    }

    @Test
    void deveRetornarNomePratoComRefrigerante() {
        Prato prato = new Refrigerante(new Feijoada());

        assertEquals("Feijoada + Refrigerante",prato.getNomePedido());
    }

    @Test
    void deveRetornarNomePratoComSobremesa() {
        Prato prato = new Sobremesa(new Feijoada());

        assertEquals("Feijoada + Sobremesa", prato.getNomePedido());
    }

    @Test
    void deveRetornarNomePratoComEspetinhoERefrigerante() {
        Prato prato  = new Refrigerante(new Espetinho(new Feijoada ()));

        assertEquals("Feijoada + Espetinho + Refrigerante", prato.getNomePedido());
    }

    @Test
    void deveRetornarNomePratoComEspetinhoESobremesa() {
        Prato prato = new Sobremesa(new Espetinho( new Feijoada()));

        assertEquals("Feijoada + Espetinho + Sobremesa", prato.getNomePedido());
    }

    @Test
    void deveRetornarNomePratoComRefrigeranteESobremesa() {
        Prato prato = new Sobremesa(new Refrigerante(new Feijoada()));

        assertEquals("Feijoada + Refrigerante + Sobremesa", prato.getNomePedido());
    }

    @Test
    void deveRetornarNomePratoComRefrigeranteEspetinhoESobremesa() {
        Prato prato  = new Sobremesa(new Espetinho(new Refrigerante(new Feijoada())));

        assertEquals("Feijoada + Refrigerante + Espetinho + Sobremesa", prato.getNomePedido());
    }


}