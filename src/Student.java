public class Student {
    private String name;
    private int ID;
    private double CG;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.ID = id;
        this.CG = cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCG(double CG) {
        this.CG = CG;
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.ID;
    }

    public double getCG() {
        return this.CG;
    }
}
