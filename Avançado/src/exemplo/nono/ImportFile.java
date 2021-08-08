package exemplo.nono;

import java.io.File;
import javax.swing.JFileChooser;

public class ImportFile {
	public static void main(String args[]) {
		JFileChooser importa = new JFileChooser();
		int returno = importa.showOpenDialog(null);
		if(returno == JFileChooser.APPROVE_OPTION) {
			File file = importa.getSelectedFile();
			System.out.println(file.toString());
		}else {
			System.out.println("Não selecionado.");
		}
		
				
	}
	
}
