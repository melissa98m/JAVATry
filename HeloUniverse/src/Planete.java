public class Planete {
    String name;
    String matiere;
    long diameter;

    void rotation(){
        System.out.println("Je suis la planète " + name + " et je tourne sur moi-même.");
    }
    void revolution(){
        System.out.println("Je suis la planète " + name + " et je tourne autour de mon étoile.");
    }
}
