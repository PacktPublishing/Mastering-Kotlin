package javafromkotlin;

// basic Java class
public class Developer {
    private String name;
    private String favoriteLanguage;

    public Developer(String name, String favoriteLanguage) {
        this.name = name;
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }
}
