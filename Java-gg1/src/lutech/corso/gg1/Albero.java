package lutech.corso.gg1;

public abstract class Albero {
	
	private int numeroRami;
	private int numeroFoglie;
	
	public abstract void cresci();
	
	public int getNumeroRami() {
		return numeroRami;
	}
	public void setNumeroRami(int numeroRami) {
		this.numeroRami = numeroRami;
	}
	public int getNumeroFoglie() {
		return numeroFoglie;
	}
	public void setNumeroFoglie(int numeroFoglie) {
		this.numeroFoglie = numeroFoglie;
	}
	
	

}
