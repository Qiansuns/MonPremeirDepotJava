public class BouclesForEachPratique{
    public static void main(String[] args) {
        //calculer la somme du tableau
        int[] valeurs = {5,6,7,8,9,10};
        int somme = 0;
        for (int i=0; i< valeurs.length;i++){
            somme += valeurs[i];
        }
        System.out.println("La somme est : " + somme);
    }
}