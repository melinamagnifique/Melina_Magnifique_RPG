package RPG;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class Game {
    static Scanner scanner = new Scanner(System.in);
    private boolean isRunning = true;
    ArrayList<Hero> heroes = new ArrayList(); //Liste pour choisir le type de héros


    private void pressAnyKeyToContinue() { //Fonctions qui permet de cliquer sur une touche pour continuer
        System.out.println("Entrez n'importe quel lettre pour continuer");
        scanner.next();
    }


    public void start() {
        int nombrehero;
        int classehero;
        boolean verify;

        System.out.println("Bienvenue sur ce nouveau jeu d'aventure et de combats! ");
        pressAnyKeyToContinue();
        System.out.println("Pour commencer, choisissez le nombre d'héros que vous souhaitez avoir dans votre équipe. Attention ! Vous ne pouvez en avoir que 4 maximum !");
        nombrehero = scanner.nextInt();
        if (nombrehero < 1 | nombrehero > 4) {
            System.out.println("Erreur : choix invalide (1-4).");
            System.exit(0);
        } else {
            System.out.println("Vous avez choisi d'avoir " + nombrehero + " vous aurez donc " + nombrehero + " ennemis à affronter");
            System.out.println("Vous allez maintenant choisir la classe de vos héros, voici la description de leurs fonctions :");
            System.out.println("Hunter : \n" +
                    "-\tArmes : tire des flèches jusqu’à ne plus en avoir (10 flèches)\n" +
                    "-\tArmure :saut qui permet d'esquiver les coups de l'ennemi\n" +
                    "-\tPotion : boisson flèches (+5 flèches)\n");
            System.out.println("Warrior :\n" +
                    "-\tArme : frappe au corps à corps\n" +
                    "-\tArmure bouclier qui permet de se protéger de l'ennemi:\n" +
                    "-\tPotion : Potion frappe (+ 3 frappes)\n");
            System.out.println("Mage :\n" +
                    "-\tArme : Magie contre l’ennemi (Mana)\n" +
                    "-\tArmure : cape magique qui permet d'éviter les coups de l’ennemi\n" +
                    "-\tPotion : Restaure le mana\n");
            System.out.println("Healer :\n" +
                    "-\tArme : Soigne avec de la magie\n" +
                    "-\tArmure : aucune donc personnage vulnérable \n" +
                    "-\tPotion : Restaure le mana \n");



            for (int i = 1; i <= nombrehero; i++) {
                System.out.println("Choissisez le héros " + i + " : " +
                        "\n1) Hunter" +
                        "\n2) Warrior" +
                        "\n3) Mage" +
                        "\n4) Healer");
                classehero = scanner.nextInt();
                if (classehero < 1 | classehero > 4) {
                    System.out.println("Erreur : choix invalide (1-4).");
                } else {
                    switch (classehero) {
                        case (1) -> {
                            System.out.println("Votre héros " + i + " sera un hunter");
                            heroes.add(new Hero("hunter", 70, 10, 10));
                        }
                        case (2) -> {
                            System.out.println("Votre héros " + i + " sera un warrior");
                            heroes.add(new Hero("warrior", 60, 20, 10));
                        }
                        case (3) -> {
                            System.out.println("Votre héros " + i + " sera un mage");
                            heroes.add(new Hero("mage", 50, 10, 25));
                        }
                        case (4) -> {
                            System.out.println("Votre héros  " + i + " sera un healer");
                            heroes.add(new Hero("healer", 50, 15, 20));
                        }
                    }
                    System.out.println("Voici votre équipe de heros : ");
                    for (int a = 0 ; a < heroes.size() ; a++) {
                        System.out.println("\t" + heroes.get(a).getClasse() + "|" + heroes.get(a).getPv() + "/" + heroes.get(a).getPvmax() + "PV|" + " degats infligés: " + heroes.get(a).getDegat() + " points de degat |" + "Mana : " + heroes.get(a).getMana() + "/" + heroes.get(a).getManaMax() + "|");
                    }
                }
            }
        }
    }
    ArrayList<Enemy> ennemies = new ArrayList(); //Liste des ennemis
    public void equipeEnnemis(){
        for (int i = 0; i < heroes.size(); i++){
            ennemies.add(new Enemy(10,60,"sorcière"));
        }
        System.out.println("Tu vas devoir affronter ces ennemis !");
        for (int i = 0 ; i < ennemies.size(); i++){
            //int crntEnemy = i + 1;
            System.out.println( ennemies.get(i).getName() + "| " + ennemies.get(i).getPv() + "/" + ennemies.get(i).getPvmax() + "PV |");
        } //crntEnemy + ") " +
        int i = ennemies.size();
        Scanner numEnemies = new Scanner(System.in);
        System.out.println("Choisissez quel ennemi à affronter (1 à " + ennemies.size() + ")");
        int ennemy = numEnemies.nextInt();

    }
    public void combat() {
        int choixcombat;
        isRunning = true;
        System.out.println("Voici l'équipe d'ennemis que vous allez devoir affronter !");
        equipeEnnemis();
        System.out.println("Le combat va commencer ! ");
        while (isRunning = true) {
            System.out.println("Que souhaitez-vous faire ? " +
                    "\t1) Attaquer" +
                    "\t2) Défendre" +
                    "\t3) Boire une potion");
            choixcombat = scanner.nextInt();
            if (choixcombat < 1 | choixcombat>3){
                System.out.println("Erreur : choix invalide (1-3).");
            }else{
                switch (choixcombat) {
                    case (1):
                        System.out.println("Vous avez choisi d'attaquer ! ");
                        attaque();
                        break;
                    case (2):
                        System.out.println("Vous avez choisi de défendre !");
                        defense();
                        break;
                    case (3):
                        System.out.println("Vous avez choisi de prendre la potion !");
                        potion();
                        break;
                }
            }
        }
    }

    public void attaque() {
        if(!ennemies.isEmpty()) {
            System.out.println("Avec quel héros voulez-vous attaquer ? ");
            Scanner sc = new Scanner(System.in);
            int choixherosUtilisateur = sc.nextInt();
            int choixheros = choixherosUtilisateur - 1;
            System.out.println("Vous avez choisi d'attaquer avec le " + heroes.get(choixheros).getClasse() + " !");
            switch (heroes.get(choixheros).getClasse()) {
                case ("hunter"):
                    Hunter hunter = new Hunter(10,2);
                    hunter.setFleche(8);
                    System.out.println("Il ne vous reste que "+ hunter.getFleche()+ " flèches");
                    if(heroes.contains("hunter")){
                    }
                    break;
                case ("warrior"):
                    System.out.println("trucs du warrior");
                    break;
                case ("mage"):
                    System.out.println("trucs du mage");
                    break;
                case ("healer"):
                    System.out.println("trucs du healer");
                    break;

            }
        }
        if(heroes.isEmpty()) {
            System.out.println("Aucun de vos héros n'a survécu ! Vous avez perdu :( ");
            System.exit(0);
        }else{
            System.out.println("Vous avez vaincu tous vos ennemis ! Il est temps de passer au big boss...");
            CombatBigBoss();
    }


    }

    public void defense() {
        if (!ennemies.isEmpty()) {
            System.out.println("Avec quel héros voulez-vous défendre ? ");
            Scanner sc = new Scanner(System.in);
            int choixherosUtilisateurDefense = sc.nextInt();
            int choixherosD = choixherosUtilisateurDefense - 1;


        }
    }
    public void potion() {
        if(!ennemies.isEmpty()) {
            System.out.println("Quel héro doit prendre une potion ? ");
            Scanner sc = new Scanner(System.in);
            int choixherosUtilisateurPotion = sc.nextInt();
            int choixherosP = choixherosUtilisateurPotion - 1;
            System.out.println("Avez-vous déjà pris la potion pour ce héro ? (oui/non)  ");
            Scanner potion = new Scanner(System.in);
            String choixpotion = potion.nextLine();
            if(choixpotion.equals("oui")){
                System.out.println("Désolé vous ne pouvez prendre la potion qu'une seule fois");
            }else {
                System.out.println("Le " + heroes.get(choixherosP).getClasse() + " boit la potion et ses ressources sont boostées !");
                int indexchoix = choixherosUtilisateurPotion - 1;

            }
        }
    }
    public void CombatBigBoss() {

        System.out.println("Pour ce dernier combat, voici les derniers heros de votre équipe : ");
        for (int a = 0; a < heroes.size(); a++) {
            System.out.println("\t" + heroes.get(a).getClasse() + "|" + heroes.get(a).getPv() + "/" + heroes.get(a).getPvmax() + "PV|" + " degats infligés: " + heroes.get(a).getDegat() + " points de degat |" + "Mana : " + heroes.get(a).getMana() + "/" + heroes.get(a).getManaMax() + "|");
        Boss Boss = new Boss(100,20,"Roi des sorciers");
        String NomBoss = Boss.getName();
        System.out.println("Vous allez devoir affronter...");
        System.out.println( Boss.getName() + "| " + Boss.getPvB() + "/" + Boss.getPvmaxB() + "PV |" + "degats infligés: " + Boss.getDegatB() + "| \nBONNE CHANCE !");

        }
    }
}
//Mon principal problème lors de la création de ce projet était l'utilisation des getters et des setters
// C'est la raison pour laquelle je n'ai pas réussi à finir les combats. Je n'ai pas réussi à changer les valeurs des caractéristiques de chaque héros au cours de la partie