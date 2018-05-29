package de.hawhh.informatik.sml.medien;

public class KonsolenVideospiel extends AbstractVideospiel
{
	/**
	 * Konstruktor für ein Konsolen Spiel
	 * @param titel
	 * @param kommentar
	 */
	public KonsolenVideospiel(String titel, String kommentar,String system) {
		super(titel,kommentar, system);
	}
	/**
	 * Berechnet den PreisNach Tagen 
	 * Alle 3 Tage + 7 €
	 * 
	 * @param mietTage
	 * 
	 */
	public int getPreisNachTagen(int mietTage) {			
		return mietTage/3 * 700;		
	}
}
