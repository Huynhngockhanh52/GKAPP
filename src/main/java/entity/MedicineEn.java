package entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "medicine")
@XmlAccessorType(XmlAccessType.FIELD)
public class MedicineEn implements Serializable {
    private static final long serialVersionUID = 1L;
    private int ID;
    private String nameM, NSXM, HSDM, typeM, soloM, ctyM;
    private Integer numM;

    public MedicineEn(){}
    public MedicineEn(int id, String name, String NSX, String HSD, String type, String solo, Integer num, String Cty){
        super();
        this.ID = id;
        this.nameM = name;
        this.NSXM = NSX;
        this.HSDM = HSD;
        this.typeM = type;
        this.soloM = solo;
        this.numM = num;
        this.ctyM = Cty;
    }

    //Getter và Setter:
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }
    public void setNameM(String nameM) {
        this.nameM = nameM;
    }
    public String getNameM() {
        return nameM;
    }
    public void setNSXM(String NSXM) {
        this.NSXM = NSXM;
    }
    public String getNSXM() {
        return NSXM;
    }
    public void setHSDM(String HSDM) {
        this.HSDM = HSDM;
    }
    public String getHSDM() {
        return HSDM;
    }
    public void setTypeM(String typeM) {
        this.typeM = typeM;
    }
    public String getTypeM() {
        return typeM;
    }
    public void setSoloM(String soloM) {
        this.soloM = soloM;
    }
    public String getSoloM() {
        return soloM;
    }
    public String getCtyM() {
        return ctyM;
    }
    public void setCtyM(String ctyM) {
        this.ctyM = ctyM;
    }
    public void setNumM(Integer numM) {
        this.numM = numM;
    }
    public Integer getNumM() {
        return numM;
    }

}
