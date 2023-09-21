public class BouclesForEach {
    public static void main(String[] args) {
    //Creer un tableau
    int[] valeurs = {5,6,7,8,9,10};
    String[] eleves={"abc","def","ghi"};
    System.out.println(valeurs.length); 
    System.out.println(eleves.length);
    for (int v : valeurs) {
        System.out.println(v);}

    for (String eleve: eleves){
        System.out.println(eleve);
    }
    }    
    
    
}
