import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.spielautomat;


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
				String text = "Einsatz wurde auf " + this.myDialog.tfEinsatz.getText() + " gesetzt";
				this.myDialog.lblwhatChanged.setText(text);
				this.myDialog.mainWindow.playfield.setEinsatz( Integer.parseInt(this.myDialog.tfEinsatz.getText()) );
			}
			if(cmd == "EinsatzDefault"){
				this.myDialog.tfEinsatz.setText("5");
				String text = "Einsatz wurde auf " + this.myDialog.tfEinsatz.getText() + " gesetzt";
				this.myDialog.lblwhatChanged.setText(text);
				this.myDialog.mainWindow.playfield.setEinsatz( 5 ); //TODO: Why final changed in Playfield?
			}
			if(cmd == "Back"){
				this.myDialog.showMyDialog();
			}
		}

		
	}

}
