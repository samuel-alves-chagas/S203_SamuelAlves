package state.artigo;

import static org.junit.Assert.*;

import org.junit.Test;


public class ArtigoTest {

	@Test
	public void deveArtigoTransitarRascunhoAteAprovado () {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		// 1. Rascunho -> Revisando
		seguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		
		seguranca.setUsuarioCorrente("MODERADOR");
		artigo.reprovar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
	}

}
