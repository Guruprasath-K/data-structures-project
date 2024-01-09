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

public class DoublyLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDoublyLinkedList;
	private JTextField textField;
	private JTextField element;
	private JTextField displayBox;

	class Node {
		Node prelink;
		int data;
		Node nextlink;
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
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtDoublyLinkedList = new JTextField();
		txtDoublyLinkedList.setText("DOUBLY LINKED LIST DATA STRUCTURE");
		txtDoublyLinkedList.setHorizontalAlignment(SwingConstants.CENTER);
		txtDoublyLinkedList.setForeground(new Color(0, 64, 64));
		txtDoublyLinkedList.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtDoublyLinkedList.setEditable(false);
		txtDoublyLinkedList.setColumns(10);
		txtDoublyLinkedList.setBackground(Color.LIGHT_GRAY);
		txtDoublyLinkedList.setBounds(105, 21, 548, 34);
		contentPane.add(txtDoublyLinkedList);

		textField = new JTextField();
		textField.setText("Enter the Element:");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(128, 0, 64));
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(71, 79, 282, 34);
		contentPane.add(textField);

		element = new JTextField();
		element.setHorizontalAlignment(SwingConstants.CENTER);
		element.setFont(new Font("Tahoma", Font.BOLD, 15));
		element.setColumns(10);
		element.setBounds(363, 79, 309, 34);
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
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null) {
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful!");
				} else {
					temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;
					}
					temp.nextlink = newnode;
					newnode.prelink = temp;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful!");
				}
			}
		});
		insertRear.setFont(new Font("Calibri", Font.BOLD, 20));
		insertRear.setBounds(161, 155, 181, 34);
		contentPane.add(insertRear);

		JButton insertFront = new JButton("INSERT FRONT");
		insertFront.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for inserting from front
				int elem = Integer.valueOf(element.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prelink = null;
				newnode.nextlink = null;
				if (first == null) {
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful!");
				} else {
					newnode.nextlink = first;
					first.prelink = newnode;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful!");
				}

			}
		});
		insertFront.setFont(new Font("Calibri", Font.BOLD, 20));
		insertFront.setBounds(411, 155, 181, 34);
		contentPane.add(insertFront);

		JButton deleteRear = new JButton("DELETE REAR");
		deleteRear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for deleting from rear
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible!");
				} else if (first.nextlink == null) {
					String message1 = "The element deleted is " + first.data;
					JOptionPane.showMessageDialog(contentPane, message1);
				} else {
					temp = first;
					while (temp.nextlink.nextlink != null) {
						temp = temp.nextlink;
					}
					String message2 = "The element deleted is " + temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, message2);
					temp.nextlink = null;
				}
			}
		});
		deleteRear.setFont(new Font("Calibri", Font.BOLD, 20));
		deleteRear.setBounds(161, 229, 181, 34);
		contentPane.add(deleteRear);

		JButton deleteFront = new JButton("DELETE FRONT");
		deleteFront.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for deleting from front
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible!");
				} else if (first.nextlink == null) {
					String message1 = "The element deleted is " + first.data;
					JOptionPane.showMessageDialog(contentPane, message1);
				} else {
					String message1 = "The element deleted is " + first.data;
					JOptionPane.showMessageDialog(contentPane, message1);
					first = first.nextlink;
					first.prelink = null;
				}
			}
		});
		deleteFront.setFont(new Font("Calibri", Font.BOLD, 20));
		deleteFront.setBounds(411, 229, 181, 34);
		contentPane.add(deleteFront);

		JButton displayForward = new JButton("DISPLAY FORWARD");
		displayForward.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for displaying forward
				Node temp;
				String msg = "";
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible!");
				} else if (first.nextlink == null) {
					msg = msg + first.data;
					displayBox.setText(msg);
				} else {
					temp = first;
					while (temp != null) {
						msg = msg + " " + temp.data;
						temp = temp.nextlink;
					}
					displayBox.setText(msg);
				}

			}
		});
		displayForward.setFont(new Font("Calibri", Font.BOLD, 20));
		displayForward.setBounds(149, 302, 204, 34);
		contentPane.add(displayForward);

		JButton displayReverse = new JButton("DISPLAY REVERSE");
		displayReverse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for displaying reverse
				Node temp;
				String msg = "";
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible!");
				} else if (first.nextlink == null) {
					msg = msg + first.data;
					displayBox.setText(msg);
				} else {
					temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;
					}
					while (temp != null) {
						msg = msg + " " + temp.data;
						temp = temp.prelink;
					}
					displayBox.setText(msg);
				}
			}
		});
		displayReverse.setFont(new Font("Calibri", Font.BOLD, 20));
		displayReverse.setBounds(403, 302, 204, 34);
		contentPane.add(displayReverse);

		displayBox = new JTextField();
		displayBox.setHorizontalAlignment(SwingConstants.CENTER);
		displayBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		displayBox.setColumns(10);
		displayBox.setBackground(new Color(169, 165, 211));
		displayBox.setBounds(105, 375, 548, 34);
		contentPane.add(displayBox);
	}

}
