package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class UnderAgeTest {

    @Test
    public void validarEdadMinima() throws Exception {
        PersonaEdadMinima p = new PersonaEdadMinima();
        Assert.assertTrue(p.EdadMinima(17));
        Assert.assertTrue(p.EdadMinima(15));
        Assert.assertTrue(p.EdadMinima(10));
        Assert.assertTrue(p.EdadMinima(11));
    }

    @Test
    public void ErrordeEdad() throws Exception {
        PersonaEdadMinima p = new PersonaEdadMinima();
        Assert.assertFalse(p.EdadMinima(18));
        Assert.assertFalse(p.EdadMinima(19));
        Assert.assertFalse(p.EdadMinima(150));
        Assert.assertFalse(p.EdadMinima(159));
    }

    @Test(expected = java.lang.Exception.class)
    public void EdadMnima() throws Exception {
        PersonaEdadMinima p = new PersonaEdadMinima();
        p.EdadMinima(18);
        p.EdadMinima(19);
        p.EdadMinima(1000);
        p.EdadMinima(-100);

    }
}
