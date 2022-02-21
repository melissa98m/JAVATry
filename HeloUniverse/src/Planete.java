public class Planete {
    String name;
    String matiere;
    long diameter;
    int totalVisiteur;

    int rotation(int angle){
        return angle/360;
    }

    int revolution(int angle){
        return angle/360;
    }

    void accueillirVaisseau(int newHuman) {
        totalVisiteur = totalVisiteur + newHuman;
    }

    void accueillirVaisseau(String type) {
        if(type.equals("Chasseur")) {
            totalVisiteur = totalVisiteur + 3;
        } else if (type.equals("Fregate")) {
            totalVisiteur = totalVisiteur + 12;
        } else if (type.equals("Croisseur")) {
            totalVisiteur = totalVisiteur + 50;
        }

    }
}
