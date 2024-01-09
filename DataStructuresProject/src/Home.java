import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 417);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(171, 253, 2));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(91, 10, 406, 44);
		contentPane.add(lblNewLabel);

		JButton queue = new JButton("Queue");
		queue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Place Queue Window Opening Code Here
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(0, 128, 192));
		queue.setFont(new Font("Calibri", Font.BOLD, 20));
		queue.setBounds(426, 114, 105, 35);
		contentPane.add(queue);

		JButton stack = new JButton("Stack");
		stack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Place Stack Window Opening Code Here
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(0, 128, 192));
		stack.setFont(new Font("Calibri", Font.BOLD, 20));
		stack.setBounds(87, 114, 105, 35);
		contentPane.add(stack);

		JButton array = new JButton("Array");
		array.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Place Array Window Opening Code Here
				// Array a = new Array();
				// a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		array.setForeground(new Color(0, 128, 192));
		array.setFont(new Font("Calibri", Font.BOLD, 20));
		array.setBounds(249, 71, 105, 35);
		contentPane.add(array);

		JButton cqueue = new JButton("Circular Queue");
		cqueue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Place Circular Queue Window Opening Code Here
				new CircularQueue().setVisible(true);
			}
		});
		cqueue.setForeground(new Color(0, 128, 192));
		cqueue.setFont(new Font("Calibri", Font.BOLD, 20));
		cqueue.setBounds(53, 207, 181, 35);
		contentPane.add(cqueue);

		JButton sll = new JButton("Singly Linked List");
		sll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Place Singly Linked List Window Opening Code Here
				new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setForeground(new Color(0, 128, 192));
		sll.setFont(new Font("Calibri", Font.BOLD, 20));
		sll.setBounds(386, 207, 181, 35);
		contentPane.add(sll);

		JButton dll = new JButton("Doubly Linked List");
		dll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Place Doubly Linked List Window Opening Code Here
				new DoublyLinkedList().setVisible(true);
			}
		});
		dll.setForeground(new Color(0, 128, 192));
		dll.setFont(new Font("Calibri", Font.BOLD, 20));
		dll.setBounds(200, 294, 218, 35);
		contentPane.add(dll);
	}
}
