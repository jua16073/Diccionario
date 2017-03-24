import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Object;
import java.util.TreeSet;

import javax.swing.JFileChooser;
public class Traducir {
String lectura() throws IOException{
		String a = null; 
		
		JFileChooser archivo = new JFileChooser();
		archivo.showOpenDialog(null);
		BufferedReader reader = new BufferedReader(new FileReader(archivo.getSelectedFile().getPath()));
		
		while(reader.ready()){
			a = reader.readLine();
			return a;
		}
		return a;
	}
	
}
