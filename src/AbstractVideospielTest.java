import static org.junit.Assert.assertEquals;

import org.junit.Test;

public abstract class AbstractVideospielTest extends AbstractMediumTest
{

    protected static final String BEZEICHNUNG = "Videospiel";
    protected static final String SYSTEM = "System";
    protected AbstractVideospiel _videoSpiel;    
    
    
    public AbstractVideospielTest() {
    	super();
    	_videoSpiel = getMedium();
    } 
    @Test
    public void testeVideospiel()
    {
        assertEquals(TITEL, _videoSpiel.getTitel());
        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }  
    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _videoSpiel.getMedienBezeichnung());
    }
  //Einschubmethode?
    @Test
    public abstract void testBerechneMiete();
   
  
    protected abstract AbstractVideospiel getMedium();

    
}
