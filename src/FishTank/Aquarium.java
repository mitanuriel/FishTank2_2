package FishTank;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Aquarium {
    private String name;
    private waterQuality waterQuality;
    private String lastWaterChangeNote;
    private ArrayList<Fish> fish;
    private LocalDateTime lastWaterChangeDate;

    public Aquarium(String name){
        this.name = name;
        this.fish = new ArrayList<>();
        this.waterQuality = waterQuality.UKENDT;
        this.lastWaterChangeDate = null;
        this.lastWaterChangeNote= null;
    }
    public void ChangeWater (String note, String date){
        lastWaterChangeDate = LocalDateTime.now();
        lastWaterChangeNote = note;
        System.out.println("the water been changed "+lastWaterChangeDate+ " with the note "+lastWaterChangeNote);
    }
    public void addFish (Fish fisk ){
        fish.add(fisk);
    }
    public void feedFish (int day){
        for (Fish fisk: fish) {
            fisk.food(day);
        }
    }
    public void checkFishHealth () {
        for (Fish fisk : fish) {
            System.out.println(fisk.getName()+ " is healthy and in good mood");
        }
    }
    public void setWaterQuality () {
    }
}
