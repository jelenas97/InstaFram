package gui;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class MainSecond {

	static String[] ucitanTekst;
	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		

		FileInputStream f = new FileInputStream("setup.txt");
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(f));
		try {

          ucitanTekst = (String[])ois.readObject();
			
		} finally {
			ois.close();
		}
	
		MainWindow2.getInstance2().showFirstWizard();
	}
	
	public String getWel() {
		return ucitanTekst[0];
		
	}
	
	public String getLic() {
		return ucitanTekst[1];
		
	}
	
	
	public String getNameC() {
		return ucitanTekst[3];
	}
	
	
	
	

	
}
