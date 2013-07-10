import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;


public class MyToolbar extends JToolBar{
	
	JButton btnHighscore;
	JButton btnPlayerNameOK;
	JTextField tfPlayerName;
	
	Playfield playfield;
	ListenerMyToolbar listenerMyToolbar;
	
	public MyToolbar(Playfield _playfield){
		this.playfield = _playfield;
		
		this.setSize(500, 40);
		this.listenerMyToolbar = new ListenerMyToolbar(this);
		
		//Toolbar Elements
		this.btnHighscore = new JButton("Highscore");
		this.btnHighscore.addActionListener(listenerMyToolbar);
		
		this.tfPlayerName = new JTextField("Player1");
		
		this.btnPlayerNameOK = new JButton("OK");
		this.btnPlayerNameOK.addActionListener(listenerMyToolbar);
		

		
		this.add(this.btnHighscore);
		this.add(this.tfPlayerName);
		this.add(this.btnPlayerNameOK);
	}

}
