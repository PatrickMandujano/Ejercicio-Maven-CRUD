package org.cibertec.app;

import java.util.List;

import org.cibertec.controlador.TipoUsuarioJpaController;
import org.cibertec.controlador.UsuarioJpaController;
import org.cibertec.model.Usuario;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public class Demo05 {

	public static void main(String[] args) {
		UsuarioJpaController jpaUsuario=new UsuarioJpaController();
		TipoUsuarioJpaController jpaTipoUsuario=new TipoUsuarioJpaController();
		
		List<Usuario> lista=jpaUsuario.findAll();
		System.out.println("Listado de usuarios");
		
		for(Usuario item:lista) {
			System.out.println("Codigo: " + item.getCodUsua());
			System.out.println("Nombre: " + item.getNomUsua());
			
			System.out.println("Tipo: " + String.valueOf(item.getIdTipo())+"-"
			+ String.valueOf(jpaTipoUsuario.buscarById(item.getIdTipo()).getDescripcion()));
			
			System.out.println("-------------------------------");
		}
	}
}
