package br.univel.meustestes;

import java.math.BigDecimal;

import br.univel.minhaarvore.UniArvore;
import br.univel.minhaarvore.UniArvoreImpl;
import br.univel.minhaarvore.UniNode;
import br.univel.minhaarvore.UniNodeImpl;

public class Principal {

	public Principal(){
		Conta contaAgua = new Conta(1, "Água", new BigDecimal("98.50"));
		UniNode<Conta> noAgua = new UniNodeImpl<>(contaAgua);
		
		Conta contaAluguel = new Conta(2, "Aluguel", new BigDecimal("320,99"));
		UniNode<Conta> noAlu = new UniNodeImpl<>(contaAluguel);
		
		Conta contaIntTel = new Conta(3, "Internet e Telefone", new BigDecimal("249,99"));
		UniNode<Conta> noIntTel = new UniNodeImpl<>(contaIntTel);
		
		Conta contaEnElet = new Conta(4, "Energia Elétrica", new BigDecimal("349,99"));
		UniNode<Conta> noEnElet = new UniNodeImpl<>(contaEnElet);
		
		Conta despesasAdm = new Conta(1, "Despesas Administrativas", new BigDecimal("0"));
		UniNode<Conta> noDeAdm = new UniNodeImpl<>(despesasAdm);
		noDeAdm.addFilhos(noAgua);
		noDeAdm.addFilhos(noAlu);
		noDeAdm.addFilhos(noIntTel);
		noDeAdm.addFilhos(noEnElet);
		
		Conta despesasOper = new Conta(1, "Despesas Operacionais", new BigDecimal("0"));
		UniNode<Conta> noDeOpr = new UniNodeImpl<>(despesasOper);
		noDeOpr.addFilhos(noDeAdm);
		
		UniArvore<Conta> planoContas = new UniArvoreImpl(noDeOpr);
	}
	public static void main(String[] args) {
		new Principal();
	}

}
