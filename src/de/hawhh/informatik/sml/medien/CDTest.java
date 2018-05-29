package de.hawhh.informatik.sml.medien;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.hawhh.informatik.sml.fachwerte.Geldbetrag;

public class CDTest extends AbstractMediumTest
{
    private static final String CD_BEZEICHNUNG = "CD";
    private static final String INTERPRET = "CD Interpret";
    protected static final int LAENGE = 100;
    
    private CD _cd1;
    private CD _cd2;

    public CDTest()
    {
    	super();
        _cd1 = (CD)getMedium();
        _cd2 = (CD)getMedium();
    }
    @Test
    public void testBerechneMiete() {
    	Geldbetrag testMoney1 =_cd1.berechneMietgebuehr(1);
    	Geldbetrag testMoney2 =_cd2.berechneMietgebuehr(2);

    	assertEquals(testMoney1.getEuroAnteil(),3);
    	assertEquals(testMoney2.getEuroAnteil(),6);
    }
    @Test
    public void testGetMedienBezeichnung()
    {
        String cdBezeichnung = CD_BEZEICHNUNG;
        assertEquals(cdBezeichnung, _cd1.getMedienBezeichnung());
    }
    
    @Test
    public void testThisKonstruktor()
    {        
        assertEquals(INTERPRET, _cd1.getInterpret());
        assertEquals(LAENGE, _cd1.getSpiellaenge());
    }

    @Test
    public final void testInterpret()
    {   
        _cd1.setInterpret("Interpret2");
        assertEquals(_cd1.getInterpret(), "Interpret2");  
    }


    protected AbstractMedium getMedium()
    {
        return new CD(AbstractMediumTest.TITEL, AbstractMediumTest.KOMMENTAR, INTERPRET, LAENGE);
    }



}
