package func;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import entity.MedicineEn;
import entity.MedicineList;
import utils.HandleXML;

public class MedicineFunc {
    private static final String MEDICINE_FILE_NAME = "medicines.xml";
    private List<MedicineEn> listMedicines;

    public MedicineFunc() {
        this.listMedicines = readListMedicines();
        if (listMedicines == null ){
            listMedicines = new ArrayList<MedicineEn>();
        }
    }

    public void setListMedicines(List<MedicineEn> listMedicines) {
        this.listMedicines = listMedicines;
    }
    public List<MedicineEn> getListMedicines() {
        return listMedicines;
    }

    /**
     * Lưu các đối tượng medicine vào file mecidines.xml
     *
     * @param meds
     */
    public void writeListMedicines(List<MedicineEn> meds) {
        MedicineList mediList = new MedicineList();
        mediList.setMedicineList(meds);
        HandleXML.writeXMLtoFile(MEDICINE_FILE_NAME, mediList);
    }

    /**
     * Đọc các đối tượng student từ file medicines.xml
     *
     * @return list MedicineEn
     */
    public List<MedicineEn> readListMedicines() {
        List<MedicineEn> list = new ArrayList<MedicineEn>();
        MedicineList listMedi = (MedicineList) HandleXML.readXMLFile(MEDICINE_FILE_NAME, MedicineList.class);
        if (listMedi != null) {
            list = listMedi.getMedicineList();
        }
        return list;
    }


    /**
     * thêm medicine vào listMedicines và lưu listStudents vào file
     *
     * @param mediItem
     */
    public void add(MedicineEn mediItem) {
        int id = (listMedicines != null && listMedicines.size() > 0) ? (listMedicines.size()+ 1001) : 1001;
        mediItem.setID(id);
        listMedicines.add(mediItem);
        writeListMedicines(listMedicines);
    }

    /**
     * cập nhật medicine vào listMedicines và lưu listMedicines vào file
     *
     * @param mediItem
     */
    public void edit(MedicineEn mediItem) {
        int size = listMedicines.size();
        for (int i = 0; i < size; i++) {
            if (listMedicines.get(i).getID() == mediItem.getID()) {
                listMedicines.get(i).setNameM(mediItem.getNameM());
                listMedicines.get(i).setTypeM(mediItem.getTypeM());
                listMedicines.get(i).setNSXM(mediItem.getNSXM());
                listMedicines.get(i).setHSDM(mediItem.getHSDM());
                listMedicines.get(i).setSoloM(mediItem.getSoloM());
                listMedicines.get(i).setNumM(mediItem.getNumM());
                listMedicines.get(i).setCtyM(mediItem.getCtyM());
                writeListMedicines(listMedicines);
                break;
            }
        }
    }

