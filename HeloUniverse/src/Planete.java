public abstract class Planete {

    static String forme = "Spherique";
    static int nbPlanetesDecouvertes = 0;

    String name;

    long diameter;
    int totalVisiteur;
    Atmosphere atmosphere;
    Vaisseau vaisseauAccoster;


    Planete(String name) {
        this.name = name;
        nbPlanetesDecouvertes++;

    }

    int rotation(int angle) {
        return angle / 360;
    }

    int revolution(int angle) {
        return angle / 360;
    }


    static String expension(double distance) {
        if (distance < 14) {
            return "Oh la la mais c'est super rapide !";
        } else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }

    }

}
