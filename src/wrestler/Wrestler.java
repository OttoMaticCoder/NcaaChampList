package wrestler;

public class Wrestler {
    private String name;
    private String school;
    private String nattys;
    private String weight;

    public Wrestler(String name, String school, String nattys, String weight) {
      this.name = name;
      this.school = school;
      this.nattys = nattys;
      this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNattys() {
        return nattys;
    }

    public void setNattys(String nattys) {
        this.nattys = nattys;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  name + "," +
                school + "," +
                nattys + "," +
                weight;
    }
}
