package ПР17;

public class Girl {
    private String name;
    private String favoriteSong;

    public Girl(String name, String favoriteSong) {
        this.name = name;
        this.favoriteSong = favoriteSong;
    }


    public String getName() {
        return name;
    }

    public String getFavoriteSong() {
        return favoriteSong;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
}