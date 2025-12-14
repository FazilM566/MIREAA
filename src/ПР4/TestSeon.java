package ПР4;

public class TestSeon {
    public static void main(String[] args) {

        Seasons favorite_seasons = Seasons.SUMMER;
        System.out.println(fav(favorite_seasons));
        System.out.println("Средняя температура: " + favorite_seasons.getTemp() + " градусов");
        favorite_seasons.setDescription();
        System.out.println(favorite_seasons.getDescription());

        Seasons[] all = Seasons.values();
        for (Seasons fv: all) {
            switch (fv) {
                case Seasons.SUMMER:
                    String(fv);
                    fv.setDescription();
                    System.out.println(fv.getDescription());
                    break;
                case Seasons.SPRING:
                    String(fv);
                    break;
                case Seasons.WINTER:
                    String(fv);
                    System.out.println(fv.getDescription());
                    break;
                case Seasons.AUTUMN:
                    String(fv);
                    break;
            }
        }
    }

    static String fav(Seasons fs) {
        return switch(fs) {
            case Seasons.AUTUMN -> "Я люблю осень";
            case Seasons.SPRING -> "Я люблю весну";
            case Seasons.WINTER -> "Я люблю зиму";
            case Seasons.SUMMER -> "Я люблю лето";
        };
    }
    static void String(Seasons fv){
        System.out.println(fv);
        System.out.println("Средняя температура: " + fv.getTemp() + " градусов");
    }
}
