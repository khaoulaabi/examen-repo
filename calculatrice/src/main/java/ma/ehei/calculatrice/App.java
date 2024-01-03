package ma.ehei.calculatrice;

public class App {
	public static void main(String[] args) {
		System.out.println(Calculatrice.add(5, 5));

		 // Appels à la fonction d'addition
        int resultat1 = calculatrice.add(5, 3);
        System.out.println("Resultat de l addition : " + resultat1);

		int resultat2 = calculatrice.additionner(3, 4);
        System.out.println("Resultat de l addition: " + resultat2);
		
	}
}
