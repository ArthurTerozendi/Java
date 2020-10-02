
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CifraVigenere extends Applet {
    public Controls controls;
	public String strFinal, chave;
	private char[][] matriz;

    public void init() {
		
		matriz = new char[26][26];
		int m = 65; 
		for (int i = 0; i < 26; i++)
		{
			m = 65 + i;
			for (int j = 0; j < 26; j++)
			{
				matriz[i][j] = (char)(m);
				m++;
				if(m > 90)
					m = 65;
			}
		}
		strFinal = "";
		setLayout(new BorderLayout());
		add("Center", controls = new Controls(this));
    }

    public void destroy() {
        remove(controls);
    }

    public void start() {
	controls.setEnabled(true);
    }

    public void stop() {
	controls.setEnabled(false);
    }
	
	public void geraCifra(String linha)
	{
		chave = controls.text1.getText().toUpperCase();  
		int cont = 0;
		strFinal = "";
		for(int i = 0 ; i < linha.length(); i++)
		{
			strFinal += matriz[(int)(linha.charAt(i))-65][(int)(chave.charAt(cont)-65)];
			if (cont >= chave.length()-1)
			{
				cont = 0;
			}
			else
				cont++;
		}
		controls.area2.setText(strFinal);
	}
	
	/*Método para decifrar*/
	public void deCifra(String linha)
	{
		chave = controls.text1.getText().toUpperCase(); 
		int cont = 0;
		strFinal = "";
		for(int i = 0 ; i < linha.length(); i++)
		{
			for (int j = 0 ; j < 26; j++)
				if ((chave.charAt(cont)) == (matriz[0][j]))
				{
					for(int m = 0 ; m < 26; m++)
						if(matriz[m][j] == (linha.charAt(i)))
							strFinal += matriz[m][0];
				}
			if (cont >= chave.length()-1)
			{
				cont = 0;
			}
			else
				cont++;
		}
		controls.area2.setText(strFinal);
	}
    public void processEvent(AWTEvent e) {
        if (e.getID() == Event.WINDOW_DESTROY) {
            System.exit(0);
        }
    }
    public String getAppletInfo() {
        return "Um teste interativo de crpitografia de dados.";
    }
}

class Controls extends Panel implements ActionListener
{
	CifraPoliApp2 cpoliApp;
    TextArea area1, area2;
	Button but1, but2 ;
	Label lab1, lab2, lab3;
	TextField text1;
	Panel pan1, pan2, pan3;
	
    public Controls(CifraPoliApp2 cpoliApp) {
	this.cpoliApp =	cpoliApp;
	this.setLayout(new BorderLayout());  
	pan1 = new Panel();
	pan2 = new Panel();
	pan3 = new Panel();
	pan1.setLayout(new GridLayout(1,2,10,10)); 
	pan2.setLayout(new GridLayout(1,2,10,10));  
	pan1.add(lab1 = new Label("Area para digitar o texto a ser Criptografado ou Descriptografado:"));
	pan1.add(lab2 = new Label("Area do Resultado:"));
	pan2.add(area1 = new TextArea());
	pan2.add(area2 = new TextArea());
	pan3.add(lab3 = new Label("Palavra chave:"));
	pan3.add(text1 = new TextField ("",10));
	but1 = new Button("Criptografar");
	but1.addActionListener(this);
	pan3.add(but1);
	but2 = new Button("Descriptografar");
	but2.addActionListener(this);
	pan3.add(but2);
	add(pan1,BorderLayout.NORTH);
	add(pan2,BorderLayout.CENTER);
	add(pan3,BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()== but1)
		{  
			if (text1.getText().equals(""))
			{ 
				area1.setText("Digite uma Chave");
			}
			else
				cpoliApp.geraCifra(area1.getText().toUpperCase());
        }
		if (ae.getSource()== but2)
		{
						if (text1.getText().equals(""))
			{ 
				area1.setText("Digite uma Chave");
			}
			else
				cpoliApp.deCifra(area1.getText());
        }		
    }
}
