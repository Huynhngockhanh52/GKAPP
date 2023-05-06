package UI.layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import entity.MedicineEn;

public class SearchFun extends JPanel {
    GroupLayout layout;
    private JTextField idMec, nameMec, typeMec, nsxMec, hsdMec, soloMec, numMec, ctyMec;
    private JRadioButton idRadioBtn, nameRadioBtn, typeRadioBtn, nsxRadioBtn,
                        hsdRadioBtn, soloRadioBtn, numRadioBtn, ctyRadioBtn;
    private JLabel lbHeader, lbfindW, lbID, lbName, lbType, lbNsx, lbHsd, lbSolo, lbNum, lbCty;
    private JButton findBtn, exitBtn;
 
    Font fontRadioBtn = new Font("Segoe UI", 3, 14);
    Font fontLabel = new Font("Segoe UI", 3, 12);
    Font fontIndex = new Font("Segoe UI", 3, 14);
    public SearchFun(){
        initComponent();
        setPreferredSize(new Dimension(300, 500));
        setMinimumSize(new Dimension(300, 500));

    }
    private void initComponent() {

        lbHeader = new JLabel("TÌM KIẾM VẬT TƯ");
        lbHeader.setFont(new Font("Segoe UI", 3, 18));
        lbHeader.setHorizontalAlignment(SwingConstants.CENTER);

        lbfindW = new JLabel("Tìm kiếm theo:");
        lbfindW.setFont(new Font("Segoe UI", 2, 16));
        lbfindW.setHorizontalAlignment(SwingConstants.CENTER);
        lbfindW.setPreferredSize(new Dimension(36, 16));

        nameRadioBtn = setRadioBtn("Tên Thuốc");
        nameRadioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                nameRadioBtnActionPerformed(evt);
            }
        });

        typeRadioBtn = setRadioBtn("Loại Thuốc");
        typeRadioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                typeRadioBtnActionPerformed(evt);
            }
        });

        nsxRadioBtn = setRadioBtn("NSX");
        nsxRadioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                nsxRadioBtnActionPerformed(evt);
            }
        });

        ctyRadioBtn = setRadioBtn("Cty Sản xuất");
        ctyRadioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ctyRadioBtnActionPerformed(evt);
            }
        });

        soloRadioBtn = setRadioBtn("Số Lô");
        soloRadioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                soloRadioBtnActionPerformed(evt);
            }
        });

        hsdRadioBtn = setRadioBtn("HSD");
        hsdRadioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                hsdRadioBtnActionPerformed(evt);
            }
        });

        numRadioBtn = setRadioBtn("Số Lượng");
        numRadioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numRadioBtnActionPerformed(evt);
            }
        });

        idRadioBtn = setRadioBtn("ID");
        idRadioBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                idRadioBtnActionPerformed(evt);
            }
        });

        lbID = setLabel("ID:");

        idMec = new JTextField();
        idMec.setFont(fontIndex);
        idMec.setMinimumSize(new Dimension(60, 20));
        idMec.setPreferredSize(new Dimension(60, 20));

        lbName = setLabel("Tên Thuốc:");

        nameMec = new JTextField();
        nameMec.setFont(fontIndex);
        nameMec.setPreferredSize(new Dimension(200, 30));

        lbNsx = setLabel("NSX:");

        nsxMec = new JTextField();
        nsxMec.setFont(fontIndex);
        nsxMec.setPreferredSize(new Dimension(60, 20));

        lbHsd = setLabel("HSD:");

        hsdMec = new JTextField();
        hsdMec.setFont(fontIndex);
        hsdMec.setPreferredSize(new Dimension(60, 20));

        lbType = setLabel("Loại Thuốc:");

        typeMec = new JTextField();
        typeMec.setFont(fontIndex);
        typeMec.setPreferredSize(new Dimension(60, 20));

        lbSolo = setLabel("Số Lô:");

        soloMec = new JTextField();
        soloMec.setFont(fontIndex);
        soloMec.setPreferredSize(new Dimension(60, 20));

        lbCty = setLabel("Cty SXuất:");

        ctyMec = new JTextField();
        ctyMec.setFont(fontIndex);
        ctyMec.setPreferredSize(new Dimension(60, 20));

        lbNum = setLabel("Số lượng:");

        numMec = new JTextField();
        numMec.setFont(fontIndex);
        numMec.setPreferredSize(new Dimension(60, 20));

        findBtn = new JButton("FIND");
        findBtn.setFont(new Font("Segoe UI", 3, 14));
        findBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        exitBtn = new JButton("X");
        exitBtn.setFont(new Font("Segoe UI", 3, 12));
        exitBtn.setBorder(null);
        exitBtn.setBorderPainted(false);
        exitBtn.setHideActionText(true);
        exitBtn.setBackground(this.getBackground());
        exitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        //SetVisible:
        lbID.setVisible(false);
        idMec.setVisible(false);
        lbName.setVisible(false);
        nameMec.setVisible(false);
        lbType.setVisible(false);
        typeMec.setVisible(false);
        lbNsx.setVisible(false);
        nsxMec.setVisible(false);
        lbHsd.setVisible(false);
        hsdMec.setVisible(false);
        lbSolo.setVisible(false);
        soloMec.setVisible(false);
        lbNum.setVisible(false);
        numMec.setVisible(false);
        lbCty.setVisible(false);
        ctyMec.setVisible(false);

        layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(nameRadioBtn, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ctyRadioBtn, GroupLayout.Alignment.LEADING)
                                                        .addComponent(typeRadioBtn, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(nsxRadioBtn, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(hsdRadioBtn, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(idRadioBtn, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(soloRadioBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(numRadioBtn, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbfindW, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbHeader, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(lbType, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbCty, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbNum, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbNsx, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(lbID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(lbSolo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(lbHsd, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(numMec, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(typeMec, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(hsdMec, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(nameMec, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(ctyMec, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(nsxMec, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(soloMec, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(idMec, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(3, 3, 3)))))
                                .addContainerGap(15, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(exitBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(findBtn, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(exitBtn, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbHeader)
                                .addComponent(lbfindW, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(nsxRadioBtn)
                                        .addComponent(soloRadioBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameRadioBtn))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ctyRadioBtn)
                                        .addComponent(hsdRadioBtn)
                                        .addComponent(numRadioBtn))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(idRadioBtn)
                                        .addComponent(typeRadioBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbID, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idMec, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(nameMec, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbName, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNsx, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nsxMec, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbHsd, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hsdMec, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbType, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(typeMec, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbSolo, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(soloMec, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ctyMec, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbCty, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNum, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numMec, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addGap(5,5,5)
                                .addComponent(findBtn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addGap(5,5,5))
        );
    }
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public JRadioButton setRadioBtn(String text){
        JRadioButton a = new JRadioButton(text);
        a.setFont(fontRadioBtn);
        return a;
    }

    public JLabel setLabel(String text){
        JLabel a = new JLabel(text);
        a.setFont(fontLabel);
        a.setHorizontalAlignment(SwingConstants.RIGHT);
        return a;
    }

    //Thiết lập các hàm ActionListener:
    private void exitActionPerformed(ActionEvent evt) {
        JPanel parentPanel = (JPanel) this.getParent();
        parentPanel.remove(this);
        parentPanel.revalidate();
        parentPanel.repaint();
//      JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
//      frame.dispose();
    }

    private void findBtnActionPerformed(ActionEvent evt) {
//        JPanel parentPanel = (JPanel) this.getParent();
//        parentPanel.remove(this);
//        parentPanel.revalidate();
//        parentPanel.repaint();

    }

    //Set Listener:
    //RadioButton
    private void idRadioBtnActionPerformed(ActionEvent evt) {
        if(idRadioBtn.isSelected()){
            lbID.setVisible(true);
            idMec.setVisible(true);
            findBtn.setVisible(true);

        }
        else{
            lbID.setVisible(false);
            idMec.setVisible(false);
            idMec.setText("");
        }
    }

    private void nameRadioBtnActionPerformed(ActionEvent evt) {
        if(nameRadioBtn.isSelected()){
            lbName.setVisible(true);
            nameMec.setVisible(true);
            findBtn.setVisible(true);

        }
        else{
            lbName.setVisible(false);
            nameMec.setVisible(false);
            nameMec.setText("");
        }
    }

    private void typeRadioBtnActionPerformed(ActionEvent evt) {
        if(typeRadioBtn.isSelected()){
            lbType.setVisible(true);
            typeMec.setVisible(true);
            findBtn.setVisible(true);

        }
        else{
            lbType.setVisible(false);
            typeMec.setVisible(false);
            typeMec.setText("");
        }
    }

    private void nsxRadioBtnActionPerformed(ActionEvent evt) {
        if(nsxRadioBtn.isSelected()){
            lbNsx.setVisible(true);
            nsxMec.setVisible(true);
            findBtn.setVisible(true);

        }
        else{
            lbNsx.setVisible(false);
            nsxMec.setVisible(false);
            nsxMec.setText("");
        }
    }

    private void hsdRadioBtnActionPerformed(ActionEvent evt) {
        if(hsdRadioBtn.isSelected()){
            lbHsd.setVisible(true);
            hsdMec.setVisible(true);
            findBtn.setVisible(true);

        }
        else{
            lbHsd.setVisible(false);
            hsdMec.setVisible(false);
            hsdMec.setText("");
        }
    }

    private void soloRadioBtnActionPerformed(ActionEvent evt) {
        if(soloRadioBtn.isSelected()){
            lbSolo.setVisible(true);
            soloMec.setVisible(true);
            findBtn.setVisible(true);

        }
        else{
            lbSolo.setVisible(false);
            soloMec.setVisible(false);
            soloMec.setText("");
        }
    }

    private void numRadioBtnActionPerformed(ActionEvent evt) {
        if(numRadioBtn.isSelected()){
            lbNum.setVisible(true);
            numMec.setVisible(true);
            findBtn.setVisible(true);

        }
        else{
            lbNum.setVisible(false);
            numMec.setVisible(false);
            numMec.setText("");
        }
    }

    private void ctyRadioBtnActionPerformed(ActionEvent evt) {
        if(ctyRadioBtn.isSelected()){
            lbCty.setVisible(true);
            ctyMec.setVisible(true);
            findBtn.setVisible(true);
        }
        else{
            lbCty.setVisible(false);
            ctyMec.setVisible(false);
            ctyMec.setText("");
        }
    }

    public void resetJTextField(){
        idMec.setText("");
        nameMec.setText("");
        typeMec.setText("");
        nsxMec.setText("");
        hsdMec.setText("");
        soloMec.setText("");
        numMec.setText("");
        ctyMec.setText("");
    }

    /**
     * lấy thông tin tìm kiếm Medicine
     *
     * @return
     */
    public MedicineEn getMedicineInfo() {
        // validate Medicine
        try {
            MedicineEn medc = new MedicineEn();
            if (idMec.getText() != null && !"".equals(idMec.getText())) {
                medc.setID(Integer.parseInt(idMec.getText().trim()));
            }
            else
                medc.setID(-1);
            medc.setNameM(nameMec.getText().trim());
            medc.setTypeM(typeMec.getText().trim());
            medc.setNSXM(nsxMec.getText().trim());
            medc.setHSDM(hsdMec.getText().trim());
            medc.setSoloM(soloMec.getText().trim());
            if (numMec.getText() != null && !"".equals(numMec.getText())) {
                medc.setNumM(Integer.parseInt(numMec.getText().trim()));
            }
            else
                medc.setNumM(-1);
            medc.setCtyM(ctyMec.getText().trim());
            return medc;
        } catch (Exception e) {
            showMessage(e.getMessage());
        }
        return null;
    }


    public void setSearchBtn(ActionListener evt){
        findBtn.addActionListener(evt);
    }


//    public static void main(String[] args) {
//        JFrame a = new JFrame("Test Add");
//        a.setSize(new Dimension(330, 500));
//        a.setLayout(new BorderLayout());
//        a.setLocationRelativeTo(null);
//        SearchFun temp = new SearchFun();
//        a.add(temp, BorderLayout.CENTER);
//        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        a.setVisible(true);
//    }


}
