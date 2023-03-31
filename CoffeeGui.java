import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class CoffeeGui extends JFrame implements ActionListener {
    CoffeeMachine machine = new CoffeeMachine(400, 540, 120, 9, 550);
    int  a = 0, b = 0, c = 0;
    String A = "1", B = "2", C = "3";
    JButton button1, button2, button3, buttonSubmit, buttonBack;
    JLabel label1, label2, label3, label4, labelTop,labelWater, labelMilk, labelBean, labelCup, labelCash, labelRemain,labelTop2,labelsub,labelml,labelg,labeldo,labelc;
    JPanel panel1, panel2, panel3;
    ImageIcon icon1, icon2, icon3;
    JTextField fieldWater, fieldMilk, fieldBeans, fieldCups, fieldCash;
    
    int water,milk,beans,cups,cash;
    Font font1 = new Font("MV Boli",Font.BOLD,15);
    ArrayList<Integer> material = new ArrayList<Integer>();
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D d2 = (Graphics2D) g;
        d2.drawRect(50,50,700,980);
        repaint();
    }
    

    CoffeeGui(){ 
        
        material = machine.printState();

        Font font2 = new Font("RSU",Font.BOLD,20);
        label2 = new JLabel("");
        label2.setFont(new Font("RSU",Font.BOLD,50));

        label3 = new JLabel("               ");
        label3.setFont(new Font("RSU",Font.BOLD,80));

        label4 = new JLabel("");
        label4.setPreferredSize(new Dimension(150,150));

        Icon pic1 = new ImageIcon("1e.png");
        Icon pic2 = new ImageIcon("2e.png");
        Icon pic3 = new ImageIcon("3e.png");
        
        
        panel2 = new JPanel();
        panel2.setBackground(new Color(255, 255, 236));
        panel2.setPreferredSize(new Dimension(800,400));
        

        button1 = new JButton(pic1);
        
        button1.addActionListener(this);
        button1.setFocusable(false);
        button1.setPreferredSize(new Dimension(200, 136));
       

        button2 = new JButton(pic3);
       
        button2.addActionListener(this);
        button2.setFocusable(false);
        button2.setPreferredSize(new Dimension(200, 136));


        button3 = new JButton(pic2);
        
        button3.addActionListener(this);
        button3.setFocusable(false);
        button3.setPreferredSize(new Dimension(200, 134));
 



        labelTop2 = new JLabel("        Welcome to Tao LOi");

        labelTop2.setFont(new Font("RSU",Font.BOLD,45));
        labelTop2.setPreferredSize(new Dimension(500, 50));


         labelTop = new JLabel("              Adding/Remaining");

         labelTop.setFont(new Font("RSU",Font.BOLD,35));
         labelTop.setPreferredSize(new Dimension(500, 50));
        

          labelsub = new JLabel("            1.Espreso                   2.Latte                 3.Cappuccino");
          labelsub.setFont(new Font("RSU",Font.BOLD,30));
          labelsub.setPreferredSize(new Dimension(800, 30));


        labelWater = new JLabel("Water in Machine");

        labelWater.setHorizontalAlignment(SwingConstants.CENTER);
        labelWater.setFont(font2);
        labelWater.setPreferredSize(new Dimension(200 , 50));
        labelWater.setBackground(new Color(10, 10, 10));
        fieldWater = new JTextField(String.valueOf(material.get(0)));

        fieldWater.setPreferredSize(new Dimension(200, 50));
        fieldWater.setFont(font2);

        labelMilk = new JLabel("Milk in Machine");

        labelMilk.setHorizontalAlignment(SwingConstants.CENTER);
        labelMilk.setFont(font2);
        labelMilk.setBackground(new Color(10, 10, 10));
        labelMilk.setPreferredSize(new Dimension(200, 50));
        fieldMilk = new JTextField(String.valueOf(material.get(1)));

        fieldMilk.setPreferredSize(new Dimension(200, 50));
        fieldMilk.setFont(font2);

        labelBean = new JLabel("Bean in Machine");

        labelBean.setHorizontalAlignment(SwingConstants.CENTER);
        labelBean.setFont(font2);
        labelBean.setBackground(new Color(10, 10, 10));
        labelBean.setPreferredSize(new Dimension(200, 50));
        fieldBeans = new JTextField(String.valueOf(material.get(2)));

        fieldBeans.setPreferredSize(new Dimension(200, 50));
        fieldBeans.setFont(font2);

        labelCup = new JLabel("Cup in Machine");

        labelCup.setHorizontalAlignment(SwingConstants.CENTER);
        labelCup.setFont(font2);
        labelCup.setBackground(new Color(10, 10, 10));
        labelCup.setPreferredSize(new Dimension(200, 50));
        fieldCups = new JTextField(String.valueOf(material.get(3)));

        fieldCups.setPreferredSize(new Dimension(200, 50));
        fieldCups.setFont(font2);

        labelCash = new JLabel("Cash in Machine");

        labelCash.setHorizontalAlignment(SwingConstants.CENTER);
        labelCash.setFont(font2);
        labelCash.setBackground(new Color(0, 0, 0));
        labelCash.setPreferredSize(new Dimension(200, 50));
        fieldCash = new JTextField(String.valueOf(material.get(4)));

        fieldCash.setPreferredSize(new Dimension(200, 50));
        fieldCash.setFont(font2);

        
        buttonSubmit = new JButton("Submit all ");

        buttonSubmit.setFocusable(false);
        buttonSubmit.setFont(font2);
        buttonSubmit.addActionListener(this);

        buttonBack = new JButton("Take all money"); 

        buttonBack.setFocusable(false);
        buttonBack.setFont(font2);
        buttonBack.addActionListener(this);

        
     
    //   labeldo = new JLabel(" Dollar");
    //   labelml = new JLabel(" ML");
    //   labelc = new JLabel("Cup");
    //   labelc.setFont(font2);
    //   labelg.setFont(font2);
    //   labeldo.setFont(font2);
    //   labelml.setFont(font2);

        panel2.add(labelTop,BorderLayout.WEST);
        
        panel2.add(new JLabel("                             "));
        panel2.add(labelWater,BorderLayout.WEST);
        panel2.add(fieldWater);
        // panel2.add(labelml);
        panel2.add(new JLabel("ml                                                                 "));
        panel2.add(labelMilk,BorderLayout.WEST);
        panel2.add(fieldMilk);
        // panel2.add(labelml);
        panel2.add(new JLabel("ml                                                                 "));
        panel2.add(labelBean,BorderLayout.WEST);
        panel2.add(fieldBeans);
        // panel2.add(labelg);
        panel2.add(new JLabel("g                                                                 "));
        panel2.add(labelCup,BorderLayout.WEST);
        panel2.add(fieldCups);
        // panel2.add(labelc);
        panel2.add(new JLabel("Cups                                                                 "));
        panel2.add(labelCash,BorderLayout.WEST);
        panel2.add(fieldCash);
        // panel2.add(labeldo);
        
        panel2.add(new JLabel("Dollars                                                                                                     ")); 
        panel2.add(buttonBack,BorderLayout.WEST);
        panel2.add(buttonSubmit,BorderLayout.WEST);
       
        
      
        this.add(labelTop2,BorderLayout.CENTER);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(labelsub);
        this.add(label2);
        this.add(panel2);
 
        this.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,1500 );
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(255, 252, 236));
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            machine.doBuyCoffee(A);
            material = machine.printState();
            fieldWater.setText(String.valueOf(material.get(0)));
            fieldMilk.setText(String.valueOf(material.get(1)));
            fieldBeans.setText(String.valueOf(material.get(2)));
            fieldCups.setText(String.valueOf(material.get(3)));
            fieldCash.setText(String.valueOf(material.get(4)));
            JOptionPane.showMessageDialog(this,machine.a);
            

        }else if(e.getSource() == button2){
            machine.doBuyCoffee(B);
            material = machine.printState();
            fieldWater.setText(String.valueOf(material.get(0)));
            fieldMilk.setText(String.valueOf(material.get(1)));
            fieldBeans.setText(String.valueOf(material.get(2)));
            fieldCups.setText(String.valueOf(material.get(3)));
            fieldCash.setText(String.valueOf(material.get(4)));
            JOptionPane.showMessageDialog(this,machine.a);

        }else if(e.getSource() == button3){
            machine.doBuyCoffee(C);
            material = machine.printState();
            fieldWater.setText(String.valueOf(material.get(0)));
            fieldMilk.setText(String.valueOf(material.get(1)));
            fieldBeans.setText(String.valueOf(material.get(2)));
            fieldCups.setText(String.valueOf(material.get(3)));
            fieldCash.setText(String.valueOf(material.get(4)));
            JOptionPane.showMessageDialog(this,machine.a);
        }else if(e.getSource() == buttonSubmit){
             machine.doFilling(Integer.parseInt(fieldWater.getText()), Integer.parseInt(fieldMilk.getText()), Integer.parseInt(fieldBeans.getText()), Integer.parseInt(fieldCups.getText()));
             material = machine.printState();
             fieldWater.setText(String.valueOf(material.get(0)));
             fieldMilk.setText(String.valueOf(material.get(1)));
             fieldBeans.setText(String.valueOf(material.get(2)));
             fieldCups.setText(String.valueOf(material.get(3)));
             fieldCash.setText(String.valueOf(material.get(4)));
             JOptionPane.showMessageDialog(this,"Success");
        }else if(e.getSource() == buttonBack){
            
            material = machine.printState();
            fieldCash.setText(String.valueOf(material.get(4)));
            JOptionPane.showMessageDialog(this,"You got "+machine.getRealmoney()+" Dollar");
            
       }
    }
}
