package br.univel.minhaarvore;

public class UniArvoreImpl<T> implements UniArvore<T> {
	private T raiz;

	public UniArvoreImpl(T noRaiz) {
		this.raiz = noRaiz;
	}

	@Override
	public T getRaiz() {
		return raiz;
	}

}
