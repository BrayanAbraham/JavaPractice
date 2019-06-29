package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    double number, answer;
    int calculation;
    final String operators="+-/*()";

    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    ;

    Calculator() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 450);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

//        onRadioButton.setBounds(10, 95, 60, 40);
//        onRadioButton.setSelected(true);
//        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
//        onRadioButton.setBackground(Color.black);
//        onRadioButton.setForeground(Color.white);
//        frame.add(onRadioButton);
//
//        offRadioButton.setBounds(10, 120, 60, 40);
//        offRadioButton.setSelected(false);
//        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
//        offRadioButton.setBackground(Color.black);
//        offRadioButton.setForeground(Color.white);
//        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(10, 190, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 190, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150, 190, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 250, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80, 250, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150, 250, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);

        buttonOne.setBounds(10, 310, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 310, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 310, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonDot.setBounds(150, 370, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);

        buttonZero.setBounds(10, 370, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 310, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(239, 188, 2));
        frame.add(buttonEqual);

        buttonDiv.setBounds(150, 130, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        frame.add(buttonDiv);

//        buttonSqrt.setBounds(10, 170, 60, 40);
//        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
//        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 190, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        frame.add(buttonMul);

        buttonMinus.setBounds(220, 130, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 250, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        frame.add(buttonPlus);
//
//        buttonSquare.setBounds(80, 170, 60, 40);
//        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
//        frame.add(buttonSquare);
//
//        buttonReciprocal.setBounds(150, 170, 60, 40);
//        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
//        frame.add(buttonReciprocal);

        buttonDelete.setBounds(80, 130, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);

        buttonClear.setBounds(10, 130, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);

    }

    public void addActionEvent() {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        //buttonSqrt.addActionListener(this);
       // buttonSquare.addActionListener(this);
       // buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        try
        {
        if (source == onRadioButton) {
            enable();
        } else if (source == offRadioButton) {
            disable();
        } else if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;


            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
            label.setText(Float.toString(Evaluate.evaluate(process(textField.getText().toString()))));
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
            label.setText(Float.toString(Evaluate.evaluate(process(textField.getText().toString()))));
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
            label.setText(Float.toString(Evaluate.evaluate(process(textField.getText().toString()))));
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
            label.setText(Float.toString(Evaluate.evaluate(process(textField.getText().toString()))));
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
            label.setText(Float.toString(Evaluate.evaluate(process(textField.getText().toString()))));
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
            label.setText(Float.toString(Evaluate.evaluate(process(textField.getText().toString()))));
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
            label.setText(Float.toString(Evaluate.evaluate(process(textField.getText().toString()))));
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
            label.setText(Float.toString(Evaluate.evaluate(process(textField.getText().toString()))));
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
            label.setText(Float.toString(Evaluate.evaluate(process(textField.getText().toString()))));
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }

        } else if (source == buttonPlus) {
            textField.setText(textField.getText() + "+");
          
        } else if (source == buttonMinus) {
          textField.setText(textField.getText() + "-");
        } else if (source == buttonMul) {
           textField.setText(textField.getText() + "*");
        } else if (source == buttonDiv) {
            textField.setText(textField.getText() + "/");
        } else if (source == buttonSqrt) {
//            number = Double.parseDouble(textField.getText());
//            Double sqrt = Math.sqrt(number);
//            textField.setText(Double.toString(sqrt));

        } else if (source == buttonSquare) {
//            String str = textField.getText();
//            number = Double.parseDouble(textField.getText());
//            double square = Math.pow(number, 2);
//            String string = Double.toString(square);
//            if (string.endsWith(".0")) {
//                textField.setText(string.replace(".0", ""));
//            } else {
//                textField.setText(string);
//            }
//            label.setText("(sqr)" + str);
        } else if (source == buttonReciprocal) {
//            number = Double.parseDouble(textField.getText());
//            double reciprocal = 1 / number;
//            String string = Double.toString(reciprocal);
//            if (string.endsWith(".0")) {
//                textField.setText(string.replace(".0", ""));
//            } else {
//                textField.setText(string);
//            }
        } else if (source == buttonEqual) {
          
        textField.setText(Float.toString(Evaluate.evaluate(process(textField.getText().toString()))));
        label.setText(Float.toString(Evaluate.evaluate(process(textField.getText().toString()))));
    }
        }   catch(Exception exp)
                {
                
                }
    }
 public  String process(String exp)
    {
        String temp="";


        for(int i=0;i<exp.length();i++)
        {
            if(i==0&&exp.charAt(i)=='-')
            {
                temp=temp+"(0-";
                i++;
                      while(i<exp.length()&&!operators.contains(Character.toString(exp.charAt(i))))
                {
                    temp=temp+exp.charAt(i);
                    i++;
                }
                i--;
                temp=temp+")";
            }
            else if(exp.charAt(i)=='-'&&operators.contains(Character.toString(exp.charAt(i-1))))
            {
                temp=temp+"(0-";
                i++;
                while(i<exp.length()&&!operators.contains(Character.toString(exp.charAt(i))))
                {
                    temp=temp+exp.charAt(i);
                    i++;
                }
                i--;
                temp=temp+")";
            }
            else
            {
                temp=temp+exp.charAt(i);
            }
        }
        
        return temp;

    }
    public void enable() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);

    }

    public void disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setText("");
        label.setText(" ");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }
}
