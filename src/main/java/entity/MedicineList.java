package entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "medicines")
@XmlAccessorType(XmlAccessType.FIELD)
public class MedicineList {
    private List<MedicineEn> medicine;

    public List<MedicineEn> getMedicineList() {
        return medicine;
    }

    public void setMedicineList(List<MedicineEn> medicineList) {
        this.medicine = medicineList;
    }
}
