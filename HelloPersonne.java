public class HelloPersonne{

  public static void main(String[] args) {
   Personne personne = new Personne(args[0], args[1], -5);
   System.out.println("Hello Personne " + personne);

   Etudiant etudiant = new Etudiant("Perez", "Juan", 30, 15.0f);
   System.out.println("Hello Personne " + etudiant);

  }

}