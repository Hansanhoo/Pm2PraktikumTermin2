import java.io.FileWriter;
import java.io.IOException;

public class VerleihProtokollierer
{
	/**
	 * @ensure verleihkarte!=null
	 *
	 * @param ereignis (e. Ausgeliehen o .Zurückgegeben)
	 * @param verleihkarte
	 *            
	 */
	public void protokolliere(VerleihEreignis ereignis,
			Verleihkarte verleihkarte) throws ProtokollierException
	{
		assert verleihkarte != null : "Vorbedingung verletzt: verleihkarte nicht vorhanden";

		switch (ereignis)
		{
			//FileWriter implemnts Autocloseable seit Java 7 davor try,catch,finally ...
			case Verliehen:
				try (FileWriter fw = new FileWriter(
						"C:\\Users\\hansanhoo\\Documents\\Verleih.txt", true);)
				{

					fw.write(ereignis + "\n"
							+ verleihkarte.getFormatiertenString());
					fw.close();
				}
				catch (IOException e1)
				{
					throw new ProtokollierException(e1.getMessage());

				}
				break;
			case Rückgabe:
				try (FileWriter fw = new FileWriter(
						"C:\\Users\\hansanhoo\\Documents\\Rückgabe.txt", true);)
				{

					fw.write(ereignis + "\n"
							+ verleihkarte.getFormatiertenString());
					fw.close();
				}
				catch (IOException e1)
				{
					throw new ProtokollierException(e1.getMessage());
				}
				break;
		}
		System.out.println(ereignis);
		System.out.println(verleihkarte.getFormatiertenString());

	}
}
