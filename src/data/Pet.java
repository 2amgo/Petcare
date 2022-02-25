package data;

public class Pet {
   private String id;
   private String name;
   private int birthDay;
   private double weight;

    public Pet(String id, String name, int birthDay, double weight) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
