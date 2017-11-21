package Game;

import java.util.ArrayList;

public class ComputerGameParams {
    private ArrayList<Genre> genres;
    private ArrayList<Platforms> platforms;
    private String description;
    private int price;
    private int ageRestriction;
    private String name;

    public ComputerGameParams(String name, String description, int ageRestriction, int price, ArrayList<Genre> genres, ArrayList<Platforms> platforms){
        this.name = name;
        this.description = description;
        this.ageRestriction = ageRestriction;
        this.genres = genres;
        this.price = price;
        this.platforms = platforms;

    }
    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public ArrayList<Platforms> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(ArrayList<Platforms> platforms) {
        this.platforms = platforms;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction){
        this.ageRestriction = ageRestriction;
    }

}
