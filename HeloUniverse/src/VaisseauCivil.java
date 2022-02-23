public class VaisseauCivil extends Vaisseau {

    VaisseauCivil(String type) {
        this.type = type;
        if (type.equals("Cargo")) {
            tonnageMax = 500;
        } else if (type.equals("Vaisseau-Monde")) {
            tonnageMax = 2000;
        }
    }

    int emporterCargaison(int cargaisson) {
        int tonnageRestant = tonnageMax - tonnageActuel;
        if (cargaisson > tonnageRestant) {
            tonnageActuel = tonnageMax;
            return cargaisson - tonnageRestant;
        } else {
            tonnageActuel = tonnageActuel + cargaisson;
            return 0;
        }
    }

}

