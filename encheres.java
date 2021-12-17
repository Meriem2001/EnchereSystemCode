package mini_projet1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class encheres {
	private static final AtomicInteger ID_FACTORY = new AtomicInteger();
	private int Id;
	private String description ;
	private float prix ;
	private int heure;
	private int Etat;
    public static List<membre_enchere>membres =new ArrayList<membre_enchere>();
    public static List<offre_membre>offres1 =new ArrayList<offre_membre>();

		public encheres (float prix1,int heure1,String description1)
	{description=description1;
	prix=prix1;
	heure=heure1;
	Id=ID_FACTORY.getAndIncrement();
	}

	  public void addmembre(membre_enchere m){

	        encheres.membres.add(m);

	    }
	  public boolean checkmembre (membre_enchere m){

	        for(membre_enchere m1: membres){

	            if(m1==m){

	                return true;

	            }

	        }

	        return false;

	    }
	  public  boolean checkoffre (float offre, int a ){
		  
	        for(offre_membre o:offres1){
	        	if(o.Getenchere().GetId()==a) {
	       if(o.Getprix()>=offre) {

	    	   return true;
	           
	       

	       } }}
			return false;}
	
	public int GetId () {

		return(Id);
	}
	public String Getdescription () {
		return(description);
	}
	public float Getprix () {

		return(prix);
	}	
	public int Getheure () {

		return(heure);
	}	
	public int GetEtat () {

		return(Etat);
	}
	public void SetId (int id1) {
		do 
			this.Id=id1;
		while(id1>Id);

	}
	public void Setdescription (String description) {
		 
			this.description=description;}
	public void Setprix (float prix) {
		 
		this.prix=prix;}
	public void Setheure(int heure) {
		 
		this.heure=heure;}
	public void SetEtat (int Etat) {
		 
		this.Etat=Etat;}
	
	public  String listoffres() {
	     String m="";
	     for(offre_membre e:offres1)  { 
	    	 if(e.Getenchere().GetId()==Id) {
	    	encheres e2=e.Getenchere();
			m +="l'offre ="+ e.Getprix()+"pour l'enchere "+e2.GetId()+"proposee par "+e.Getmembre().GetName()+"\n";
	     }}return m;}
	public  void addoffre (offre_membre m){

    	offres1.add(m);

    }
	

}
