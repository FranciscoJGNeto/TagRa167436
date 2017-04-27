package br.univel.minhaarvore;

import java.util.ArrayList;
import java.util.List;

public class UniNodeImpl<T> implements UniNode<T> {
	private UniNodeImpl<T> pai;
	private List<UniNode<T>> filhos;
	private T conteudo;
	
	public UniNodeImpl(T t){
		this.conteudo = t;
	}
	
	@Override
	public UniNodeImpl<T> getPai() {
		return pai;
	}

	@Override
	public List<UniNode<T>> getFilhos() {
		return filhos;
	}

	@Override
	public void addFilhos(UniNode<T> node) {
		if(this.filhos == null){
			this.filhos = new ArrayList<>();
		}
		this.filhos.add(node);
	}

	@Override
	public boolean isLeaf() {
		return this.filhos == null;
	}

	@Override
	public T getConteudo() {
		return this.conteudo;
	}

}
