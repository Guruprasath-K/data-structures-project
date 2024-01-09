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

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtArrayDataStructure;
	private JTextField txtEnterArrayLength;
	private JTextField length;
	private JTextField txtEnterAnInteger;
	private JTextField element;
	private JTextField txtPosition;
	private JTextField insertposition;
	private JButton insert;
	private JTextField txtEnterPositionTo;
	private JTextField deleteposition;
	private JButton delete;
	private JButton display;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1018, 546);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtArrayDataStructure = new JTextField();
		txtArrayDataStructure.setEditable(false);
		txtArrayDataStructure.setBackground(new Color(192, 192, 192));
		txtArrayDataStructure.setForeground(new Color(0, 64, 64));
		txtArrayDataStructure.setHorizontalAlignment(SwingConstants.CENTER);
		txtArrayDataStructure.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtArrayDataStructure.setText("ARRAY DATA STRUCTURE");
		txtArrayDataStructure.setBounds(228, 25, 566, 34);
		contentPane.add(txtArrayDataStructure);
		txtArrayDataStructure.setColumns(10);

		txtEnterArrayLength = new JTextField();
		txtEnterArrayLength.setEditable(false);
		txtEnterArrayLength.setText("Enter Array Length:");
		txtEnterArrayLength.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterArrayLength.setForeground(new Color(128, 0, 64));
		txtEnterArrayLength.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtEnterArrayLength.setColumns(10);
		txtEnterArrayLength.setBackground(Color.LIGHT_GRAY);
		txtEnterArrayLength.setBounds(204, 101, 282, 34);
		contentPane.add(txtEnterArrayLength);

		length = new JTextField();
		length.setHorizontalAlignment(SwingConstants.CENTER);
		length.setFont(new Font("Tahoma", Font.BOLD, 15));
		length.setBounds(510, 101, 307, 34);
		contentPane.add(length);
		length.setColumns(10);

		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for creating array
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				String message = "Array of length " + len + " created!";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Calibri", Font.BOLD, 20));
		create.setBounds(371, 164, 261, 34);
		contentPane.add(create);

		txtEnterAnInteger = new JTextField();
		txtEnterAnInteger.setEditable(false);
		txtEnterAnInteger.setText("Enter an Integer Element:");
		txtEnterAnInteger.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterAnInteger.setForeground(new Color(128, 0, 64));
		txtEnterAnInteger.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtEnterAnInteger.setColumns(10);
		txtEnterAnInteger.setBackground(Color.LIGHT_GRAY);
		txtEnterAnInteger.setBounds(21, 224, 307, 34);
		contentPane.add(txtEnterAnInteger);

		element = new JTextField();
		element.setHorizontalAlignment(SwingConstants.CENTER);
		element.setFont(new Font("Tahoma", Font.BOLD, 15));
		element.setColumns(10);
		element.setBounds(338, 224, 173, 34);
		contentPane.add(element);

		txtPosition = new JTextField();
		txtPosition.setEditable(false);
		txtPosition.setText("Position:");
		txtPosition.setHorizontalAlignment(SwingConstants.CENTER);
		txtPosition.setForeground(new Color(128, 0, 64));
		txtPosition.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtPosition.setColumns(10);
		txtPosition.setBackground(Color.LIGHT_GRAY);
		txtPosition.setBounds(521, 224, 157, 34);
		contentPane.add(txtPosition);

		insertposition = new JTextField();
		insertposition.setFont(new Font("Tahoma", Font.BOLD, 15));
		insertposition.setHorizontalAlignment(SwingConstants.CENTER);
		insertposition.setColumns(10);
		insertposition.setBounds(688, 224, 106, 34);
		contentPane.add(insertposition);

		insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for inserting elements in array
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertposition.getText());
				arr[pos] = elem;
				String message = "Element " + elem + " is inserted at position " + pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		insert.setFont(new Font("Calibri", Font.BOLD, 20));
		insert.setBounds(805, 224, 166, 34);
		contentPane.add(insert);

		txtEnterPositionTo = new JTextField();
		txtEnterPositionTo.setEditable(false);
		txtEnterPositionTo.setText("Enter position to Delete:");
		txtEnterPositionTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterPositionTo.setForeground(new Color(128, 0, 64));
		txtEnterPositionTo.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtEnterPositionTo.setColumns(10);
		txtEnterPositionTo.setBackground(Color.LIGHT_GRAY);
		txtEnterPositionTo.setBounds(158, 288, 307, 34);
		contentPane.add(txtEnterPositionTo);

		deleteposition = new JTextField();
		deleteposition.setHorizontalAlignment(SwingConstants.CENTER);
		deleteposition.setFont(new Font("Tahoma", Font.BOLD, 15));
		deleteposition.setColumns(10);
		deleteposition.setBounds(475, 293, 173, 34);
		contentPane.add(deleteposition);

		delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for deleting an element
				int pos = Integer.valueOf(deleteposition.getText());
				arr[pos] = 0;
				String message = "Element deleted at position " + pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		delete.setFont(new Font("Calibri", Font.BOLD, 20));
		delete.setBounds(662, 288, 166, 34);
		contentPane.add(delete);

		display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for displaying the array
				String msg = "";
				for (int i = 0; i <= arr.length - 1; i++) {
					msg = msg + " " + arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Calibri", Font.BOLD, 20));
		display.setBounds(371, 363, 261, 34);
		contentPane.add(display);

		displaybox = new JTextField();
		displaybox.setFont(new Font("Tahoma", Font.BOLD, 15));
		displaybox.setHorizontalAlignment(SwingConstants.CENTER);
		displaybox.setBackground(new Color(220, 241, 180));
		displaybox.setColumns(10);
		displaybox.setBounds(228, 422, 566, 34);
		contentPane.add(displaybox);
	}

}
