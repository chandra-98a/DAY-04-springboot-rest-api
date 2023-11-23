package bean;

public class Student {
    private int id;
    private String fname;
    private String lName;

    public Student( int id,String fname,String lName) {
       id=this.id;
       fname=this.fname;
       lName=this.lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
