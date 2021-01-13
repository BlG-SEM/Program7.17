package ru.vsu.cs.gui.listener;


import ru.vsu.cs.logic.Solution;
import ru.vsu.cs.gui.utils.ArrayUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcSumButtonListener implements ActionListener {

    private JTextField inputArrText;
    private JTextField outputArrText;

    public CalcSumButtonListener(JTextField inputArrText, JTextField outputArrText) {
        this.inputArrText = inputArrText;
        this.outputArrText = outputArrText;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String inputText = inputArrText.getText();
        int[] array = ArrayUtil.toIntArray(inputText);
        int sumElement = Solution.findMaxSum(array);
        outputArrText.setText(String.valueOf(sumElement));
    }
}
