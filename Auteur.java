
public class Auteur{
    
    private String nom;
    private String citationTragedie;
    private int qualiteTragedie;    
    private String citationComedie;
    private int qualiteComedie; 
    private String citationDrame;
    private int qualiteDrame;


    public Auteur(String nom, int qualiteTragedie, String citationTragedie, int qualiteComedie, String citationComedie, int qualiteDrame, String citationDrame){
        this.qualiteTragedie = qualiteTragedie;
        this.citationTragedie = citationTragedie;
        this.qualiteComedie = qualiteComedie;
        this.citationComedie = citationComedie;
        this.qualiteDrame = qualiteDrame;
        this.citationDrame = citationDrame;
        this.nom=nom;

    }    

    public int getQualiteTragedie(){
        return this.qualiteTragedie;
    }
    
    public int getQualiteComedie(){
        return this.qualiteComedie;
    }
    
    public int getQualiteDrame(){
        return this.qualiteDrame;
    }
    
    public String getCitationDrame(){
        return this.citationDrame;
    }
    
    public String getCitationComedie(){
        return this.citationComedie;
    }
    
    public String getCitationTragedie(){
        return this.citationTragedie;
    }
    public String nom(){
        return this.nom;
    }

    @Override 
    public String toString(){
        String debut = "L'honorable : ";
        return debut.concat(this.nom);
    }
}