import javax.swing.*;
import java.awt.event.*;
public
class TextFieldExample implements ActionListener
{
    JTextField tf1, tf2, tf10, tf4, tf5, tf6, tf7, tf8, tf9, tf3, tf11, tf12, tf13, tf14, tf15, tf16, tf17, tf18, tf19, tf20;
    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11,l12;
    TextFieldExample()
    {
        JFrame f = new JFrame("CGPA/SGPA CALCULATOR");
        tf1 = new JTextField();
        tf1.setBounds(150, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(150, 100, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(300, 525, 150, 20);
        tf3.setEditable(false);
        tf4 = new JTextField();
        tf4.setBounds(150, 150, 150, 20);
        tf5 = new JTextField();
        tf5.setBounds(150, 200, 150, 20);
        tf6 = new JTextField();
        tf6.setBounds(150, 250, 150, 20);
        tf7 = new JTextField();
        tf7.setBounds(150, 300, 150, 20);
        tf8 = new JTextField();
        tf8.setBounds(150, 350, 150, 20);
        tf9 = new JTextField();
        tf9.setBounds(150, 400, 150, 20);
        tf10 = new JTextField();
        tf10.setBounds(150, 450, 150, 20);
        tf11 = new JTextField();
        tf11.setBounds(450, 50, 150, 20);
        tf12 = new JTextField();
        tf12.setBounds(450, 100, 150, 20);
        //tf13=new JTextField();
        //tf13.setBounds(450,550,150,20);
        tf14 = new JTextField();
        tf14.setBounds(450, 150, 150, 20);
        tf15 = new JTextField();
        tf15.setBounds(450, 200, 150, 20);
        tf16 = new JTextField();
        tf16.setBounds(450, 250, 150, 20);
        tf17 = new JTextField();
        tf17.setBounds(450, 300, 150, 20);
        tf18 = new JTextField();
        tf18.setBounds(450, 350, 150, 20);
        tf19 = new JTextField();
        tf19.setBounds(450, 400, 150, 20);
        tf20 = new JTextField();
        tf20.setBounds(450, 450, 150, 20);
        b1 = new JButton("Calculate SGPA");
        b1.setBounds(300, 555, 150, 20);
        //b2=new JButton("-");
        //b2.setBounds(120,620,50,50);
        b1.addActionListener(this);
        //b2.addActionListener(this);
        l1 = new JLabel("Marks Obtained");
        l1.setBounds(150, 20, 150, 20);
        l2 = new JLabel("Credits");
        l2.setBounds(450, 20, 150, 20);
        l3 = new JLabel("Subject 1");
        l3.setBounds(40, 50, 150, 20);
        l4 = new JLabel("Subject 2");
        l4.setBounds(40, 100, 150, 20);
        l5 = new JLabel("Subject 3");
        l5.setBounds(40, 150, 150, 20);
        l6 = new JLabel("Subject 4");
        l6.setBounds(40, 200, 150, 20);
        l7 = new JLabel("Subject 5");
        l7.setBounds(40, 250, 150, 20);
        l8 = new JLabel("Subject 6");
        l8.setBounds(40, 300, 150, 20);
        l9 = new JLabel("Subject 7");
        l9.setBounds(40, 350, 150, 20);
        l10 = new JLabel("Subject 8");
        l10.setBounds(40, 400, 150, 20);
        l11 = new JLabel("Subject 9");
        l11.setBounds(40, 450, 150, 20);
	l12 = new JLabel("Your Obtained SGPA is:");
        l12.setBounds(165, 525, 250, 20);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(l11);
	f.add(l12);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(tf4);
        f.add(tf5);
        f.add(tf6);
        f.add(tf7);
        f.add(tf8);
        f.add(tf9);
        f.add(tf10);
        f.add(tf11);
        f.add(tf12);
        f.add(tf14);
        f.add(tf15);
        f.add(tf16);
        f.add(tf17);
        f.add(tf18);
        f.add(tf19);
        f.add(tf20); //f.add(tf13);//f.add(b2);
        f.setSize(725, 900);
        f.setLayout(null);
        f.setVisible(true);
    }
public
    void actionPerformed(ActionEvent e)
    {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        String s4 = tf4.getText();
        String s5 = tf5.getText();
        String s6 = tf6.getText();
        String s7 = tf7.getText();
        String s8 = tf8.getText();
        String s9 = tf9.getText();
        String s11 = tf11.getText();
        String s10 = tf10.getText();
        //String s13=tf13.getText();
        String s12 = tf12.getText();
        String s14 = tf14.getText();
        String s15 = tf15.getText();
        String s16 = tf16.getText();
        String s17 = tf17.getText();
        String s18 = tf18.getText();
        String s19 = tf19.getText();
        String s20 = tf20.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s4);
        int d = Integer.parseInt(s5);
        int y = Integer.parseInt(s6);
        int f = Integer.parseInt(s7);
        int g = Integer.parseInt(s8);
        int h = Integer.parseInt(s9);
        int i = Integer.parseInt(s10);
        int j = Integer.parseInt(s11);
        int k = Integer.parseInt(s12);
        //int l=Integer.parseInt(s13);
        int m = Integer.parseInt(s14);
        int n = Integer.parseInt(s15);
        int o = Integer.parseInt(s16);
        int p = Integer.parseInt(s17);
        int q = Integer.parseInt(s18);
        int r = Integer.parseInt(s19);
        int s = Integer.parseInt(s20);
        float totcre = 0;
        float earcre = 0;
        totcre = j * 10 + k * 10 + s * 10 + m * 10 + n * 10 + o * 10 + p * 10 + q * 10 + r * 10;
        int g1 = 0;
        int g2 = 0;
        int g3 = 0;
        int g4 = 0;
        int g5 = 0;
        int g6 = 0;
        int g7 = 0;
        int g8 = 0;
        int g9 = 0;
        if (a >= 90)
        {
            g1 = 10;
        }
        else if (a >= 80 && a < 90)
        {
            g1 = 9;
        }
        else if (a >= 70 && a < 80)
        {
            g1 = 8;
        }
        else if (a >= 60 && a < 70)
        {
            g1 = 7;
        }
        else if (a >= 50 && a < 60)
        {
            g1 = 6;
        }
        else if (a >= 40 && a < 50)
        {
            g1 = 5;
        }
        else if (a >= 30 && a < 40)
        {
            g1 = 4;
        }

        if (b >= 90)
        {
            g2 = 10;
        }
        else if (b >= 80 && b < 90)
        {
            g2 = 9;
        }
        else if (b >= 70 && b < 80)
        {
            g2 = 8;
        }
        else if (b >= 60 && b < 70)
        {
            g2 = 7;
        }
        else if (b >= 50 && b < 60)
        {
            g2 = 6;
        }
        else if (b >= 40 && b < 50)
        {
            g2 = 5;
        }
        else if (b >= 30 && b < 40)
        {
            g2 = 4;
        }

        if (c >= 90)
        {
            g3 = 10;
        }
        else if (c >= 80 && c < 90)
        {
            g3 = 9;
        }
        else if (c >= 70 && c < 80)
        {
            g3 = 8;
        }
        else if (c >= 60 && c < 70)
        {
            g3 = 7;
        }
        else if (c >= 50 && c < 60)
        {
            g3 = 6;
        }
        else if (c >= 40 && c < 50)
        {
            g3 = 5;
        }
        else if (c >= 30 && c < 40)
        {
            g3 = 4;
        }

        if (d >= 90)
        {
            g4 = 10;
        }
        else if (d >= 80 && d < 90)
        {
            g4 = 9;
        }
        else if (d >= 70 && d < 80)
        {
            g4 = 8;
        }
        else if (d >= 60 && d < 70)
        {
            g4 = 7;
        }
        else if (d >= 50 && d < 60)
        {
            g4 = 6;
        }
        else if (d >= 40 && d < 50)
        {
            g4 = 5;
        }
        else if (d >= 30 && d < 40)
        {
            g4 = 4;
        }

        if (y >= 90)
        {
            g5 = 10;
        }
        else if (y >= 80 && y < 90)
        {
            g5 = 9;
        }
        else if (y >= 70 && y < 80)
        {
            g5 = 8;
        }
        else if (y >= 60 && y < 70)
        {
            g5 = 7;
        }
        else if (y >= 50 && y < 60)
        {
            g5 = 6;
        }
        else if (y >= 40 && y < 50)
        {
            g5 = 5;
        }
        else if (y >= 30 && y < 40)
        {
            g5 = 4;
        }

        if (f >= 90)
        {
            g6 = 10;
        }
        else if (f >= 80 && f < 90)
        {
            g6 = 9;
        }
        else if (f >= 70 && f < 80)
        {
            g6 = 8;
        }
        else if (f >= 60 && f < 70)
        {
            g6 = 7;
        }
        else if (f >= 50 && f < 60)
        {
            g6 = 6;
        }
        else if (f >= 40 && f < 50)
        {
            g6 = 5;
        }
        else if (f >= 30 && f < 40)
        {
            g6 = 4;
        }

        if (g >= 90)
        {
            g7 = 10;
        }
        else if (g >= 80 && g < 90)
        {
            g7 = 9;
        }
        else if (g >= 70 && g < 80)
        {
            g7 = 8;
        }
        else if (g >= 60 && g < 70)
        {
            g7 = 7;
        }
        else if (g >= 50 && g < 60)
        {
            g7 = 6;
        }
        else if (g >= 40 && g < 50)
        {
            g7 = 5;
        }
        else if (g >= 30 && g < 40)
        {
            g7 = 4;
        }

        if (h >= 90)
        {
            g8 = 10;
        }
        else if (h >= 80 && h < 90)
        {
            g8 = 9;
        }
        else if (h >= 70 && h < 80)
        {
            g8 = 8;
        }
        else if (h >= 60 && h < 70)
        {
            g8 = 7;
        }
        else if (h >= 50 && h < 60)
        {
            g8 = 6;
        }
        else if (h >= 40 && h < 50)
        {
            g8 = 5;
        }
        else if (h >= 30 && h < 40)
        {
            g8 = 4;
        }

        if (i >= 90)
        {
            g9 = 10;
        }
        else if (i >= 80 && i < 90)
        {
            g9 = 9;
        }
        else if (i >= 70 && i < 80)
        {
            g9 = 8;
        }
        else if (i >= 60 && i < 70)
        {
            g9 = 7;
        }
        else if (i >= 50 && i < 60)
        {
            g9 = 6;
        }
        else if (i >= 40 && i < 50)
        {
            g9 = 5;
        }
        else if (i >= 30 && i < 40)
        {
            g9 = 4;
        }
        earcre = j * g1 + k * g2 + m * g3 + n * g4 + o * g5 + p * g6 + q * g7 + r * g8 + s * g9;
        //float sgpa = (earcre/totcre)*10;
        float sgpa = 0;
        if (e.getSource() == b1)
        {
            sgpa = (earcre / totcre) * 10;
        }
        //else if(e.getSource()==b2){ ;  }
        String result = String.valueOf(sgpa);
        tf3.setText(result);
    }
public
    static void main(String[] args)
    {
        new TextFieldExample();
    }
}