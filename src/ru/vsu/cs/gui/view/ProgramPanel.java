package ru.vsu.cs.gui.view;


import ru.vsu.cs.gui.listener.CalcSumButtonListener;

import javax.swing.*;
import java.awt.*;

public class ProgramPanel extends JPanel {
    private final JButton calcButton = new JButton("Apply");
    private final JTextField inputArrText = new JTextField();
    private final JLabel labelInput = new JLabel("Enter array elements (separators is , ;):");
    private final JLabel labelOutput = new JLabel("Maximum sum:");
    private final JTextField outputArrText = new JTextField();

    public ProgramPanel() {
        this.setLayout(null);
        addLabelInput();
        addInputArrText();
        addLabelOutput();
        addOutputArrText();
        addCalcButton();
    }

    private void addLabelInput() {
        this.setBackground(new Color(229, 231, 233));
        labelInput.setBounds(5, 5, 250, 30);
        this.add(labelInput);
    }

    private void addInputArrText() {
//        inputArrText.addKeyListener(new RestrictionCharacterInput());

        inputArrText.setBounds(255, 5, 150, 30);
        this.add(inputArrText);
    }

    private void addLabelOutput() {
        labelOutput.setBounds(5, 40, 150, 30);
        this.add(labelOutput);
    }

    private void addOutputArrText() {
        outputArrText.setBounds(255, 40, 85, 30);
        outputArrText.setEditable(false);
        this.add(outputArrText);
    }

    private void addCalcButton() {
        calcButton.setBackground(new Color(119, 221, 119));
        calcButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        calcButton.setBounds(175, 350, 100, 30);
        calcButton.addActionListener(new CalcSumButtonListener(inputArrText, outputArrText));
        this.add(calcButton);
    }
}
