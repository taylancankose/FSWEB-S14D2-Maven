package org.example.model;

public class Bedroom {
    private String name;
    private String wall1;
    private String wall2;
    private String wall3;
    private String wall4;
    private Wall ceiling;
    private Bed bed;
    private Lamp lap;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, String wall1, String wall2, String wall3, String wall4, Wall ceiling, Bed bed, Lamp lap, Wardrobe wardrobe, Carpet carpet) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lap = lap;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public String getWall1() {
        return wall1;
    }

    public String getWall2() {
        return wall2;
    }

    public String getWall3() {
        return wall3;
    }

    public String getWall4() {
        return wall4;
    }

    public Wall getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLap() {
        return lap;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
