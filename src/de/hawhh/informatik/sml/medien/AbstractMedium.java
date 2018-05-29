package de.hawhh.informatik.sml.medien;

import de.hawhh.informatik.sml.fachwerte.Geldbetrag;

/**
 * AbstractClass Medium Klasse für Medien(CD;DVD;VIDEOSPIEL)
 * @author hansanhoo
 *
 */
abstract public class AbstractMedium 
{
    /**
     * Ein Kommentar zum AbstractMedium
     */
    private String _kommentar;

    /**
     * Der Titel des AbstractMedium
     */
    private String _titel;
    /**
     * Konstruktor für AbstractMedium
     * @param kommentar
     * @param titel
     * 
     * @require titel != null
     * @require kommentar != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     */
    public AbstractMedium(String titel, String kommentar) {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
      	_kommentar = kommentar;
    	_titel = titel;
    }
    /**
     * @return _titel vom Medium
     */
	public String getTitel()
	{
		return _titel;
	}
	/**
	 * Setzt Titel vom Medium 
	 * @param titel
	 * @ensure titel != null
	 */
	public void setTitel(String titel)
	{
		assert titel != null : "Vorbedingung verletzt: titel != null";
		_titel = titel;
	}
	/**
	 * @return _kommentar vom Medium
	 */
	public String getKommentar()
	{
		return _kommentar;
	}
	/**
	 * Setzt Kommentar vom Medium 
	 * @param kommentar
	 * @ensure kommentar != null
	 */
	public void setKommentar(String kommentar)
	{
		assert kommentar != null : "Vorbedingung verletzt: titel != null";
		_kommentar = kommentar;
	}
	public String getFormatiertenString() {
		 return "Titel: " + _titel
	                + "\n" + "    " + "Kommentar: " + _kommentar;		
	}
	/**
	 * 
	 * @param mietTage
	 * @ensure mietTage > 0
	 * @return Mietgebuehr des Mediums
	 */
	public Geldbetrag berechneMietgebuehr(int mietTage)
	{
		assert mietTage > 0 :"Vorbedingung verletzt: miettage kleiner 0";
		return Geldbetrag.get(mietTage * 300);
	}

  
}