    /**
     * xóa medicine vào listMedicines và lưu listMedicines vào file
     *
     * @param mediItem
     */
    public boolean delete(MedicineEn mediItem) {
        boolean isFound = false;
        int size = listMedicines.size();
        for (int i = 0; i < size; i++) {
            if (listMedicines.get(i).getID() == mediItem.getID()) {
                mediItem = listMedicines.get(i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            listMedicines.remove(mediItem);
            writeListMedicines(listMedicines);
            return true;
        }
        return false;
    }

    /**
     * sắp xếp danh sách medicines theo id,thứ tự tăng dần
     */
    public void sortMedicineByID() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            public int compare(MedicineEn item1, MedicineEn item2) {
                if (item1.getID() > item2.getID()) {
                    return 1;
                }
                return -1;
            }
        });
    }
    /**
     * sắp xếp danh sách medicines theo ID,thứ tự giảm dần
     */
    public void sortMedicineByIDDecre() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            public int compare(MedicineEn item1, MedicineEn item2) {
                if (item1.getID() < item2.getID()) {
                    return 1;
                }
                return -1;
            }
        });
    }

    /**
     * sắp xếp danh sách medicines theo name, thứ tự tăng dần
     */
    public void sortMedicineByName() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            public int compare(MedicineEn item1, MedicineEn item2) {
                return item1.getNameM().compareTo(item2.getNameM());
            }
        });
    }
    /**
     * sắp xếp danh sách medicines theo name, thứ tự giảm dần
     */
    public void sortMedicineByNameDecre() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            public int compare(MedicineEn item1, MedicineEn item2) {
                return item2.getNameM().compareTo(item1.getNameM());
            }
        });
    }

    /**
     * sắp xếp danh sách medicines theo type, thứ tự tăng dần
     */
    public void sortMedicineByType() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            public int compare(MedicineEn item1, MedicineEn item2) {
                return item1.getTypeM().compareTo(item2.getTypeM());
            }
        });
    }
    /**
     * sắp xếp danh sách medicines theo tyoe, thứ tự giảm dần
     */
    public void sortMedicineByTypeDecre() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            public int compare(MedicineEn item1, MedicineEn item2) {
                return item2.getTypeM().compareTo(item1.getTypeM());
            }
        });
    }

    /**
     * sắp xếp danh sách medicines theo ngày sản xuất,thứ tự tăng dần
     */
    public void sortMedicineByNSX() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            public int compare(MedicineEn item1, MedicineEn item2) {
                try {
                    Date date1 = dateFormat.parse(item1.getNSXM().trim());
                    Date date2 = dateFormat.parse(item2.getNSXM().trim());
                    return date1.compareTo(date2);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
    }

    /**
     * sắp xếp danh sách medicines theo ngày sản xuất,thứ tự giảm dần
     */
    public void sortMedicineByNSXDecre() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            public int compare(MedicineEn item1, MedicineEn item2) {
                try {
                    Date date1 = dateFormat.parse(item1.getNSXM().trim());
                    Date date2 = dateFormat.parse(item2.getNSXM().trim());
                    return date2.compareTo(date1);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
    }

    /**
     * sắp xếp danh sách medicines theo hạn sử dụng,thứ tự tăng dần
     */
    public void sortMedicineByHSD() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            public int compare(MedicineEn item1, MedicineEn item2) {
                try {
                    Date date1 = dateFormat.parse(item1.getHSDM().trim());
                    Date date2 = dateFormat.parse(item2.getHSDM().trim());
                    return date1.compareTo(date2);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
    }

    /**
     * sắp xếp danh sách medicines theo hạn sử dụng,thứ tự giảm dần
     */
    public void sortMedicineByHSDDecre() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            public int compare(MedicineEn item1, MedicineEn item2) {
                try {
                    Date date1 = dateFormat.parse(item1.getHSDM().trim());
                    Date date2 = dateFormat.parse(item2.getHSDM().trim());
                    return date2.compareTo(date1);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
    }

    /**
     * sắp xếp danh sách medicines theo số lô, thứ tự tăng dần
     */
    public void sortMedicineBySolo() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            public int compare(MedicineEn item1, MedicineEn item2) {
                return item1.getSoloM().compareTo(item2.getSoloM());
            }
        });
    }
    /**
     * sắp xếp danh sách medicines theo số lô, thứ tự giảm dần
     */
    public void sortMedicineBySoloDecre() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            public int compare(MedicineEn item1, MedicineEn item2) {
                return item2.getSoloM().compareTo(item1.getSoloM());
            }
        });
    }

    /**
     * sắp xếp danh sách medicines theo số lượng sản phẩm,thứ tự tăng dần
     */
    public void sortMedicineByNum() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            public int compare(MedicineEn item1, MedicineEn item2) {
                if (item1.getNumM() > item2.getNumM()) {
                    return 1;
                }
                return -1;
            }
        });
    }
    /**
     * sắp xếp danh sách medicines theo số lượng sản phẩm,thứ tự giảm dần
     */
    public void sortMedicineByNumDecre() {
        Collections.sort(listMedicines, new Comparator<MedicineEn>() {
            public int compare(MedicineEn item1, MedicineEn item2) {
                if (item1.getNumM() < item2.getNumM()) {
                    return 1;
                }
                return -1;
            }
        });
    }

    /**
     * Tìm kiếm medicine từ các dữ liệu đã cho:
     *
     */
    public List<MedicineEn> searchMedicine(MedicineEn temp, List<MedicineEn> list){
        List<MedicineEn> listSearch = new ArrayList<MedicineEn>();
        List<MedicineEn> listSearchtemp = new ArrayList<MedicineEn>();
        listSearchtemp.addAll(list);
        if(temp.getID() != -1){
            for(MedicineEn x: listSearchtemp){
                if(temp.getID() == x.getID())
                    listSearch.add(x);
            }
            if(listSearch.size() == 0)
                return null;
            else{
                listSearchtemp.clear();
                listSearchtemp.addAll(listSearch);
                listSearch.clear();
            }
        }
        if(!temp.getNameM().equals("")){
            for(MedicineEn x: listSearchtemp){
                if(x.getNameM().contains(temp.getNameM()))
                    listSearch.add(x);
            }
            if(listSearch.size() == 0)
                return null;
            else{
                listSearchtemp.clear();
                listSearchtemp.addAll(listSearch);
                listSearch.clear();
            }
        }
        if(!temp.getTypeM().equals("")){
            for(MedicineEn x: listSearchtemp){
                if(x.getTypeM().contains(temp.getTypeM()))
                    listSearch.add(x);
            }
            if(listSearch.size() == 0)
                return null;
            else{
                listSearchtemp.clear();
                listSearchtemp.addAll(listSearch);
                listSearch.clear();
            }
        }
        if(!temp.getNSXM().equals("")){
            for(MedicineEn x: listSearchtemp){
                if(x.getNSXM().contains(temp.getNSXM()))
                    listSearch.add(x);
            }
            if(listSearch.size() == 0)
                return null;
            else{
                listSearchtemp.clear();
                listSearchtemp.addAll(listSearch);
                listSearch.clear();
            }
        }
        if(!temp.getHSDM().equals("")){
            for(MedicineEn x: listSearchtemp){
                if(x.getHSDM().contains(temp.getHSDM()))
                    listSearch.add(x);
            }
            if(listSearch.size() == 0)
                return null;
            else{
                listSearchtemp.clear();
                listSearchtemp.addAll(listSearch);
                listSearch.clear();
            }
        }
        if(!temp.getSoloM().equals("")){
            for(MedicineEn x: listSearchtemp){
                if(x.getSoloM().contains(temp.getSoloM()))
                    listSearch.add(x);
            }
            if(listSearch.size() == 0)
                return null;
            else{
                listSearchtemp.clear();
                listSearchtemp.addAll(listSearch);
                listSearch.clear();
            }
        }
        if(temp.getNumM() != -1){
            for(MedicineEn x: listSearchtemp){
                if(temp.getNumM() == x.getNumM())
                    listSearch.add(x);
            }
            if(listSearch.size() == 0)
                return null;
            else{
                listSearchtemp.clear();
                listSearchtemp.addAll(listSearch);
                listSearch.clear();
            }
        }
        if(!temp.getCtyM().equals("")){
            for(MedicineEn x: listSearchtemp){
                if(x.getCtyM().contains(temp.getCtyM()))
                    listSearch.add(x);
            }
            if(listSearch.size() == 0)
                return null;
            else{
                listSearchtemp.clear();
                listSearchtemp.addAll(listSearch);
                listSearch.clear();
            }
        }
        listSearch.addAll(listSearchtemp);
        return listSearch;
    }



}
