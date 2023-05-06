package view;

import net.miginfocom.swing.MigLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import UI.layout.AddFun;
import UI.layout.EditRmFun;
import UI.layout.SearchFun;
import UI.layout.SortedFun;
import UI.layout.swing.ButtonCus;
import entity.MedicineEn;

public class DashBoardView extends JFrame {
    private static final long serialVersionUID = 1L;
    public JPanel feaPane, topPane, workPane;
    private JScrollPane DBView;
    private JTable MedicineTable;
    private ButtonCus searchBtn, addBtn, editBtn, generBtn, sortBtn;

    private AddFun addPanel = new AddFun();
    private EditRmFun editPanel = new EditRmFun();
    private SearchFun searchPanel = new SearchFun();
    private SortedFun sortPanel = new SortedFun();

    private String [] columnNames = new String [] {
            "ID", "Tên thuốc", "NSX", "HSD", "Loại thuốc", "Số lô", "Số lượng", "Cty Sản xuất"};
    private Object data = new Object [][] {};

    Font fontTable = new Font("Segoe UI", 3, 14);
    DefaultTableModel tbview = new DefaultTableModel((Object[][])data, columnNames);

    public DashBoardView(){
        init();
    }

    void init(){
        setSize(1500,650);
        setTitle("Medicine App");
        setLayout(new BorderLayout());

        //TOP:
        topPane = new JPanel();
        topPane.setPreferredSize(new Dimension(1500,70));
        topPane.setBackground(new Color(2, 44, 8));
        topPane.setLayout(new MigLayout("fill", "30[][]push", "push[]push"));
        topPane.add(new JLabel(new ImageIcon("src/main/java/UI/icon/app_syp.png")));
        JLabel label1 = new JLabel("MEDICINE APP");
        label1.setFont(new Font("Calibri", 3, 24));
        label1.setForeground(Color.WHITE);
        topPane.add(label1);
        add(topPane, BorderLayout.NORTH);


        //LEFT:
        feaPane = new JPanel();
        feaPane.setLayout(new MigLayout("fillx, inset 0 0 0 0, w 200:200:200, h 550:550:550",
                "[]","0[center]0"));
        Color colorFea = new Color(14, 70, 23);
        feaPane.setBackground(colorFea);

        generBtn = createButton("General Dashboard", new ImageIcon("src/main/java/UI/icon/dashboard.png"), colorFea);
        feaPane.add(generBtn, "wrap, w 200:200:200, h 50:50:50");

        sortBtn = createButton("Sort Medicine", new ImageIcon("src/main/java/UI/icon/sort.png"), colorFea);
        feaPane.add(sortBtn, "grow, wrap, h 50:50:50");

        searchBtn = createButton("Search Medicine", new ImageIcon("src/main/java/UI/icon/searchh.png"), colorFea);
        feaPane.add(searchBtn, "grow, wrap, h 50:50:50");

        addBtn = createButton("Add Medicine", new ImageIcon("src/main/java/UI/icon/plus.png"), colorFea);
        feaPane.add(addBtn, "grow, wrap, h 50:50:50");

        editBtn = createButton("Edit & Delete Medicine", new ImageIcon("src/main/java/UI/icon/edit.png"), colorFea);
        feaPane.add(editBtn, "grow, wrap, h 50:50:50");

        add(feaPane, BorderLayout.WEST);

        //CENTER:
        MedicineTable = new JTable();
        MedicineTable.setModel(tbview);
        MedicineTable.setPreferredSize(new Dimension(1280, 500));
        MedicineTable.setRowHeight(30);
        JTableHeader a = MedicineTable.getTableHeader();
        a.setPreferredSize(new Dimension(MedicineTable.getWidth(), 40));
        a.setBackground(new Color(232, 247, 253));
        a.setFont(new Font("Calibri", 1, 16));

        DBView = new JScrollPane();
        DBView.setPreferredSize(new Dimension(1300, 630));
        DBView.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        DBView.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        DBView.setViewportView(MedicineTable);
        DBView.setBackground(Color.WHITE);

        workPane = new JPanel(new MigLayout("insets 0 0 0 0", "0[]0[]push", "0[top]push"));
        workPane.setPreferredSize(new Dimension(1300, 580));
        workPane.add(DBView);

//        workPane.add(addPanel, "wrap");
        add(workPane, BorderLayout.CENTER);
        setPreferredSize(new Dimension(1500, 650));

        generBtn.addActionListener(new ClickGeneBtn());
        editBtn.addActionListener(new ClickEditBtn());
        sortBtn.addActionListener(new ClickSortBtn());
        searchBtn.addActionListener(new ClickSearchBtn());
        addBtn.addActionListener(new ClickAddBtn());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //đóng khi cửa số đóng
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    public ButtonCus createButton(String text, ImageIcon a, Color color){
        ButtonCus temp = new ButtonCus();
        temp.setText(text);
        temp.setIcon(a);
        temp.setOvalH(0);
//        temp.setHorizontalAlignment(SwingConstants.CENTER);
//        temp.setMargin(new Insets(0, 20, 0, 0));
        temp.setBackground(color);
        temp.setEffectColor(temp.getBackground());
        temp.setOverColor(new Color(17, 59, 13));
        temp.setBorder(null);
        temp.setFont(new Font("Calibri", 1, 16));
        temp.setForeground(Color.WHITE);
        return temp;

    }

    public boolean checkAddFun(){
        return (workPane.getComponent(1) instanceof AddFun);
    }
    public boolean checkEditFun(){
        return (workPane.getComponent(1) instanceof EditRmFun);
    }
    public boolean checkSearchFun(){
        return (workPane.getComponent(1) instanceof SearchFun);
    }
    public boolean checkSortFun(){
        return (workPane.getComponent(1) instanceof SortedFun);
    }


    //Hàm chức năng khi làm việc với DashBoard
    /**
     *Thông báo thông qua một Dialog mới
     */
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    /**
     * hiển thị list student vào bảng MedicineTable
     * gồm 8 trường dữ liệu
     *
     * @param list
     */
    public void showListMedicines(List<MedicineEn> list) {
        if(list == null){
            Object [][] medicines = null;
            tbview.setDataVector(medicines, columnNames);
            MedicineTable.setModel(tbview);
            return;
        }
        int size = list.size();
        Object [][] medicines = new Object[size][8];
        for (int i = 0; i < size; i++) {
            medicines[i][0] = list.get(i).getID();
            medicines[i][1] = list.get(i).getNameM();
            medicines[i][2] = list.get(i).getNSXM();
            medicines[i][3] = list.get(i).getHSDM();
            medicines[i][4] = list.get(i).getTypeM();
            medicines[i][5] = list.get(i).getSoloM();
            medicines[i][6] = list.get(i).getNumM();
            medicines[i][7] = list.get(i).getCtyM();
        }
        tbview.setDataVector(medicines, columnNames);
        MedicineTable.setModel(tbview);
    }

    /**
     * Điền thông tin của hàng được chọn từ bảng MedicineTable
     * vào các trường tương ứng trên các layout.
     */
    public void fillMedicineFromSelectedRow() {
        // lấy chỉ số của hàng được chọn
        int row = MedicineTable.getSelectedRow();
        if(row >=0){
            Component[] components = workPane.getComponents();
            for (Component component : components) {
                if (component instanceof EditRmFun) {
                    ((EditRmFun) component).setTextIdMec(MedicineTable.getModel().getValueAt(row, 0).toString());
                    ((EditRmFun) component).setTextNameMec(MedicineTable.getModel().getValueAt(row, 1).toString());
                    ((EditRmFun) component).setTextNSXMec(MedicineTable.getModel().getValueAt(row, 2).toString());
                    ((EditRmFun) component).setTextHSDMec(MedicineTable.getModel().getValueAt(row, 3).toString());
                    ((EditRmFun) component).setTextTypeMec(MedicineTable.getModel().getValueAt(row, 4).toString());
                    ((EditRmFun) component).setTextSoloMec(MedicineTable.getModel().getValueAt(row, 5).toString());
                    ((EditRmFun) component).setTextNumMec(MedicineTable.getModel().getValueAt(row, 6).toString());
                    ((EditRmFun) component).setTextCtyMec(MedicineTable.getModel().getValueAt(row, 7).toString());
                }
            }
        }
    }

    /**
     * xóa thông tin medicine
     */
    public void clearMedicineInfo() {
        if(checkAddFun()){
            addPanel.resetJTextField();
        }
        else if(checkEditFun()){
            editPanel.resetJTextField();
        } else if (checkSearchFun()) {
            searchPanel.resetJTextField();
        }
    }

    /**
     * lấy thông tin medicine khi giao diện AddFun hiện ra
     *
     * @return
     */
    public MedicineEn getMedicineInfo() {
        MedicineEn temp = new MedicineEn();
        if(checkAddFun()){
            temp = addPanel.getMedicineInfo();
        } else if (checkEditFun()) {
            temp = editPanel.getMedicineInfo();
        } else if (checkSearchFun()) {
            temp = searchPanel.getMedicineInfo();
        }
        return temp;
    }

    /**
     * lấy thông tin cần sort khi SortedFun hiện ra
     *
     * @return
     */
    public int[] getButtonSelect(){
        if(checkSortFun())
            return sortPanel.checkButton();
        return null;
    }










    //Xử lý các BUTTON sau:sortBtn, searchBtn, addBtn, editBtn, removeBtn, filterBtn
    public void GeneBtnAction() {
        generBtn.addActionListener(new ClickGeneBtn());
    }
    public void SearchBtnAction() {
        generBtn.addActionListener(new ClickSearchBtn());
    }
    public void SortBtnAction() {
        generBtn.addActionListener(new ClickSortBtn());
    }
    public void EditBtnAction() {
        generBtn.addActionListener(new ClickEditBtn());
    }
    public void AddBtnAction() {
        generBtn.addActionListener(new ClickAddBtn());
    }

    public void deleteWorkPane(){
        Component[] temp = workPane.getComponents();
        if(temp.length >= 2){
            for (int i = temp.length - 1; i > 0; i--){
                temp[i].setVisible(false);
                workPane.remove(temp[i]);
            }
        }
    }
    class ClickGeneBtn implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            deleteWorkPane();
            workPane.setVisible(false);
            workPane.setVisible(true);
        }
    }

    class ClickSearchBtn implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            deleteWorkPane();
            workPane.add(searchPanel, "wrap");
            System.out.println(workPane.getComponent(1));
            searchPanel.setVisible(true);
            workPane.setVisible(false);
            workPane.setVisible(true);
        }
    }

    class ClickSortBtn implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            deleteWorkPane();
            workPane.add(sortPanel, "wrap");
            System.out.println(workPane.getComponent(1));
            sortPanel.setVisible(true);
            workPane.setVisible(false);
            workPane.setVisible(true);
        }
    }

    class ClickEditBtn implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            deleteWorkPane();
            workPane.add(editPanel, "wrap");
            System.out.println(workPane.getComponent(1));
            editPanel.setVisible(true);
            workPane.setVisible(false);
            workPane.setVisible(true);
        }
    }

    class ClickAddBtn implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            deleteWorkPane();
            workPane.add(addPanel, "wrap");
            addPanel.setVisible(true);
            workPane.setVisible(false);
            workPane.setVisible(true);

            System.out.println(workPane.getComponent(1));

        }
    }

    //Xử lý các button trong UIFunc
    public void ClickAddFunBtn(ActionListener evt){
        addPanel.setAddBtn(evt);
    }
    public void ClickClearFunBtn(ActionListener evt){
        addPanel.setClearBtn(evt);
    }
    public void ClickEditFunBtn(ActionListener evt){
        editPanel.setEditBtn(evt);
    }
    public void ClickDeleteFunBtn(ActionListener evt){
        editPanel.setDeleteBtn(evt);
    }
    public void ClickSortFunBtn(ActionListener evt){
        sortPanel.setSortBtn(evt);
    }

    public void ClickSearchFunBtn(ActionListener evt){
        searchPanel.setSearchBtn(evt);
    }




    public void ClickMedicineListSelectionListener(ListSelectionListener listener) {
        MedicineTable.getSelectionModel().addListSelectionListener(listener);
    }

    public static void main(String[] args) {
        new DashBoardView();
    }





}
