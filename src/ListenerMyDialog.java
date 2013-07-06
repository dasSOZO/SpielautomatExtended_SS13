import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class ListenerMyDialog implements ActionListener{

	MyDialog myDialog;
	
	public ListenerMyDialog(MyDialog _myDialog){
		this.myDialog = _myDialog;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		if(e.getSource() instanceof JButton){
			JButton sourceBtn = (JButton) e.getSource();
			
			
			if(cmd == "EinsatzOK"){
				this.myDialog.mainWindow.playfield.setEinsatz( Integer.parseInt(this.myDialog.tfEinsatz.getText()) );
			}
		}

		
	}

}
