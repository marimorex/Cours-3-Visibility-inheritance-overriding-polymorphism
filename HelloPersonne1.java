public class HelloPersonne1{

  public static void main(String[] args) {
   Personne personne = new Personne("Dupont", "Jean", -5);
   System.out.println("Hello Personne " + personne);

   personne = new Etudiant("Perez", "Juan", 30, 15.0f);
   System.out.println("Hello Personne " + personne);

  }

}