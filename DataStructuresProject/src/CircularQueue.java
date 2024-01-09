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

public class CircularQueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCircularQueueData;
	private JTextField textField;
	private JTextField sizefield;
	private JTextField textField_2;
	private JTextField element;
	private JTextField displayBox;
	private int cq[];
	private int size;
	private int r = -1;
	private int f = 0;
	private int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtCircularQueueData = new JTextField();
		txtCircularQueueData.setText("CIRCULAR QUEUE DATA STRUCTURE");
		txtCircularQueueData.setHorizontalAlignment(SwingConstants.CENTER);
		txtCircularQueueData.setForeground(new Color(0, 64, 64));
		txtCircularQueueData.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtCircularQueueData.setEditable(false);
		txtCircularQueueData.setColumns(10);
		txtCircularQueueData.setBackground(Color.LIGHT_GRAY);
		txtCircularQueueData.setBounds(147, 32, 548, 34);
		contentPane.add(txtCircularQueueData);

		textField = new JTextField();
		textField.setText("Enter the Queue Size:");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(128, 0, 64));
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(147, 88, 282, 34);
		contentPane.add(textField);

		sizefield = new JTextField();
		sizefield.setFont(new Font("Tahoma", Font.BOLD, 15));
		sizefield.setHorizontalAlignment(SwingConstants.CENTER);
		sizefield.setColumns(10);
		sizefield.setBounds(439, 88, 263, 34);
		contentPane.add(sizefield);

		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for creation of Circular Queue
				size = Integer.valueOf(sizefield.getText());
				cq = new int[size];
				String message = "Queue of size " + size + " created!";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Calibri", Font.BOLD, 20));
		create.setBounds(294, 143, 261, 34);
		contentPane.add(create);

		textField_2 = new JTextField();
		textField_2.setText("Enter an Element:");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(new Color(128, 0, 64));
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(147, 200, 282, 34);
		contentPane.add(textField_2);

		element = new JTextField();
		element.setHorizontalAlignment(SwingConstants.CENTER);
		element.setFont(new Font("Tahoma", Font.BOLD, 15));
		element.setColumns(10);
		element.setBounds(439, 200, 263, 34);
		contentPane.add(element);

		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for inserting element
				int elem;
				if (count == size) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible!");
				} else {
					elem = Integer.valueOf(element.getText());
					r = (r + 1) % size;
					cq[r] = elem;
					++count;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful!");
					element.setText("");
				}
			}
		});
		insert.setFont(new Font("Calibri", Font.BOLD, 20));
		insert.setBounds(263, 264, 135, 34);
		contentPane.add(insert);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for deleting element
				if (count == 0) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible!");
				} else {
					String message = "The element deleted is " + cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f = (f + 1) % size;
					--count;
				}
			}
		});
		delete.setFont(new Font("Calibri", Font.BOLD, 20));
		delete.setBounds(475, 264, 135, 34);
		contentPane.add(delete);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Code for displaying Circular Queue
				int f1 = f;
				String msg = "";
				if (count == 0) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible!");
				} else {
					for (int i = 1; i <= count; i++) {
						msg = msg + " " + cq[f1];
						f1 = (f1 + 1) % size;
					}
					displayBox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Calibri", Font.BOLD, 20));
		display.setBounds(372, 330, 135, 34);
		contentPane.add(display);

		displayBox = new JTextField();
		displayBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		displayBox.setHorizontalAlignment(SwingConstants.CENTER);
		displayBox.setColumns(10);
		displayBox.setBackground(new Color(151, 197, 247));
		displayBox.setBounds(149, 395, 566, 34);
		contentPane.add(displayBox);
	}

}
