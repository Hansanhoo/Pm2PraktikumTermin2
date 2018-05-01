import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public abstract class AbstractMediumTest
{
	   protected static final String KOMMENTAR = "Kommentar";
	   protected static final String TITEL = "Titel";
	   
	   private AbstractMedium _abstractMedium;
	   private AbstractMedium _abstractMedium2;
	   
	   
	   public AbstractMediumTest() {
		   _abstractMedium = getMedium();
		   _abstractMedium2 = getMedium();
	   }
	    @Test
	    public final void testGetFormatiertenString()
	    {
	    	AbstractMedium medium = getMedium();
	        assertNotNull(medium.getFormatiertenString());
	    }
	    @Test
	    /*
	     * Von ein und der selben CD kann es mehrere Exemplare geben, die von
	     * unterschiedlichen Personen ausgeliehen werden können.
	     */
	    public void testEquals()
	    {
	        assertFalse("Mehrere Exemplare der gleichen CD sind ungleich",
	        		_abstractMedium.equals(_abstractMedium2));
	        assertTrue("Dasselbe Exemplare der gleichen CD ist gleich",
	        		_abstractMedium.equals(_abstractMedium));
	    }
	    @Test
	    public final void testSetter()
	    {
	    	_abstractMedium.setKommentar("Kommentar2");
	        assertEquals(_abstractMedium.getKommentar(), "Kommentar2");
	        _abstractMedium.setTitel("Titel2");
	        assertEquals(_abstractMedium.getTitel(), "Titel2");
	      
	    }
	    @Test
	    public void testKonstruktor()
	    {
	        assertEquals(AbstractMediumTest.TITEL, _abstractMedium.getTitel());
	        assertEquals(AbstractMediumTest.KOMMENTAR, _abstractMedium.getKommentar());
	        
	       
	    }
	    protected abstract AbstractMedium getMedium();
	 //   public abstract void testThisKonstruktor();
	    public abstract void testGetMedienBezeichnung();
	    public abstract void testBerechneMiete();
}
