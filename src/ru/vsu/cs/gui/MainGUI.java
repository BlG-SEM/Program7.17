package ru.vsu.cs.gui;


import ru.vsu.cs.gui.view.ProgramFrame;
import ru.vsu.cs.tests.TestSumArrayElements;

public class MainGUI {

    public static void main(String[] args) {

        new TestSumArrayElements().runAllTest();

        ProgramFrame app = new ProgramFrame();
        app.setVisible(true);
    }
}
