import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class ButtonListener implements ActionListener {
	Playfield playfield;
	
	public ButtonListener(Playfield _playfield) {
		this.playfield = _playfield;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() instanceof JButton){
			JButton pushedButton = (JButton) e.getSource();
			
			if(pushedButton.getText() == "start"){
				System.out.println("--start pushed");
				this.playfield.startGame();
			}
			
			if(pushedButton.getText() == "stop"){
				System.out.println("--stop pushed");
				this.playfield.stopGame();
			}
			
			if(pushedButton.getActionCommand() == "togglePubModeButton"){
				System.out.println("TOGGLE PUB Button");
				this.playfield.mainWindow.statusWindow.togglePubModeButton();
			}
			
			
		}

		

	}
	

}
