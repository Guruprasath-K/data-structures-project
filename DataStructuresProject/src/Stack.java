import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtStackDataStructure;
	private JTextField txtEnterStackSize;
	private JTextField sizefield;
	private JTextField txtEnterAnElement;
	private JTextField element;
	private JButton display;
	private JTextField displayBox;
	private int s[];
	private int size;
	private int top = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Stack frame = new Stack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtStackDataStructure = new JTextField();
		txtStackDataStructure.setText("STACK DATA STRUCTURE");
		txtStackDataStructure.setHorizontalAlignment(SwingConstants.CENTER);
		txtStackDataStructure.setForeground(new Color(0, 64, 64));
		txtStackDataStructure.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtStackDataStructure.setEditable(false);
		txtStackDataStructure.setColumns(10);
		txtStackDataStructure.setBackground(Color.LIGHT_GRAY);
		txtStackDataStructure.setBounds(128, 30, 566, 34);
		contentPane.add(txtStackDataStructure);

		txtEnterStackSize = new JTextField();
		txtEnterStackSize.setText("Enter the Stack Size:");
		txtEnterStackSize.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterStackSize.setForeground(new Color(128, 0, 64));
		txtEnterStackSize.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtEnterStackSize.setEditable(false);
		txtEnterStackSize.setColumns(10);
		txtEnterStackSize.setBackground(Color.LIGHT_GRAY);
		txtEnterStackSize.setBounds(109, 85, 282, 34);
		contentPane.add(txtEnterStackSize);

		sizefield = new JTextField();
		sizefield.setHorizontalAlignment(SwingConstants.CENTER);
		sizefield.setFont(new Font("Tahoma", Font.BOLD, 15));
		sizefield.setBounds(401, 85, 298, 34);
		contentPane.add(sizefield);
		sizefield.setColumns(10);

		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for creating a Stack
				size = Integer.valueOf(sizefield.getText());
				s = new int[size];
				String message = "Stack of size " + size + " created!";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Calibri", Font.BOLD, 20));
		create.setBounds(274, 140, 261, 34);
		contentPane.add(create);

		txtEnterAnElement = new JTextField();
		txtEnterAnElement.setText("Enter an Element:");
		txtEnterAnElement.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterAnElement.setForeground(new Color(128, 0, 64));
		txtEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtEnterAnElement.setEditable(false);
		txtEnterAnElement.setColumns(10);
		txtEnterAnElement.setBackground(Color.LIGHT_GRAY);
		txtEnterAnElement.setBounds(109, 201, 282, 34);
		contentPane.add(txtEnterAnElement);

		element = new JTextField();
		element.setHorizontalAlignment(SwingConstants.CENTER);
		element.setFont(new Font("Tahoma", Font.BOLD, 15));
		element.setColumns(10);
		element.setBounds(401, 201, 298, 34);
		contentPane.add(element);

		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for pushing an Element
				int elem;
				if (top == size - 1) {
					JOptionPane.showMessageDialog(contentPane, "Push not possible!");
				} else {
					elem = Integer.valueOf(element.getText());
					++top;
					s[top] = elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successful!");
					element.setText("");
				}
			}
		});
		push.setFont(new Font("Calibri", Font.BOLD, 20));
		push.setBounds(233, 256, 135, 34);
		contentPane.add(push);

		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for popping an element
				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, "Pop not possible!");
				} else {
					String message = "Element deleted is " + s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					// s[top] = 0;
					--top;
				}
			}
		});
		pop.setFont(new Font("Calibri", Font.BOLD, 20));
		pop.setBounds(433, 256, 135, 34);
		contentPane.add(pop);

		display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for displaying an element
				String msg = "";
				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible!");
				} else {
					for (int i = top; i >= 0; i--) {
						msg = msg + " " + s[i];
					}
					displayBox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Calibri", Font.BOLD, 20));
		display.setBounds(335, 320, 135, 34);
		contentPane.add(display);

		displayBox = new JTextField();
		displayBox.setHorizontalAlignment(SwingConstants.CENTER);
		displayBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		displayBox.setBackground(new Color(56, 194, 167));
		displayBox.setBounds(128, 390, 566, 34);
		contentPane.add(displayBox);
		displayBox.setColumns(10);
	}
}
