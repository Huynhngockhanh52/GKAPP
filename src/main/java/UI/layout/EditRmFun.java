package UI.layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.*;

import entity.MedicineEn;

public class EditRmFun extends JPanel {
    GroupLayout layout;
    private JLabel lbHeader, lbID, lbName, lbType, lbNsx, lbHsd, lbSolo, lbNum, lbCty;
    private JTextField idMec, nameMec, typeMec, nsxMec, hsdMec, soloMec, numMec,ctyMec;
    private JButton editBtn, removeBtn, exitBtn;
    private Font fontLb = new Font("Segoe UI", 3, 12);
    private Font fontIndex = new Font("Segoe UI", 3, 14);

    public EditRmFun(){
        setPreferredSize(new Dimension(300,500));
        initComponent();
    }

    public void setTextIdMec(String a){
        idMec.setText(a);
    }
    public void setTextNameMec(String a){
        nameMec.setText(a);
    }
    public void setTextTypeMec(String a){
        typeMec.setText(a);
    }
    public void setTextNSXMec(String a){
        nsxMec.setText(a);
    }
    public void setTextHSDMec(String a){
        hsdMec.setText(a);
    }
    public void setTextSoloMec(String a){
        soloMec.setText(a);
    }
    public void setTextNumMec(String a){
        numMec.setText(a);
    }
    public void setTextCtyMec(String a){
        ctyMec.setText(a);
    }

    public JTextField getIdMec(){
        return idMec;
    }
    public JTextField getNameMec(){
        return nameMec;
    }
    public JTextField getTypeMec(){
        return typeMec;
    }
    public JTextField getNSXMec(){
        return nsxMec;
    }
    public JTextField getHSDMec(){
        return hsdMec;
    }
    public JTextField getSoloMec(){
        return soloMec;
    }
    public JTextField getNumMec(){
        return numMec;
    }
    public JTextField getCtyMec(){
        return ctyMec;
    }


