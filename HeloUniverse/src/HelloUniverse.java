public class HelloUniverse {
    public static void main(String... args) {
       short year = 2006;
        int nbPlanets = 0;
        String message = "En %d ,  les planètes du système solaire étaient au nombre de : %d";
        if (year < 1600 || year > 2022) {
            System.out.printf("Le programme ne peut donné un resultat car l'année %d saisie n'est pas valide" , year);
        }
        else
        {
            if(year < 1700){
                nbPlanets=7;
            }
            else if(year < 1800){
                nbPlanets=8;
            }
            else if(year < 2006){
                nbPlanets=9;
            }
            else {
                nbPlanets=8;
            }
        }
        System.out.printf(message , year, nbPlanets);
    }
}