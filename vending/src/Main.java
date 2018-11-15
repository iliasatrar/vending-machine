import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame
        implements ActionListener {
    private JButton button1;
    private JButton button2;
    public static void main (String [] args) {
        Main frame = new Main () ;
        frame.setSize (400, 300) ;
        frame.createGUI () ;
        frame.show () ;
    }
    private void createGUI() {
        setDefaultCloseOperation (EXIT_ON_CLOSE) ;
        Container window = getContentPane () ;
        window.setLayout (new FlowLayout () ) ;

        button1 = new JButton ("albert heijn Cola      €1,15 ") ;
        window.add (button1) ;
        button1.addActionListener (this) ;

        button2 = new JButton ("albert heijn Water      €0,85 ") ;
        window.add (button2) ;
        button2.addActionListener (this) ;
    }
    public void actionPerformed (ActionEvent event) {
        int cents;
        int euros;
        int change;
        int changeCents;
        int changeEuros;

        String centsString;
        String eurosString;
        eurosString = JOptionPane.showInputDialog ("Type hoeveel Euro") ;
        centsString = JOptionPane.showInputDialog ("Type hoeveel Cent") ;
        cents = Integer.parseInt (centsString);
        euros = Integer.parseInt (eurosString) * 100;

        change = (cents + euros) - 115;

        changeCents = change % 100;
        changeEuros = change / 100;

        JOptionPane.showMessageDialog (null,
                "U wisselgeld:" +
                        "   Euros: " + changeEuros +
                        "   Cents: " + changeCents);

        int CentsDecimale;
        int CentsJednine;
        CentsDecimale = changeCents / 10;
        CentsJednine = changeCents - (CentsDecimale * 10);
        JOptionPane.showMessageDialog (null,
                "wisselgeld in Cents:" +
                        "     " +
                        CentsDecimale +
                        " *10c" +
                        "     " +
                        CentsJednine +
                        " *1c");

        int NEuros;
        NEuros = changeEuros / 1;
        JOptionPane.showMessageDialog (null,
                "wisselgeld in Euros :     " +
                        NEuros +
                        " *1€");
    }
}