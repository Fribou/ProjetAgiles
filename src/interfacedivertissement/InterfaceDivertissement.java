/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedivertissement;

/**
 *
 * @author davy
 */
public class InterfaceDivertissement {

    /**
     * @param args the command line arguments
     */
    public static int progression;
    public static String question1="Mme Olivesi s'occupe de la gestion des stages ?";
    public static String question2="Il y a quatres semestres au cours du DUT informatique ?";
    public static String question3="c'est au semestre 2 que nous avons vu le chapitre s'intitilant 'continuité' ?";
    public static String question4="le numéro du batiment informatique est le 3";
    public static String question5="Si nous avons déjà redoublée 2 fois au cours du DUT, et qu'arrivé au S4 vous ne trouvez pas de stage, vous êtes viré ?";
    public static String question6="Le département informatique est ouvert le week-end ?"; 
    public static String question7="Au sein du BDE, il y a 2 machine à café, un distributeur de confiserie et des canapés ?";
    public static String question8="Il est formellement interdit de manger dans les salles informatiques, sauf pour les barres chocolatés ?";
    public static String question9="Le président du BDE est alexandre GOUNON";
    public static String question10="Le cours de théatre et d'écriture ont été réalisés par le même professeur ?";
    public static String rep1="faux";
    public static String rep2="vrai";
    public static String rep3="vrai";
    public static String rep4="faux";
    public static String rep5="vrai";
    public static String rep6="faux"; 
    public static String rep7="faux";
    public static String rep8="faux";
    public static String rep9="faux";
    public static String rep10="faux";
    public static String question11="En ouvrant VMware Workstation, puis unbuntu, le mot de passe est iutAinfo ?";
    public static String question12="La plus grande salle du département informatique est la s26 ?";
    public static String question13="pour afficher un message dans la console en C est <System.out.print>?";
    public static String question14="l'amphithéatre le plus proche du département informatique est le 2 ?";
    public static String question15="Android studio est plus lourd que netBeans et SQL developper reunis ?";
    public static String question16="Si on parle de maillon, on parle de liste chainée ?"; 
    public static String question17="Le prix d'une gauffre au distributeur est de 90cts ?";
    public static String question18="Il y a exactement 65 enseignants au departement informatique ?";
    public static String question19="Il y a qu'une seul salle pour faire du réseau ?";
    public static String question20="La matrice identité est une matrice où contenant que des 1 ?";
    public static String question21="Pour compiler un fichier sous linux, la commande est : gcc -o NomFichier NomExecutable ?";
    public static String question22="Il y 4 clubs au sein du bde ?";
    public static String question23="$_POST et $_GET sont la même chose ?";
    public static String question24="Il y a que 3 cours qui se réalisent dans le batiment GEA ?";
    public static String question25="Nous avons droit qu'a 5 absences injustifié ?";
    public static String rep11="faux";
    public static String rep12="vrai";
    public static String rep13="faux";
    public static String rep14="faux";
    public static String rep15="vrai";
    public static String rep16="vrai"; 
    public static String rep17="faux";
    public static String rep18="faux";
    public static String rep19="vrai";
    public static String rep20="faux";
    public static String rep21="faux";
    public static String rep22="vrai";
    public static String rep23="faux";
    public static String rep24="vrai";
    public static String rep25="vrai";
    
    
    
    
    
    
    public static boolean act2=false;
    public static boolean act3=false;
    

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    public static int choixHasard(){
        int petit = 1;
        int haut = 11;

        int random = (int)(Math.random() * (haut-petit)) + petit;


    return random;
}
    
    public static int choixHasard2(){
        int petit = 1;
        int haut = 16;

        int random = (int)(Math.random() * (haut-petit)) + petit;


    return random;
}
     public static int choixHasard3(){
        int petit = 1;
        int haut = 18;

        int random = (int)(Math.random() * (haut-petit)) + petit;


    return random;
}
}
