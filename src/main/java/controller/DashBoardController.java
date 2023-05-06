package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import entity.MedicineEn;
import entity.MedicineList;
import func.MedicineFunc;
import view.DashBoardView;

public class DashBoardController {
    private DashBoardView dashBV;
    private MedicineFunc mediFun;

    DashBoardController(DashBoardView a){
        dashBV = a;
        dashBV.setVisible(true);
        mediFun = new MedicineFunc();
        dashBV.ClickAddFunBtn(new AddMedicineListener());
        dashBV.ClickClearFunBtn(new ClearMedicineListener());

        dashBV.ClickEditFunBtn(new EditMedicineListener());
        dashBV.ClickDeleteFunBtn(new DeleteMedicineListener());

        dashBV.ClickSortFunBtn(new SortMedicineListener());

        dashBV.ClickSearchFunBtn(new SearchMedicineListener());

        dashBV.ClickMedicineListSelectionListener(new ListMedicineSelectionListener());

    }
    public void showDashView(){
        List<MedicineEn> mediList = mediFun.getListMedicines();
        dashBV.setVisible(true);
        dashBV.showListMedicines(mediList);
    }

    /**
     * Lớp AddMedicineListener
     * chứa cài đặt cho sự kiện click button "Add" trong AddFun
     *
     * @author PHOENIX K.NEIL
     */
    class AddMedicineListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MedicineEn item = dashBV.getMedicineInfo();
            if (item != null) {
                mediFun.add(item);
//                dashBV.showMedicine(item);
                dashBV.clearMedicineInfo();
                dashBV.showListMedicines(mediFun.getListMedicines());
                dashBV.showMessage("Thêm thành công!");
            }
        }
    }

    /**
     * Lớp ClearMedicineListener
     * chứa cài đặt cho sự kiện click button "Clear" trong AddFun
     *
     * @author viettuts.vn
     */
    class ClearMedicineListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dashBV.clearMedicineInfo();
        }
    }

    /**
     * Lớp EditMedicineListener
     * chứa cài đặt cho sự kiện click button "Edit"
     *
     * @author viettuts.vn
     */
    class EditMedicineListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MedicineEn item = dashBV.getMedicineInfo();
            if (item != null){
                mediFun.edit(item);
                dashBV.showListMedicines(mediFun.getListMedicines());
                dashBV.showMessage("Cập nhật thành công!");
                dashBV.clearMedicineInfo();
            }
        }
    }

    /**
     * Lớp DeleteStudentListener
     * chứa cài đặt cho sự kiện click button "Delete"
     *
     * @author viettuts.vn
     */
    class DeleteMedicineListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MedicineEn item = dashBV.getMedicineInfo();
            if (item != null) {
                mediFun.delete(item);
                dashBV.clearMedicineInfo();
                List<MedicineEn> a = mediFun.getListMedicines();
                int i = 0;
                for (MedicineEn x: a){
                    x.setID(1001 + i++);
                }

                dashBV.showListMedicines(a);
                dashBV.showMessage("Xóa thành công!");
            }
        }
    }

    /**
     * Lớp SortMedicineListener
     * chứa cài đặt cho sự kiện click button "Sort"
     *
     * @author viettuts.vn
     */

    class SortMedicineListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int[] a = dashBV.getButtonSelect();
            System.out.println(a[0] + " " + a[1]);
            if (a[1] == 1){
                switch (a[0]){
                    case 1:
                        mediFun.sortMedicineByID();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 2:
                        mediFun.sortMedicineByName();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 3:
                        mediFun.sortMedicineByType();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 4:
                        mediFun.sortMedicineByNSX();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 5:
                        mediFun.sortMedicineByHSD();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 6:
                        mediFun.sortMedicineBySolo();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 7:
                        mediFun.sortMedicineByNum();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 8:
                        break;
                    default:
                        break;
                }
            }
            else if (a[1] == 2){
                switch (a[0]){
                    case 1:
                        mediFun.sortMedicineByIDDecre();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 2:
                        mediFun.sortMedicineByNameDecre();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 3:
                        mediFun.sortMedicineByTypeDecre();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 4:
                        mediFun.sortMedicineByNSXDecre();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 5:
                        mediFun.sortMedicineByHSDDecre();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 6:
                        mediFun.sortMedicineBySoloDecre();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 7:
                        mediFun.sortMedicineByNum();
                        dashBV.showListMedicines(mediFun.getListMedicines());
                        break;
                    case 8:
                        break;
                    default:
                        break;
                }
            }
        }
    }


    class SearchMedicineListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            MedicineEn item = dashBV.getMedicineInfo();
            if(item != null){
                List<MedicineEn> a = new ArrayList<MedicineEn>();
                a.addAll(mediFun.getListMedicines());
                List<MedicineEn> b = mediFun.searchMedicine(item, a);
                dashBV.showListMedicines(b);
                dashBV.showMessage("Tìm kiếm thành công!");
//            dashBV.clearMedicineInfo();
            }
        }
    }

    /**
     * Lớp ListMedicineSelectionListener
     * chứa cài đặt cho sự kiện chọn một hàng medicine trong bảng MedicineTable
     *
     * @author PHOENIX K.NEIL
     */
    class ListMedicineSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            dashBV.fillMedicineFromSelectedRow();
        }
    }
}