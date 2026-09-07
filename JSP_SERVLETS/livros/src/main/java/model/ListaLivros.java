package model;

import java.util.ArrayList;
import java.util.List;

public class ListaLivros {

	private static ListaLivros instance;

	private List<Livro> listaLivros;

	private ListaLivros() {
		this.listaLivros = new ArrayList<Livro>();
	}

	public synchronized static ListaLivros getInstance() {
		if (instance == null) {
			instance = new ListaLivros();
		}
		return instance;
	}

	public List<Livro> getListaLivros() {
		return this.listaLivros;
	}

	public void addLivro(Livro livro) {
		this.listaLivros.add(livro);
	}

}
