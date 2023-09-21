package chicharronera;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class chicharron {

	private JFrame frmLaChicharronera;
	private JTextField text1a;
	private JTextField text2b;
	private JTextField text3c;
	private JButton btncalcular;
	private JButton btnborrar;
	private JLabel lblb;
	private JLabel lblsolucion1;
	private JLabel lblsolucion2;
	private JLabel lbla;
	private JLabel lblc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chicharron window = new chicharron();
					window.frmLaChicharronera.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public chicharron() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaChicharronera = new JFrame();
		frmLaChicharronera.setFont(new Font("Verdana", Font.BOLD, 12));
		frmLaChicharronera.setTitle("la chicharronera");
		frmLaChicharronera.setBounds(100, 100, 517, 351);
		frmLaChicharronera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaChicharronera.setLocationRelativeTo(null);
		frmLaChicharronera.getContentPane().setLayout(null);
		
		lbla = new JLabel("A:");
		lbla.setBounds(10, 26, 46, 14);
		frmLaChicharronera.getContentPane().add(lbla);
		
		lblb = new JLabel("B:");
		lblb.setBounds(10, 51, 46, 14);
		frmLaChicharronera.getContentPane().add(lblb);
		
		lblc = new JLabel("C:");
		lblc.setBounds(10, 83, 46, 14);
		frmLaChicharronera.getContentPane().add(lblc);
		
		text1a = new JTextField();
		text1a.setBounds(33, 23, 86, 20);
		frmLaChicharronera.getContentPane().add(text1a);
		text1a.setColumns(10);
		
		text2b = new JTextField();
		text2b.setBounds(33, 51, 86, 20);
		frmLaChicharronera.getContentPane().add(text2b);
		text2b.setColumns(10);
		
		text3c = new JTextField();
		text3c.setBounds(33, 76, 86, 20);
		frmLaChicharronera.getContentPane().add(text3c);
		text3c.setColumns(10);
		
		btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				double a=Double.parseDouble(text1a.getText());	
				double b=Double.parseDouble(text2b.getText());
				double c=Double.parseDouble(text3c.getText());
				
				LaChicharronera(a,b,c);
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		});
		btncalcular.setBounds(10, 132, 89, 23);
		frmLaChicharronera.getContentPane().add(btncalcular);
		
		btnborrar = new JButton("Borrar");
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1a.setText("");
				text2b.setText("");	
				text3c.setText("");	
				lblsolucion1.setText("");
				lblsolucion2.setText("");
			}
		});
		btnborrar.setBounds(109, 132, 89, 23);
		frmLaChicharronera.getContentPane().add(btnborrar);
		
		lblsolucion1 = new JLabel("solucion1:");
		lblsolucion1.setBounds(10, 190, 188, 28);
		frmLaChicharronera.getContentPane().add(lblsolucion1);
		
		lblsolucion2 = new JLabel("solucion2:");
		lblsolucion2.setBounds(10, 229, 188, 28);
		frmLaChicharronera.getContentPane().add(lblsolucion2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(chicharron.class.getResource("/chicharronera/for.png")));
		lblNewLabel_5.setBounds(234, 22, 164, 222);
		frmLaChicharronera.getContentPane().add(lblNewLabel_5);
	}
	public void LaChicharronera(double a,double b,double c) {
		double valor=Math.pow(b,2)-4*a*c;
		if (valor==0) {
			lblsolucion1.setText("Valor:"+valor);
		}else if(valor>0) {
		double valoe2=(-b+ Math.sqrt(valor)) /2*a;
		lblsolucion1.setText("Valor:"+valoe2);
		double valoe3=(-b- Math.sqrt(valor)) /2*a;
		lblsolucion2.setText("Valor:"+valoe3);
		}else if(valor<0) {
			lblsolucion1.setText("No hay solucion");
			lblsolucion2.setText("No hay solucion");
		}
	}
}
