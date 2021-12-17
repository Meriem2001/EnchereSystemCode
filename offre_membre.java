package mini_projet1;

public class offre_membre {
	private membre_enchere m;
	private encheres e;
	private float prix;
	public offre_membre(membre_enchere m1,encheres e1,float prix1) {
		prix=prix1;
		e=e1;
		this.m=m1;		
	}
	public membre_enchere Getmembre () {

		return(m);
	}
	public encheres Getenchere () {
		return(e);
	}
	public float Getprix () {
		return(prix);

	}
	public void Setprix (float p) {
		this.prix=p;

	}
	

}
