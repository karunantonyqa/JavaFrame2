import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Main {
	
	static Frame f;
	static Button plus, minus, divide, multiply, clear, equals;
	static Button one, two, three, four, five, six, seven, eight, nine, zero;
	static TextField T1, T2;
	static Panel p2, p1, pTop;
	static ArrayList<Button> buttons = new ArrayList<Button>();
	static boolean isAdd, isMinus, isDivide, isMultiply;
	
	static int firstNum, secondNum, resultNum;
	static String result;
	
	public static void main(String[] args) {
		
		isAdd = false;
		isMinus = false;
		isDivide = false;
		isMultiply = false;
		
		initialiseElements();
		
		initialiseButtons();
		
		addElements();

		p1.setVisible(true);
		p1.setLayout(new FlowLayout());
		p2.setVisible(true);
		p2.setLayout(new GridLayout(4,4));
		
		pTop.setVisible(true);
		pTop.setLayout(new FlowLayout());
		
		buttons.add(one);
		

		//OPERATORS
		plus.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						isAdd = true;
						String prevText = T1.getText();
						T2.setText(prevText + "+");
						firstNum = Integer.parseInt(prevText);
						T1.setText("");
					}
					
				});
		
		minus.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						isMinus = true;
						String prevText = T1.getText();
						T2.setText(prevText + "-");

						firstNum = Integer.parseInt(prevText);
						T1.setText("");
					}
					
				});
		
		divide.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						isDivide = true;
						String prevText = T1.getText();
						T2.setText(prevText + "/");

						firstNum = Integer.parseInt(prevText);
						T1.setText("");
					}
					
				});
		
		multiply.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						isMultiply = true;
						String prevText = T1.getText();
						T2.setText(prevText + "x");

						firstNum = Integer.parseInt(prevText);
						T1.setText("");
					}
					
				});
		
		clear.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						T1.setText("");
						T2.setText("");
						firstNum = 0;
						secondNum = 0;
					}
					
				});
		
		equals.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String prevText = T1.getText();
						secondNum = Integer.parseInt(prevText);
						
						System.out.println("Num 1: " + firstNum);
						System.out.println("Num 2: " + secondNum);

						
						if(isAdd) {
							resultNum = firstNum + secondNum;
							result = Integer.toString(resultNum);
						} else if(isMinus) {
							resultNum = firstNum - secondNum;
							result = Integer.toString(resultNum);
						} else if(isDivide) {
							resultNum = firstNum / secondNum;
							result = Integer.toString(resultNum);
						} else if(isMultiply) {
							resultNum = firstNum * secondNum;
							result = Integer.toString(resultNum);
						}
						T1.setText(result);
						T2.setText("");

					}
					
				});
		
		
		//NUMBERS
		
		zero.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String prevText = T1.getText();
						T2.setText(prevText + "0");
						T1.setText(prevText+"0");
					}
					
				});
		
		one.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String prevText = T1.getText();
						T2.setText(prevText + "1");
						T1.setText(prevText+"1");
					}
					
				});
		
		two.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String prevText = T1.getText();
						T2.setText(prevText + "2");
						T1.setText(prevText+"2");
					}
					
				});
		
		three.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String prevText = T1.getText();
						T2.setText(prevText + "3");
						T1.setText(prevText+"3");
					}
					
				});
		four.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String prevText = T1.getText();
						T2.setText(prevText + "4");
						T1.setText(prevText+"4");
					}
					
				});
		
		five.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String prevText = T1.getText();
						T2.setText(prevText + "5");
						T1.setText(prevText+"5");
					}
					
				});
		
		six.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String prevText = T1.getText();
						T2.setText(prevText + "6");
						T1.setText(prevText+"6");
					}
					
				});
		
		seven.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String prevText = T1.getText();
						T2.setText(prevText + "7");
						T1.setText(prevText+"7");
					}
					
				});
		
		eight.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String prevText = T1.getText();
						T2.setText(prevText + "8");
						T1.setText(prevText+"8");
					}
					
				});
		
		nine.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String prevText = T1.getText();
						T2.setText(prevText + "9");
						T1.setText(prevText+"9");
					}
					
				});

		
		
		f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));


	}
	public static void initialiseElements() {
		//initialise frame
		f = new Frame();
		
		p1 = new Panel();
		p2 = new Panel();
		pTop = new Panel();
		
		
		T1 = new TextField();
		T2 = new TextField();
		T1.setPreferredSize(new Dimension(200, 24));
		T2.setPreferredSize(new Dimension(200, 24));

		
		//set frame settings
		f.setSize(500,500);
		f.setLayout(new BorderLayout());
		f.setTitle("Full Calculator");
		f.setBackground(Color.CYAN);
		f.setCursor(Cursor.HAND_CURSOR);
		f.setVisible(true);
		
		f.add(pTop, BorderLayout.NORTH);
		f.add(p1, BorderLayout.CENTER);
		f.add(p2, BorderLayout.SOUTH);
	}
	
	public static void initialiseButtons() {
		//initialise number buttons
		one = new Button("1");
		one.setSize(50, 50);
		two = new Button("2");
		three = new Button("3");
		
		multiply = new Button("x");
		
		four = new Button("4");
		five = new Button("5");
		six = new Button("6");
		
		divide = new Button("/");

		
		seven = new Button("7");
		eight = new Button("8");
		nine = new Button("9");
		
		plus = new Button("+");
		minus = new Button("-");
		
		clear = new Button("C");
		zero = new Button("0");
		equals = new Button("=");
	}
	
	public static void addElements() {
		//Add results text field
		pTop.add(T2);

		p1.add(T1);
		
		p2.add(seven);
		p2.add(eight);
		p2.add(nine);
		
		p2.add(plus);
		
		p2.add(four);
		p2.add(five);
		p2.add(six);
		
		p2.add(minus);

		p2.add(one);
		p2.add(two);
		p2.add(three);
		
		
		p2.add(multiply);

		p2.add(clear);

		p2.add(zero);
		p2.add(equals);

		
		p2.add(divide);
	}

}
