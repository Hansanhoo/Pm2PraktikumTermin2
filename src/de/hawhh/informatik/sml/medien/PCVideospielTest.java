package de.hawhh.informatik.sml.medien;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.hawhh.informatik.sml.fachwerte.Geldbetrag;

/**
 */
public class PCVideospielTest extends AbstractVideospielTest
{
	

    public PCVideospielTest()
    {
    	super();
    }

    @Override
    protected AbstractVideospiel getMedium()
    {
        return new PCVideospiel(AbstractVideospielTest.TITEL, AbstractVideospielTest.KOMMENTAR, AbstractVideospielTest.SYSTEM);
    }
    
    /**
     * 1 = 2€ (2€ basis + 0€)
		7 = 2€ (2€ basis + 0€)
		8 = 7€ (2€ basis +   ((8-7)/5))(Aufrunden) * 5€)
		13 = 12€ (2€ basis + ((13-7)/5))(Aufrunden) * 5€)
		30 = 27€ (2€ basis + ((30-7)/5))(Aufrunden) * 5€)
		30 = 27€ (2€ basis + ((30-7)/5))(Aufrunden) * 5€)
		32 = 27€ (2€ basis + ((32-7)/5))(Aufrunden) *5€)
		100 = 97€ (2€ basis + ((100-7)/5))(Aufrunden) *5€)

     */
    @Override
    @Test
    public void testBerechneMiete() {
    	
    	//Basispreis
    	Geldbetrag testMoney1 = _videoSpiel.berechneMietgebuehr(1);
    	assertEquals(testMoney1.getEuroAnteil(),2);
    	//2 Tage 2€
    	testMoney1 = _videoSpiel.berechneMietgebuehr(2);
    	assertEquals(testMoney1.getEuroAnteil(),2);
    	//3 Tage 2€
    	testMoney1 = _videoSpiel.berechneMietgebuehr(3);
    	assertEquals(testMoney1.getEuroAnteil(),2);
    	//6 Tage 2€
    	testMoney1 = _videoSpiel.berechneMietgebuehr(6);
    	assertEquals(testMoney1.getEuroAnteil(),2);
    	//7 Tage 2€
    	testMoney1 = _videoSpiel.berechneMietgebuehr(7);
    	assertEquals(testMoney1.getEuroAnteil(),2);
    	//8 Tage 7€
    	testMoney1 = _videoSpiel.berechneMietgebuehr(8);
    	assertEquals(testMoney1.getEuroAnteil(),7); 
    	//12 Tage  2€ + ( 5 * 1 ) 
    	testMoney1 = _videoSpiel.berechneMietgebuehr(12);
    	assertEquals(testMoney1.getEuroAnteil(),7);    
    	//13 Tage 2€ + ( 5 * 2 ) 
    	testMoney1 = _videoSpiel.berechneMietgebuehr(13);
    	assertEquals(testMoney1.getEuroAnteil(),12); 
    	//17 Tage 2€ + ( 5 * 2 ) 
    	testMoney1 = _videoSpiel.berechneMietgebuehr(17);
    	assertEquals(testMoney1.getEuroAnteil(),12); 
    	//18 Tage 2€ + ( 5 * 3 ) 
    	testMoney1 = _videoSpiel.berechneMietgebuehr(18);
    	assertEquals(testMoney1.getEuroAnteil(),17); 
    	//30 Tage 2€ + ( 5 * 5 ) 
    	testMoney1 = _videoSpiel.berechneMietgebuehr(30);
    	assertEquals(testMoney1.getEuroAnteil(),27); 
    	//100 Tage 2€ + ( 5 * 19 )
    	testMoney1 = _videoSpiel.berechneMietgebuehr(100);
    	assertEquals(testMoney1.getEuroAnteil(),97); 
    }



}
