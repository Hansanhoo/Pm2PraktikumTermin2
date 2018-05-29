package de.hawhh.informatik.sml.medien;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.hawhh.informatik.sml.fachwerte.Geldbetrag;

/**
 */
public class KonsolenVideospielTest extends AbstractVideospielTest
{

  
	
	
    public KonsolenVideospielTest()
    {   	
    	super();    	
    }
   
    @Override
    protected AbstractVideospiel getMedium()
    {
        return new KonsolenVideospiel(AbstractVideospielTest.TITEL, AbstractVideospielTest.KOMMENTAR, AbstractVideospielTest.SYSTEM);
    }

    @Override
    @Test
    public void testBerechneMiete() {
    	
    	//Basispreis
    	Geldbetrag testMoney1 = _videoSpiel.berechneMietgebuehr(1);
    	assertEquals(testMoney1.getEuroAnteil(),2);
    	//2 Tage(2€ basis + 0€)
    	testMoney1 = _videoSpiel.berechneMietgebuehr(2);
    	assertEquals(testMoney1.getEuroAnteil(),2);
    	//3 Tage (2€ basis + 3/3(int) *7)
    	testMoney1 = _videoSpiel.berechneMietgebuehr(3);
    	assertEquals(testMoney1.getEuroAnteil(),9);
    	//5 Tage (2€ basis + 5/3(int) *7)
    	testMoney1 = _videoSpiel.berechneMietgebuehr(5);
    	assertEquals(testMoney1.getEuroAnteil(),9);
    	//6 Tage (2€ basis +6/3(int) *7)  
    	testMoney1 = _videoSpiel.berechneMietgebuehr(6);
    	assertEquals(testMoney1.getEuroAnteil(),16);
    	//10 Tage (2€ basis +10/3(int) *7)  
    	testMoney1 = _videoSpiel.berechneMietgebuehr(10);
    	assertEquals(testMoney1.getEuroAnteil(),23);
    	//31 Tage (2€ basis +31/3(int) *7)  
    	testMoney1 = _videoSpiel.berechneMietgebuehr(31);
    	assertEquals(testMoney1.getEuroAnteil(),72); 
    	//100 Tage  (2€ basis +100/3(int) *7)  
    	testMoney1 = _videoSpiel.berechneMietgebuehr(100);
    	assertEquals(testMoney1.getEuroAnteil(),233);    
    	
    }



}
