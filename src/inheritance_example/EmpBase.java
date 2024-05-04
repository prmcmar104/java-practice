package inheritance_example;

/**
 * Created by Jay Vaghani
 */
public class EmpBase {
    int eId;
    String eName;

    public EmpBase(int eId, String eName) {
        this.eId = eId;
        this.eName = eName;
    }

    public int geteId(){
        return eId;
    }

    public String geteName(){
        return eName;
    }
}