    private void initComponent() {
        lbHeader = new JLabel("CHỈNH SỬA THÔNG TIN ");
        lbHeader.setFont(new Font("Segoe UI", 3, 18));
        lbHeader.setHorizontalAlignment(SwingConstants.CENTER);

        lbID = new JLabel("ID:");
        lbID.setFont(fontLb);
        lbID.setHorizontalAlignment(SwingConstants.RIGHT);
        lbID.setPreferredSize(new Dimension(75, 30));

        idMec = new JTextField();
        idMec.setFont(fontIndex);
        idMec.setPreferredSize(new Dimension(60, 20));

        lbName = new JLabel("Tên Thuốc:");
        lbName.setFont(fontLb);
        lbName.setHorizontalAlignment(SwingConstants.RIGHT);

        nameMec = new JTextField();
        nameMec.setFont(fontIndex);
        nameMec.setPreferredSize(new Dimension(190, 30));

        lbType = new JLabel("Loại Thuốc:");
        lbType.setFont(fontLb);
        lbType.setHorizontalAlignment(SwingConstants.RIGHT);

        typeMec = new JTextField();
        typeMec.setFont(fontIndex);
        typeMec.setPreferredSize(new Dimension(60, 20));

        lbNsx = new JLabel("NSX:");
        lbNsx.setFont(fontLb);
        lbNsx.setHorizontalAlignment(SwingConstants.RIGHT);

        nsxMec = new JTextField();
        nsxMec.setFont(fontIndex);
        nsxMec.setPreferredSize(new Dimension(60, 20));

        lbHsd = new JLabel("HSD:");
        lbHsd.setFont(fontLb);
        lbHsd.setHorizontalAlignment(SwingConstants.RIGHT);

        hsdMec = new JTextField();
        hsdMec.setFont(fontIndex);
        hsdMec.setPreferredSize(new Dimension(60, 20));

        lbSolo = new JLabel("Số Lô:");
        lbSolo.setFont(fontLb);
        lbSolo.setHorizontalAlignment(SwingConstants.RIGHT);

        soloMec = new JTextField();
        soloMec.setFont(fontIndex);
        soloMec.setPreferredSize(new Dimension(60, 20));

        lbNum = new JLabel("Số Lượng:");
        lbNum.setFont(fontLb);
        lbNum.setHorizontalAlignment(SwingConstants.RIGHT);

        numMec = new JTextField();
        numMec.setFont(fontIndex);
        numMec.setPreferredSize(new Dimension(60, 20));

        lbCty = new JLabel("Cty SXuất:");
        lbCty.setFont(fontLb);
        lbCty.setHorizontalAlignment(SwingConstants.RIGHT);

        ctyMec = new JTextField();
        ctyMec.setFont(fontIndex);
        ctyMec.setPreferredSize(new Dimension(60, 20));

        editBtn = new JButton("EDIT");
        editBtn.setFont(new Font("Segoe UI", 3, 14));

        removeBtn = new JButton("REMOVE");
        removeBtn.setFont(new Font("Segoe UI", 3, 14));

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
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(lbType, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbNsx, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbHsd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbCty, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbSolo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbNum, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(idMec, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(nsxMec, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hsdMec, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                                        .addComponent(typeMec, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(nameMec, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ctyMec, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(numMec, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(soloMec, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                                                .addContainerGap(14, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(removeBtn, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(editBtn, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27))))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbHeader, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(exitBtn, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbHeader, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addGap(10,10,10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(idMec, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameMec, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNsx, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nsxMec, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbHsd, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hsdMec, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbType, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(typeMec, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbSolo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(soloMec, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNum, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numMec, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbCty, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ctyMec, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGap(20,20,20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(removeBtn, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editBtn, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        idMec.setEnabled(false);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    //Thiết lập các phương thức cho ActionListener:
    private void exitActionPerformed(ActionEvent evt) {
        JPanel parentPanel = (JPanel) this.getParent();
        parentPanel.remove(this);
        parentPanel.revalidate();
        parentPanel.repaint();
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
    public void showJTextField(MedicineEn a){
        idMec.setText("" + a.getID());
        nameMec.setText("" + a.getNameM());
        typeMec.setText("" + a.getTypeM());
        nsxMec.setText("" + a.getNSXM());
        hsdMec.setText("" + a.getHSDM());
        soloMec.setText("" + a.getSoloM());
        numMec.setText("" + a.getNumM());
        ctyMec.setText("" + a.getCtyM());
    }

//    public void fillJTextField

    private boolean validateName() {
        String name = nameMec.getText();
        if (name == null || "".equals(name.trim())) {
            nameMec.requestFocus();
            showMessage("Tên thuốc không được trống.");
            return false;
        }
        return true;
    }

    private boolean validateType() {
        String name = typeMec.getText();
        if (name == null || "".equals(name.trim())) {
            typeMec.requestFocus();
            showMessage("Loại thuốc không được trống.");
            return false;
        }
        return true;
    }

    private boolean validateNSX() {
        String name = nsxMec.getText();
        if (name == null || "".equals(name.trim())) {
            nsxMec.requestFocus();
            showMessage("Ngày sản xuất không được trống!");
            return false;
        }
        Pattern patternDate = Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");
        if(!patternDate.matcher(name).matches()){
            nsxMec.requestFocus();
            showMessage("Ngày sản xuất không đúng định dạng!");
            return false;
        }
        return true;
    }

    private boolean validateHSD() {
        String name = hsdMec.getText();
        if (name == null || "".equals(name.trim())) {
            hsdMec.requestFocus();
            showMessage("Hạn sử dụng không được trống.");
            return false;
        }
        Pattern patternDate = Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");
        if(!patternDate.matcher(name).matches()){
            hsdMec.requestFocus();
            showMessage("Hạn sử dụng không đúng định dạng!");
            return false;
        }
        return true;
    }

    private boolean validateSolo() {
        String name = soloMec.getText();
        if (name == null || "".equals(name.trim())) {
            soloMec.requestFocus();
            showMessage("Số lô sản phẩm không được để trống!");
            return false;
        }
        return true;
    }

    private boolean validateNum() {
        try {
            Integer num = Integer.parseInt(numMec.getText().trim());
            if (num <= 0) {
                numMec.requestFocus();
                showMessage("Số lượng không hợp lệ, vui lòng điền đúng (num > 0)!");
                return false;
            }
        } catch (Exception e) {
            numMec.requestFocus();
            showMessage("Số lượng nhập vào không hợp lệ!");
            return false;
        }
        return true;
    }

    private boolean validateCty() {
        String name = ctyMec.getText();
        if (name == null || "".equals(name.trim())) {
            ctyMec.requestFocus();
            showMessage("Công ty sản xuất không được trống.");
            return false;
        }
        return true;
    }

    /**
     * lấy thông tin chỉnh sửa Medicine
     *
     * @return
     */
    public MedicineEn getMedicineInfo() {
        // validate Medicine
        if (!validateName() || !validateType() || !validateNSX() || !validateHSD()
                || !validateSolo() || !validateNum() || !validateCty()) {
            return null;
        }
        try {
            MedicineEn medc = new MedicineEn();
            medc.setID(Integer.parseInt(idMec.getText().trim()));
            medc.setNameM(nameMec.getText().trim());
            medc.setTypeM(typeMec.getText().trim());
            medc.setNSXM(nsxMec.getText().trim());
            medc.setHSDM(hsdMec.getText().trim());
            medc.setSoloM(soloMec.getText().trim());
            medc.setNumM(Integer.parseInt(numMec.getText().trim()));
            medc.setCtyM(ctyMec.getText().trim());
            return medc;
        } catch (Exception e) {
            showMessage(e.getMessage());
        }
        return null;
    }

    public void setEditBtn(ActionListener evt){
        editBtn.addActionListener(evt);
    }

    public void setDeleteBtn(ActionListener evt){
        removeBtn.addActionListener(evt);
    }

}
