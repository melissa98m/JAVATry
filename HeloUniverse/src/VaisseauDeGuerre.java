public class VaisseauDeGuerre  extends Vaisseau{

    boolean armesDesactive;

    void attaquer(Vaisseau vaisseau , String arme ,int duree) {
        if(armesDesactive) {
            System.out.println("Attaque impossible, l'armement est désactivé");
        }else {
            System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + vaisseau.type + " avec l'arme "
                    + arme + " pendant " + duree + " minutes");
            vaisseau.resistanceDuBouclier = 0;
            vaisseau.blindage = vaisseau.blindage / 2;
        }
    }
    void desactiverArme(){
        armesDesactive=true;
        System.out.println("Désactivation des armes d'un vaisseau de type"
        + type);
    }

    void activerBouclier() {
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
        desactiverArme();
    }
}
