package de.hawhh.informatik.sml.medien;

import java.text.DecimalFormat;

public class PCVideospiel extends AbstractVideospiel
{
	/**
	 * Konstruktor eines PCSpiels
	 * 
	 * @param titel
	 * @param kommentar
	 */
	public PCVideospiel(String titel, String kommentar, String system)
	{
		super(titel, kommentar, system);
	}

	/**
	 *  Berechnet den PreisNach Tagen 	 *  
	 *  @param mietTage 
	 */
	public int getPreisNachTagen(int mietTage) {
		//die ersten 7 Tage gar nichts
		if(mietTage < 7) {
			return 0;
		}
		else {		
			//double um aufrunden zu können
			double helper = ((mietTage -7)/5.00);
			
			//je angefangene 5 Tage 500 Euro-Cent 
			int wert = (int) (Math.ceil(helper)) * 500;
			System.out.print(wert);
			
			return  wert;
		}
	}
}
