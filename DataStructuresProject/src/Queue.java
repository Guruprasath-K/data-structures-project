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

public class Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtQueueDataStructure;
	private JTextField txtEnterTheQueue;
	private JTextField sizefield;
	private JTextField textField;
	private JTextField element;
	private JButton insert;
	private JButton delete;
	private JButton display;
	private JTextField displayBox;
	private int[] q;
	private int size;
	private int r = -1;
	private int f = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtQueueDataStructure = new JTextField();
		txtQueueDataStructure.setText("QUEUE DATA STRUCTURE");
		txtQueueDataStructure.setHorizontalAlignment(SwingConstants.CENTER);
		txtQueueDataStructure.setForeground(new Color(0, 64, 64));
		txtQueueDataStructure.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtQueueDataStructure.setEditable(false);
		txtQueueDataStructure.setColumns(10);
		txtQueueDataStructure.setBackground(Color.LIGHT_GRAY);
		txtQueueDataStructure.setBounds(117, 30, 566, 34);
		contentPane.add(txtQueueDataStructure);

		txtEnterTheQueue = new JTextField();
		txtEnterTheQueue.setText("Enter the Queue Size:");
		txtEnterTheQueue.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterTheQueue.setForeground(new Color(128, 0, 64));
		txtEnterTheQueue.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtEnterTheQueue.setEditable(false);
		txtEnterTheQueue.setColumns(10);
		txtEnterTheQueue.setBackground(Color.LIGHT_GRAY);
		txtEnterTheQueue.setBounds(117, 91, 282, 34);
		contentPane.add(txtEnterTheQueue);

		sizefield = new JTextField();
		sizefield.setHorizontalAlignment(SwingConstants.CENTER);
		sizefield.setFont(new Font("Tahoma", Font.BOLD, 15));
		sizefield.setColumns(10);
		sizefield.setBounds(409, 91, 282, 34);
		contentPane.add(sizefield);

		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for creating a Queue
				size = Integer.valueOf(sizefield.getText());
				q = new int[size];
				String message = "Queue of size " + size + " created!";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Calibri", Font.BOLD, 20));
		create.setBounds(274, 142, 261, 34);
		contentPane.add(create);

		textField = new JTextField();
		textField.setText("Enter an Element:");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(128, 0, 64));
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(117, 198, 282, 34);
		contentPane.add(textField);

		element = new JTextField();
		element.setHorizontalAlignment(SwingConstants.CENTER);
		element.setFont(new Font("Tahoma", Font.BOLD, 15));
		element.setColumns(10);
		element.setBounds(409, 198, 282, 34);
		contentPane.add(element);

		insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for inserting stack
				int elem;
				if (r == size - 1) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible!");
				} else {
					elem = Integer.valueOf(element.getText());
					++r;
					q[r] = elem;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful!");
					element.setText("");
				}
			}
		});
		insert.setFont(new Font("Calibri", Font.BOLD, 20));
		insert.setBounds(238, 264, 135, 34);
		contentPane.add(insert);

		delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for deleting an element
				if (r == -1 || f > r) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible!");
				} else {
					String message = "The element deleted is " + q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					++f;
				}
			}
		});
		delete.setFont(new Font("Calibri", Font.BOLD, 20));
		delete.setBounds(443, 264, 135, 34);
		contentPane.add(delete);

		display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for displaying Queue
				String msg = "";
				if (r == -1 || f > r) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible!");
				} else {
					for (int i = f; i <= r; i++) {
						msg = msg + " " + q[i];
					}
					displayBox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Calibri", Font.BOLD, 20));
		display.setBounds(339, 339, 135, 34);
		contentPane.add(display);

		displayBox = new JTextField();
		displayBox.setHorizontalAlignment(SwingConstants.CENTER);
		displayBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		displayBox.setColumns(10);
		displayBox.setBackground(new Color(213, 213, 0));
		displayBox.setBounds(125, 401, 566, 34);
		contentPane.add(displayBox);
	}
}
