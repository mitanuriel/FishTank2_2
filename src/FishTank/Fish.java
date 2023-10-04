package FishTank;

public class Fish {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void fish(String fishName){
        this.name = fishName;
    }
    public void foder(int dage){
        System.out.println(name+ " blev fodret "+dage+" dage");
    }
    public String getName(){
        return name;
    }
}
