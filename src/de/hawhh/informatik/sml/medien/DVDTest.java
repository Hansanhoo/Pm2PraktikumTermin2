package de.hawhh.informatik.sml.medien;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.hawhh.informatik.sml.fachwerte.Geldbetrag;
 
public class DVDTest extends AbstractMediumTest
{
 
    private static final String BEZEICHNUNG = "DVD";  
    private static final String REGISSEUR = "DVD Regisseur";
    private static final int LAUFZEIT = 100;
    private DVD _dvd1;
    private DVD _dvd2;

    public DVDTest()
    {
    	super();
        _dvd1 = (DVD)getMedium();
        _dvd2 = (DVD)getMedium();
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String dvdBezeichnung = BEZEICHNUNG;
        assertEquals(dvdBezeichnung, _dvd1.getMedienBezeichnung());
    }
    @Test
    public void testBerechneMiete() {
    	Geldbetrag testMoney1 = _dvd1.berechneMietgebuehr(1);
    	Geldbetrag testMoney2 = _dvd2.berechneMietgebuehr(2);

    	assertEquals(testMoney1.getEuroAnteil(),3);
    	assertEquals(testMoney2.getEuroAnteil(),6);
    }
    @Test
    public void testThisKonstruktor()
    {        
        assertEquals(REGISSEUR, _dvd1.getRegisseur());
        assertEquals(LAUFZEIT, _dvd1.getLaufzeit());
    }

    @Test
    public final void testThisSetter()
    {       
        _dvd1.setRegisseur("Regisseur2");
        assertEquals("Regisseur2", _dvd1.getRegisseur());
        _dvd1.setLaufzeit(90);
        assertEquals(90, _dvd1.getLaufzeit());	 
    }

    protected AbstractMedium getMedium()
    {
        return new DVD(AbstractMediumTest.TITEL, AbstractMediumTest.KOMMENTAR, REGISSEUR, LAUFZEIT);
    }



}
