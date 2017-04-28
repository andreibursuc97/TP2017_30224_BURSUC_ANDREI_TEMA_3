package presentation;

import bll.CosBLL;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Andrei on 23/04/2017.
 */
public class IstoricCosuri extends JFrame {
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private MyModel model;


    public IstoricCosuri() {
        model = new MyModel();
        $$$setupUI$$$();
        table1 = new JTable();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // this.setSize(380, 350);

        this.setLocationRelativeTo(null);
        this.setContentPane(panel1);
        this.setSize(600, 400);
        //finalizareButton.addActionListener(new CosCurent.FinalizareComanda());
        //finalizareButton.addActionListener();
    }

    private void createUIComponents() {

        table1 = new JTable();
        ///pretField = new JTextField();
        modelUpdate();
        table1.setModel(model);

        table1.setFillsViewportHeight(true);

        //listSelectionModel = table1.getSelectionModel();
        //table1.setSelectionModel(listSelectionModel);

        //table1.getModel().setValueAt();
        //dateTabel, columnNames
        scrollPane1 = new JScrollPane(table1);
        // TODO: place custom component creation code here
    }

    public void modelUpdate() {
        String[] columnNames = {"Id", "Data", "Pret total"};

        //ListSelectionModel listSelectionModel;
        //JTableHeader=new JTableHeader()
        CosBLL cosBLL = new CosBLL();
        ArrayList<String[]> date;
        date = cosBLL.veziCosuri();
        model.setColumnNames(columnNames);
        model.setList(date);
        /*for (int i = 0; i < dateTabel.length; i++)
            for (int j = 0; j < columnNames.length; j++)
                model.setValueAt(dateTabel[i][j], i, j);*/


        //return model;
    }


    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(2, 1, new Insets(20, 10, 20, 10), -1, -1));
        panel1.setBackground(new Color(-5404120));
        panel2.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        scrollPane1.setBackground(new Color(-11225979));
        scrollPane1.setFont(new Font("Comic Sans MS", scrollPane1.getFont().getStyle(), 14));
        panel1.add(scrollPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        table1.setBackground(new Color(-11225979));
        table1.setFillsViewportHeight(true);
        scrollPane1.setViewportView(table1);
    }
}
