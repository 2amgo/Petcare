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
    //code tiep tuc viet va day len .
    //git add *
    /*1. git add
    2. git commit -m "viet thay doi cai gi "
    3. git push.
    * */

    public  void showProfile(){
        System.out.println("this is commit local");
        System.out.println("this is commit by another");
       
    }
}
