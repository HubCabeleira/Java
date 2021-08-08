package exemplo.dez;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Event_Detected {
	public static void main(String args[]) {
		
		JFrame janela = new JFrame("Janela");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400,300);
		janela.setLayout(null);
		janela.setVisible(true);
		
		JButton clicavel;
		clicavel = new JButton("Opção1");
		clicavel.setBounds(15, 30, 80, 40);
		janela.add(clicavel);
		
		clicavel.addActionListener(new ActionListener(){	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane dialog = new JOptionPane();
				dialog.showMessageDialog(null,"Program is not home");
			}
		});

	
		
		JMenuBar inicial = new JMenuBar();
		JMenu opções = new JMenu("Options");
		JMenuItem item = new JMenuItem("Iten");
		
		janela.setJMenuBar(inicial);
		opções.add(item);
		inicial.add(opções);
		
		
		item.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				JOptionPane dialog = new JOptionPane();
				dialog.showMessageDialog(null,"Program is not home");
			}
				
		});
		
		}
}
		

	
	
