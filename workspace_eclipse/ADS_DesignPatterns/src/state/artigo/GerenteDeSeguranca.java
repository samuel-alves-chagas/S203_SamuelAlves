package state.artigo;

public class GerenteDeSeguranca {
	public static GerenteDeSeguranca instance;
	private String usuarioCorrente;
	
	private GerenteDeSeguranca() {}
	
	public static GerenteDeSeguranca getInstance() {
		if (instance == null) {
			instance = new GerenteDeSeguranca();
		}
		
		return instance;
	}
	
	public String getUsuarioCorrente() {
		return usuarioCorrente;
	}
	
	public void setUsuarioCorrente(String usuarioCorrente) {
		this.usuarioCorrente = usuarioCorrente;
	}
	
	public boolean isModerador() {
		return "MODERADOR".equals(usuarioCorrente);
	}
	
	public boolean isAutor() {
		return "AUTOR".equals(usuarioCorrente);
	}
}
