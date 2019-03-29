package actionListener;

import gui.MainWindow2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Action implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		MainWindow2.getInstance2();
		// TODO Auto-generated method stub
		try {
			MainWindow2.unzip(MainWindow2.getInstance2().getChoosePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
