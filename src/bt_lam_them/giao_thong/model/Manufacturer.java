package bt_lam_them.giao_thong.model;

public class Manufacturer {
    private int code;
    private String Name;
    private String nation;

    public Manufacturer() {
    }

    public Manufacturer(int code, String name, String nation) {
        this.code = code;
        Name = name;
        this.nation = nation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "code=" + code +
                ", Name='" + Name + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
