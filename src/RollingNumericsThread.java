import model.spielautomat;


public class RollingNumericsThread extends Thread {
	/***
	 * DEPRECATED. Use printRollingNumerics() and use Thread which is initialized with startRollen() stopRollen()
	 */
	
	Playfield playfield;
	spielautomat game;
	boolean isRunning;
	
	public RollingNumericsThread(Playfield _playfield){
		this.playfield = _playfield;
		this.game = spielautomat.getInstance();
		this.isRunning = true;
		
	}
	
	public void run(){
		this.playfield.startGame();
		
		while(this.isRunning){
			this.playfield.numerics = this.game.getZiffern();
//			System.out.println("THREADnumerics: " +  playfield.numerics[0] + playfield.numerics[1] + playfield.numerics[2] + playfield.numerics[3] );

			for(int i = 0; i < 4; i++){
				this.playfield.automat[i].setText(Integer.toString(playfield.numerics[i]));
			}
		}
		System.out.println("Thread EXIT");
		
	}
	
	public void stopRollingNumericsThread(){
		this.isRunning = false;
	}

}
