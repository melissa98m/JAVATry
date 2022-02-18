public class HelloUniverse {
    public static void main(String... args) {

       Planete jupiter = new Planete();
       jupiter.name = "Jupiter";
       jupiter.matiere = "Gazeuse";
       jupiter.diameter = 142984;

       Planete Mercure = new Planete();
       Mercure.name = "Mercure";
       Mercure.matiere = "Telurique";
       Mercure.diameter = 4880;

        Planete Venus = new Planete();
        Venus.name = "Venus";
        Venus.matiere = "Telurique";
        Venus.diameter = 12100;

        Planete Terre = new Planete();
        Terre.name = "Terre";
        Terre.matiere = "Telurique";
        Terre.diameter = 12756;

        Planete Mars = new Planete();
        Mars.name = "Mars";
        Mars.matiere = "Telurique";
        Mars.diameter =  6792;

        Planete Saturne = new Planete();
        Saturne.name = "Saturne";
        Saturne.matiere = "Gazeuse";
        Saturne.diameter = 120536;

        Planete Uranus = new Planete();
        Uranus.name = "Uranus";
        Uranus.matiere = "Gazeuse";
        Uranus.diameter = 120536;

        Planete Neptune = new Planete();
        Neptune.name = "Neptune";
        Neptune.matiere = "Gazeuse";
        Neptune.diameter = 49532;


        System.out.printf("%s est une planete %s avec un diametre de %d" , jupiter.name, jupiter.matiere, jupiter.diameter);
    }
}