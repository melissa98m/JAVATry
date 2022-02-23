public class VaisseauDeGuerre extends Vaisseau {

    boolean armesDesactive;

    VaisseauDeGuerre(String type) {
        this.type = type;
        if (type.equals("Chasseur")) {
            tonnageMax = 0;
        } else if (type.equals("Fregate")) {
            tonnageMax = 50;
        } else if (type.equals("Croiser")) {
            tonnageMax = 100;
        }
    }
    void attaquer(Vaisseau vaisseau, String arme, int duree) {
        if (armesDesactive) {
            System.out.println("Attaque impossible, l'armement est désactivé");
        } else {
            System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + vaisseau.type + " avec l'arme "
                    + arme + " pendant " + duree + " minutes");
            vaisseau.resistanceDuBouclier = 0;
            vaisseau.blindage = vaisseau.blindage / 2;
        }
    }

    void desactiverArme() {
        armesDesactive = true;
        System.out.println("Désactivation des armes d'un vaisseau de type"
                + type);
    }

    void activerBouclier() {
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
        desactiverArme();
    }

    int emporterCargaison(int cargaisson) {
        if (type.equals("Chasseur")) {
            return cargaisson;
        } else {
            if (nbPassager < 12) {
                return cargaisson;
            } else {
                int tonnagePassager = 2 * nbPassager;
                int tonnageRestant = tonnageMax - tonnageActuel;
                int tonnageConsideerer = (tonnagePassager < tonnageRestant ? tonnagePassager : tonnageRestant);
                if (cargaisson > tonnageConsideerer) {
                    tonnageActuel = tonnageMax;
                    return cargaisson - tonnageMax;
                } else {
                    tonnageActuel += cargaisson;
                    return 0;
                }
            }
        }
    }
}
