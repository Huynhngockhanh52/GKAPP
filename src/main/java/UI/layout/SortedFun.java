package UI.layout;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SortedFun extends JPanel{
    GroupLayout layout;
    private JRadioButton idRadioBtn, nameRadioBtn, typeRadioBtn, nsxRadioBtn, hsdRadioBtn, 
            ctyRadioBtn, numRadioBtn, soloRadioBtn, azRadioBtn, zaRadioBtn;
    private JLabel lbHeader, lbSortW;
    private JButton sortBtn, exitBtn;
    private ButtonGroup buttonGroup;
    private ButtonGroup sortazza;

    
    public SortedFun(){
        setSize(new Dimension(300, 500));
        initComponent();
        buttonGroup = new ButtonGroup();
        buttonGroup.add(idRadioBtn);
        buttonGroup.add(nameRadioBtn);
        buttonGroup.add(typeRadioBtn);
        buttonGroup.add(nsxRadioBtn);
        buttonGroup.add(hsdRadioBtn);
        buttonGroup.add(ctyRadioBtn);
        buttonGroup.add(soloRadioBtn);
        buttonGroup.add(numRadioBtn);
        sortazza = new ButtonGroup();
        sortazza.add(azRadioBtn);
        sortazza.add(zaRadioBtn);
        ctyRadioBtn.setEnabled(false);
    }
    private Font fontRadioButton = new Font("Segoe UI", 3, 14);

    private void initComponent() {

        lbHeader = new JLabel("SẮP XẾP VẬT TƯ");
        lbHeader.setFont(new Font("Segoe UI", 3, 18));
        lbHeader.setHorizontalAlignment(SwingConstants.CENTER);

        lbSortW = new JLabel("Sắp xếp theo:");
        lbSortW.setFont(new Font("Segoe UI", 2, 16));
        lbSortW.setHorizontalAlignment(SwingConstants.CENTER);

        idRadioBtn = settingRadioButton("ID");

        nameRadioBtn = settingRadioButton("Tên Thuốc");

        typeRadioBtn = settingRadioButton("Loại thuốc");

        nsxRadioBtn = settingRadioButton("NSX");

        hsdRadioBtn = settingRadioButton("HSD");

        soloRadioBtn = settingRadioButton("Số Lô");

        numRadioBtn = settingRadioButton("Số Lượng");

        ctyRadioBtn = settingRadioButton("Cty Sản xuất");

        azRadioBtn = settingRadioButton("Sort from A --> Z");

        zaRadioBtn = settingRadioButton("Sort from Z --> A");

        sortBtn = new JButton("SORT");
        sortBtn.setFont(new Font("Segoe UI", 3, 14));

        exitBtn = new JButton("X");
        exitBtn.setFont(new java.awt.Font("Segoe UI", 3, 12));
        exitBtn.setBorder(null);
        exitBtn.setBorderPainted(false);
        exitBtn.setHideActionText(true);
        exitBtn.setBackground(this.getBackground());
        exitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(60,60,60)
                                .addComponent(lbHeader, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                        .addComponent(exitBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbSortW, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(typeRadioBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(nameRadioBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ctyRadioBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(numRadioBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(55, 55, 55)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(nsxRadioBtn, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                        .addComponent(soloRadioBtn, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(idRadioBtn, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(hsdRadioBtn, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(azRadioBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(zaRadioBtn, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(sortBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(exitBtn, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbHeader, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSortW, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameRadioBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idRadioBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(typeRadioBtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(soloRadioBtn, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ctyRadioBtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nsxRadioBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(numRadioBtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hsdRadioBtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(azRadioBtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zaRadioBtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sortBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
        );
    }

    public JRadioButton settingRadioButton(String txt){
        JRadioButton a = new JRadioButton(txt);
        a.setFont(fontRadioButton);
        a.setPreferredSize(new Dimension(110, 30));
        return a;
    }

    //Thiết lập các phương thức cho ActionListener:
    private void exitActionPerformed(ActionEvent evt) {
        JPanel parentPanel = (JPanel) this.getParent();
        parentPanel.remove(this);
        parentPanel.revalidate();
        parentPanel.repaint();
    }

    public int checkRButonSelect(){
        if(idRadioBtn.isSelected())
            return 1;
        else if (nameRadioBtn.isSelected())
            return 2;
        else if (typeRadioBtn.isSelected())
            return 3;
        else if (nsxRadioBtn.isSelected())
            return 4;
        else if (hsdRadioBtn.isSelected())
            return 5;
        else if (soloRadioBtn.isSelected())
            return 6;
        else if (numRadioBtn.isSelected())
            return 7;
        else if (ctyRadioBtn.isSelected())
            return 8;
        return 0;
    }

    public int checkAZ(){
        if(azRadioBtn.isSelected())
            return 1;
        if (zaRadioBtn.isSelected())
            return 2;
        return 0;
    }

    public int[] checkButton(){
        int[] temp = new int[2];
        temp[0] = checkRButonSelect();
        temp[1] = checkAZ();
        return temp;
    }

    public void setSortBtn(ActionListener evt){
        sortBtn.addActionListener(evt);
    }

//    public static void main(String[] args) {
//        JFrame a = new JFrame("Test Add");
//        a.setSize(new Dimension(330, 500));
//        a.setLayout(new BorderLayout());
//        a.setLocationRelativeTo(null);
//        SortedFun temp = new SortedFun();
//        a.add(temp, BorderLayout.CENTER);
//        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        a.setVisible(true);
//    }
    
}
