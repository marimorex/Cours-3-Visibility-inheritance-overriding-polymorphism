
public class Personne {
  private String nom;
  private String prenom;
  private int age;

  public Personne(String nomPersonne, String prenomPersonne, int agePersonne){
    setNom(nomPersonne);
    setPrenom(prenomPersonne);
    setAge(agePersonne);
  }

  public String printing(){
    String output = "Nom: "+nom+", Prenom:"+prenom+ ", Age:" +age;
    return output; 
  }

  public void setNom(String nomPersonne){
    nom = nomPersonne;
  }

  public void setPrenom(String prenomPersonne){
    prenom = prenomPersonne;
  }

  public void setAge(int agePersonne){
    if(agePersonne > 0 && agePersonne < 100) age = agePersonne;
    else age = 0;
  }
  
  // Overriding methods (toString method from java.lang.Object)

   public String toString(){
    String output = "Nom: "+nom+", Prenom:"+prenom+ ", Age:" +age;
    return output; 
  }
}