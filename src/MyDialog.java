import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.spielautomat;


public class MyDialog extends JDialog{
	
	MainWindow mainWindow;
	JDialog mdDialog;
	
	JPanel panelBtnEinsatz;
	JPanel panelBtnStartguthaben;
	JPanel panelDialog;
	
	JTextField tfStartguthaben;
	JTextField tfEinsatz;
	
	JButton btnStartguthabenOK;
	JButton btnStartguthabenDefault;
	JButton btnEinsatzOK;
	JButton btnEinsatzDefault;
	
	
	boolean mdDialogIsVisible = false;
	
	public MyDialog(MainWindow _mainWindow){
		this.mainWindow = _mainWindow;
		
		this.panelBtnEinsatz = new JPanel();
		this.panelBtnStartguthaben = new JPanel();
		
		this.mdDialog = new JDialog(this.mainWindow, "Change StartConditions");
		
		//CREATE dialog elements
		this.tfStartguthaben = new JTextField(Integer.toString(spielautomat.STARTGUTHABEN));
		this.tfEinsatz = new JTextField(Integer.toString(spielautomat.STARTEINSATZ));
		
		this.btnEinsatzOK = new JButton("OK");
		this.btnEinsatzOK.setActionCommand("EinsatzOK");
		this.btnEinsatzDefault = new JButton("Standard");
		this.btnEinsatzDefault.setActionCommand("EinsatzDefault");
		
		this.btnStartguthabenOK = new JButton("OK");
		this.btnStartguthabenOK.setActionCommand("GuthabenOK");
		this.btnStartguthabenDefault = new JButton("Standard");
		this.btnStartguthabenDefault.setActionCommand("GuthabenStandard");
		
		//Add to panels
		this.panelBtnStartguthaben.setLayout(new GridLayout(1, 2));
		this.panelBtnStartguthaben.add(this.btnStartguthabenDefault);
		this.panelBtnStartguthaben.add(this.btnStartguthabenOK);
		
		this.panelBtnEinsatz.setLayout(new GridLayout(1, 2));
		this.panelBtnEinsatz.add(this.btnEinsatzDefault);
		this.panelBtnEinsatz.add(this.btnEinsatzOK);
		
		//Add to Dialog
		this.mdDialog.setLayout(new GridLayout(4, 1));
		this.mdDialog.add(this.tfEinsatz);
		this.mdDialog.add(panelBtnEinsatz);
		this.mdDialog.add(this.tfStartguthaben);
		this.mdDialog.add(this.panelBtnStartguthaben);
		
		this.mdDialog.pack();
		this.mdDialog.setVisible(this.mdDialogIsVisible);		
	}
	
	public void showMyDialog(){
		this.mdDialogIsVisible = !this.mdDialogIsVisible;
		this.mdDialog.setVisible(this.mdDialogIsVisible);
	}

}
