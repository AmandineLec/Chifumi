package projet;

public class Chifumi {
    // Création de la classe chifumi dans le but de créer des objets chifumi et de pouvoir jouer au jeu.
    //Pour se faire, j'aimerais créer des classes pour les "armes" (pierre, feuille, ciseaux...)

    // armes pierre = new armes(0, "pierre");
    // armes feuille = new armes(1, "feuille");
    // armes ciseaux = new armes(2, "ciseaux");
    // armes lezard = new armes(3, "lezard");
    // armes spok = new armes(4, "spok");
    int scoreJ1, scoreJ2, matchnul, manche, maxManche = 0;
    int J1, J2;

    public Chifumi(int maxManche){
        this.maxManche = maxManche;

    }
    
    //Jeu classique du Chifumi
    public void jouerClassique(int J1, int J2){
        //pierre>ciseaux, feuille > pierre, ciseaux > feuille
        if(J1 == 0 && J2 == 2 || J1 == 1 && J2 == 0 || J1 == 2 && J2 == 1) {
            System.out.println("Joueur 1 a joué " + J1 + ", joueur 2 a joué " + J2 + ", joueur 1 a gagné !");
            scoreJ1++;
            System.out.println("Le score est de : joueur 1  "+ scoreJ1 + ", joueur 2 : " + scoreJ2 + ", match nul : " + matchnul);
        }
        else if(J1 == J2){
            System.out.println("Match nul ! ");
            matchnul++;
            System.out.println("Le score est de : joueur 1  "+ scoreJ1 + ", joueur 2 : " + scoreJ2 + ", match nul : " + matchnul);
        }
        else {
            System.out.println("Joueur 1 a joué " + J1 + ", joueur 2 a joué " + J2 + ", joueur 2 a gagné ! ");
            scoreJ2++;
            System.out.println("Le score est de : joueur 1  "+ scoreJ1 + ", joueur 2 : " + scoreJ2 + ", match nul : " + matchnul);
        }
        manche++;
    }

    // public void jouerBigBangTheorie(int J1, int J2){
    //     //pierre>ciseaux, feuille > pierre, ciseaux > feuille, papier>lézard, lézard>spock, spock>ciseaux, 
    //     //ciseaux>lézard, lézard>feuille, papier>spock, spock>pierre 
    //     if(J1 == pierre.point && J2 == ciseaux.point || J1 == feuille.point && J2 == pierre.point || J1 == ciseaux.point && J2 == feuille.point
    //         || J1 == feuille.point && J2 == lezard.point || J1 == lezard.point && J2 == spok.point || J1 == spok.point && J2 == ciseaux.point
    //         || J1 == ciseaux.point && J2 == lezard.point || J1 == lezard.point && J2 == feuille.point || J1 == feuille.point && J2 == spok.point 
    //         || J1 == spok.point && J2 == pierre.point){
    //             System.out.println("Joueur 1 a joué " + J1 + ", joueur 2 a joué " + J2 + ", joueur 1 a gagné !");
    //             scoreJ1++;
    //             System.out.println("Le score est de : joueur 1  "+ scoreJ1 + ", joueur 2 : " + scoreJ2 + ", match nul : " + matchnul);
    //     }
    //     else if(J1 == J2){
    //         System.out.println("Match nul ! ");
    //         matchnul++;
    //         System.out.println("Le score est de : joueur 1  "+ scoreJ1 + ", joueur 2 : " + scoreJ2 + ", match nul : " + matchnul);
    //     }
    //     else {
    //         System.out.println("Joueur 1 a joué " + J1 + ", joueur 2 a joué " + J2 + ", joueur 2 a gagné ! ");
    //         scoreJ2++;
    //         System.out.println("Le score est de : joueur 1  "+ scoreJ1 + ", joueur 2 : " + scoreJ2 + ", match nul : " + matchnul);
    //     }
    //     manche++;
    // }
    //méthode booléenne pour demander de continuer à jouer ou non.
    public boolean continuer(){
        return manche < maxManche; 
    }

    public void raz(){
        scoreJ1 = 0;
        scoreJ2 = 0; 
        matchnul = 0; 
        manche = 0; 
    }



}