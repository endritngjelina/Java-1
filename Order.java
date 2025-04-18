package nngjelina16;
//Endrit Ngjelina //SPC ID#2436798 //Worked Alone
//This program displays a working order for Orinoco.
//It prompts user to input item's name, price and quantity.
//User also chooses if it is taxable and the shipping cost.

//Import java swing files and abstract window toolkit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.EventQueue;
import javax.swing.JFrame;

//Order class
public class Order implements ActionListener {
	
	//Create variables
    JFrame frame;				//frame
    private JTextField textField_1;		//text field 1
    private JTextField textField_2;		//text field 2
    private JTextField textField_3;		//text field 3
    JCheckBox chckbxNewCheckBox;		//check box
    ButtonGroup group;					//button group
    JLabel label;						//label
 
    //main method
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {     //Queues events
            public void run() {
                try {								//try - catch block
                    Order window = new Order();
                    window.frame.setVisible(true);
                } catch (Exception e) {				//catch exception
                    e.printStackTrace();			//handle exception
                }
            }
        }
     )
  ;
}

    public Order() {		//public order
        initialize();		//call initialize
    }

    private void initialize() {						//Initialize method
        frame = new JFrame("orinoco.com");			//new frame
        frame.setBounds(100, 100, 450, 300);		//set frame bounds
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);		//null layout
        
        JLabel labelItem = new JLabel("Item");		//Item label
        labelItem.setBounds(37, 11, 46, 14);		//set bounds
        frame.getContentPane().add(labelItem);		//add label to frame
        
        JLabel labelPrice = new JLabel("Price"); 		//Price label
        labelPrice.setBounds(37, 36, 46, 14);			//set bounds
        frame.getContentPane().add(labelPrice);		//add label to frame
        
        JLabel labelQuantity = new JLabel("Quantity");//quantity label
        labelQuantity.setBounds(37, 61, 60, 14);	  //set boundaries
        frame.getContentPane().add(labelQuantity);	  //add label to frame
        
        textField_1 = new JTextField();				// text field 1
        textField_1.setBounds(136, 8, 86, 20);		//set bounds
        frame.getContentPane().add(textField_1);	//add label to frame
        textField_1.setColumns(10);					//set columns
        
        textField_2 = new JTextField();				// text field 2
        textField_2.setBounds(136, 58, 86, 20);		//set bounds
        frame.getContentPane().add(textField_2);	//add label to frame
        textField_2.setColumns(10);					//set columns
        
        textField_3 = new JTextField();				// text field 3
        textField_3.setBounds(136, 33, 86, 20);		//set bounds
        frame.getContentPane().add(textField_3);	//add label to frame
        textField_3.setColumns(10);					//set columns
        
        chckbxNewCheckBox = new JCheckBox("Taxable?"); 		//taxable check box
        chckbxNewCheckBox.setBounds(136, 85, 97, 23);		//set boundaries
        frame.getContentPane().add(chckbxNewCheckBox);		//add to frame
        
        JLabel lblShipping = new JLabel("Shipping");		//shipping label
        lblShipping.setBounds(37, 114, 60, 14);
        frame.getContentPane().add(lblShipping);
        
        JLabel lblNextDay = new JLabel("Next Day");		//next day label
        lblNextDay.setBounds(37, 139, 60, 14);
        frame.getContentPane().add(lblNextDay);
        
        JLabel lblThisWeek = new JLabel("This Week");	//this week label
        lblThisWeek.setBounds(37, 164, 60, 14);
        frame.getContentPane().add(lblThisWeek);
        
        JLabel lblSomeDay = new JLabel("Some Day");		//some day label
        lblSomeDay.setBounds(37, 189, 60, 14);
        frame.getContentPane().add(lblSomeDay);
        
        JLabel lblTotalDue = new JLabel("Total Due");	//total due label
        lblTotalDue.setBounds(37, 214, 60, 14);
        frame.getContentPane().add(lblTotalDue);
        
        JButton btnProcess = new JButton("Process");	//process label
        btnProcess.setBounds(37, 239, 89, 23);			//set boundaries
        frame.getContentPane().add(btnProcess);			//add to frame
        btnProcess.addActionListener(this);				//action listener
        
        JButton btnRest = new JButton("Reset");		//reset button
        btnRest.setBounds(146, 239, 89, 23);		//set boundaries
        frame.getContentPane().add(btnRest);		//add to frame
        
        JRadioButton radioButton = new JRadioButton("$20");		//radio button 20$
        radioButton.setBounds(136, 135, 109, 23);
        frame.getContentPane().add(radioButton);
        radioButton.setActionCommand("20");
        
        JRadioButton radioButton_1 = new JRadioButton("$12");	//radio button 12$
        radioButton_1.setBounds(136, 160, 109, 23);
        frame.getContentPane().add(radioButton_1);
        radioButton_1.setActionCommand("12");
        
        JRadioButton radioButton_2 = new JRadioButton("$5");	//radio button 5$
        radioButton_2.setBounds(136, 185, 109, 23);
        frame.getContentPane().add(radioButton_2);
        radioButton_2.setActionCommand("5");
        
        btnRest.addActionListener(new ActionListener() {		//add action listener to reset button
        	public void actionPerformed(ActionEvent arg0) {		//action performed method
        		textField_1.setText(" ");		//empty text field 1 
            	textField_2.setText(" ");		//empty text field 1 
            	textField_3.setText(null);		//set text field 3 null
            	chckbxNewCheckBox.setSelected(false);	//select check box
            	group.clearSelection();		//clear selection 
            	label.setText("$0.00");		//$0.00 total
        }
        }
        );
        
        group = new ButtonGroup();		//new button group
        group.add(radioButton);			//add radio button
        group.add(radioButton_1);		//add radio button 1
        group.add(radioButton_2);		//add radio button 2
        
        label = new JLabel("$0.00");		//add label
        label.setBounds(136, 214, 46, 14);	//set boundaries
        frame.getContentPane().add(label);	//add to frame
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {			//action performed method
        double price = Double.parseDouble(textField_2.getText());		//parse double price
        double quantity = Double.parseDouble(textField_3.getText());	//parse double quantity
        double total = price * quantity;								//get double total
        if(chckbxNewCheckBox.isSelected()) total += (total * 7)/100.0;	//if statement if taxable
        DecimalFormat df2 = new DecimalFormat("#.00");					//decimal point format
        label.setText("$"+df2.format(total+Integer.parseInt(group.getSelection().getActionCommand())));
    } 	
}