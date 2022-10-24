package state.artigo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Artigo {
	
	private String estado;
	
	private List<String> logHistorico = new ArrayList<>();
	
	public Artigo () {
		this.estado = "RASCUNHO";
	}
	
	public void publicar() {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			if(seguranca.isAutor()) {
				this.estado = "REVISANDO";
				this.logHistorico.add("Tansitado para REVISANDO em + " + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissão para publicar");
			}
		}
		
		if("REVISANDO".equals(this.estado)) {
			if(seguranca.isModerador()) {
				this.estado = "APROVADO";
				this.logHistorico.add("Tansitado para APROVADO em + " + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissão para publicar");
			}
		}
		
		
		if("APROVADO".equals(this.estado)) {
			return;
		}
	}
	
	public void reprovar() {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			return;
		}
		
		if("REVISANDO".equals(this.estado)) {
			if(seguranca.isModerador()) {
				this.estado = "RASCUNHO";
				this.logHistorico.add("Tansitado para RASCUNHO em + " + LocalDate.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissão para reprovar");
			}
		}
		
		
		if("APROVADO".equals(this.estado)) {
			return;
		}
	}
	
	public String getEstado() {
		return estado;
	}
	
	public List<String> getLogHistorico(){
		return logHistorico;
	}
	
}
