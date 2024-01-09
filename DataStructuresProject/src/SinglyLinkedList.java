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

public class SinglyLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSinglyLinkedList;
	private JTextField txtEnterTheElement;
	private JTextField element;
	private JTextField displayBox;

	class Node {
		int data;
		Node link;
	}

	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtSinglyLinkedList = new JTextField();
		txtSinglyLinkedList.setText("SINGLY LINKED LIST DATA STRUCTURE");
		txtSinglyLinkedList.setHorizontalAlignment(SwingConstants.CENTER);
		txtSinglyLinkedList.setForeground(new Color(0, 64, 64));
		txtSinglyLinkedList.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtSinglyLinkedList.setEditable(false);
		txtSinglyLinkedList.setColumns(10);
		txtSinglyLinkedList.setBackground(Color.LIGHT_GRAY);
		txtSinglyLinkedList.setBounds(109, 25, 548, 34);
		contentPane.add(txtSinglyLinkedList);

		txtEnterTheElement = new JTextField();
		txtEnterTheElement.setText("Enter the Element:");
		txtEnterTheElement.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterTheElement.setForeground(new Color(128, 0, 64));
		txtEnterTheElement.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtEnterTheElement.setEditable(false);
		txtEnterTheElement.setColumns(10);
		txtEnterTheElement.setBackground(Color.LIGHT_GRAY);
		txtEnterTheElement.setBounds(74, 87, 282, 34);
		contentPane.add(txtEnterTheElement);

		element = new JTextField();
		element.setHorizontalAlignment(SwingConstants.CENTER);
		element.setFont(new Font("Tahoma", Font.BOLD, 15));
		element.setColumns(10);
		element.setBounds(385, 87, 309, 34);
		contentPane.add(element);

		JButton insertRear = new JButton("INSERT REAR");
		insertRear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for inserting from rear
				Node temp;
				int elem = Integer.valueOf(element.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;

				if (first == null) {
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful!");
				} else {
					temp = first;
					while (temp.link != null) {
						temp = temp.link;
					}
					temp.link = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful!");
				}
			}
		});
		insertRear.setFont(new Font("Calibri", Font.BOLD, 20));
		insertRear.setBounds(175, 150, 181, 34);
		contentPane.add(insertRear);

		JButton insertFront = new JButton("INSERT FRONT");
		insertFront.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for inserting from front
				int elem = Integer.valueOf(element.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if (first == null) {
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful!");
				} else {
					newnode.link = first;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful!");
				}
			}
		});
		insertFront.setFont(new Font("Calibri", Font.BOLD, 20));
		insertFront.setBounds(427, 150, 181, 34);
		contentPane.add(insertFront);

		JButton deleteRear = new JButton("DELETE REAR");
		deleteRear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for deleting from rear
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible!");
				} else if (first.link == null) {
					String message1 = "The element deleted is " + first.data;
					JOptionPane.showMessageDialog(contentPane, message1);
					first = null;
				} else {
					temp = first;
					while (temp.link.link != null) {
						temp = temp.link;
					}
					String message2 = "The element deleted is " + temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message2);
					temp.link = null;
				}
			}
		});
		deleteRear.setFont(new Font("Calibri", Font.BOLD, 20));
		deleteRear.setBounds(175, 230, 181, 34);
		contentPane.add(deleteRear);

		JButton deleteFront = new JButton("DELETE FRONT");
		deleteFront.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for deleting from front
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible!");
				} else if (first.link == null) {
					String message1 = "The element deleted is " + first.data;
					JOptionPane.showMessageDialog(contentPane, message1);
					first = null;
				} else {
					String message2 = "The element deleted is " + first.data;
					JOptionPane.showMessageDialog(contentPane, message2);
					first = first.link;
				}
			}
		});
		deleteFront.setFont(new Font("Calibri", Font.BOLD, 20));
		deleteFront.setBounds(427, 230, 181, 34);
		contentPane.add(deleteFront);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for displaying the List
				Node temp;
				String msg = "";
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible!");
				} else if (first.link == null) {
					msg = msg + first.data;
					displayBox.setText(msg);
				} else {
					temp = first;
					while (temp != null) {
						msg = msg + " " + temp.data;
						temp = temp.link;
					}
					displayBox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Calibri", Font.BOLD, 20));
		display.setBounds(295, 317, 204, 34);
		contentPane.add(display);

		displayBox = new JTextField();
		displayBox.setHorizontalAlignment(SwingConstants.CENTER);
		displayBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		displayBox.setColumns(10);
		displayBox.setBackground(new Color(255, 128, 128));
		displayBox.setBounds(125, 388, 548, 34);
		contentPane.add(displayBox);
	}
}
