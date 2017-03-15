package lutech.corso.gg1;

public class Abete extends Albero {

	protected boolean addobbatoPerNatale;

	@Override
	public void cresci() {
		setNumeroFoglie(getNumeroFoglie() * 2); 
		
	}
	
}
