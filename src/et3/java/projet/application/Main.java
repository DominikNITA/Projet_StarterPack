package et3.java.projet.application;

import java.io.File;

import et3.java.projet.data.FileReader;
import et3.java.projet.models.Bibliotheque;
import et3.java.projet.models.Reseau;

public class Main 
{
	public static void main(String[] args) 
	{
		if(args.length > 0)
		{
			File tempFile = new File(args[0]);
			Reseau reseau = new Reseau();
			reseau.ajouterBibliotheque(new Bibliotheque("AimeCesaire"));
			reseau.ajouterBibliotheque(new Bibliotheque("EdmondRostand"));
			reseau.ajouterBibliotheque(new Bibliotheque("JeanPierreMelville"));
			reseau.ajouterBibliotheque(new Bibliotheque("OscarWilde"));
			reseau.ajouterBibliotheque(new Bibliotheque("SaintSimon"));
			if(tempFile.exists())
			{
				System.out.println("[Main] Reading the file " + args[0] + " ...");
						
				//We start by reading the CSV file
				FileReader.getDataFromCSVFile(args[0], reseau);
				
				System.out.println("[Main] End of the file " + args[0] + ".");
			}
			else
			{
				System.out.println("[Main] No file " + args[0]);
			}
		}
		else
		{
			System.out.println("[Main] You should enter the CSV file path as a parameter.");
		}
		
		//TODO Project :)
	}
}
