public class VaisseauDeGuerre  extends Vaisseau{


    void attaquer(Vaisseau vaisseau , String arme ,int duree) {
        System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + vaisseau.type + " avec l'arme "
        + arme + " pendant " + duree + " minutes");
        vaisseau.resistanceDuBouclier=0;
        vaisseau.blindage= vaisseau.blindage/2;

    }
}
