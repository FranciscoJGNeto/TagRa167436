package br.univel.meustestes;

import java.math.BigDecimal;
import java.util.List;

import br.univel.minhaarvore.UniArvore;
import br.univel.minhaarvore.UniArvoreImpl;
import br.univel.minhaarvore.UniNode;
import br.univel.minhaarvore.UniNodeImpl;

public class Principal {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Principal() {
		
		/*--------------------------------------------------------------------------------------------------------
		 *------------------------------------------------↓↓↓
		 * 01.01		Despesas Administrativas.
		 * 	01.01.01		Água.
		 * 	01.01.02		Aluguel.
		 * 	01.01.03		Internet e Telefone.
		 * 	01.01.04		Energia Elétrica.
		 *------------------------------------------------↓↓↓
		 *--------------------------------------------------------------------------------------------------------*/

		Conta contaAgua = new Conta(1, "Água", new BigDecimal("98.50"));
		UniNode<Conta> noAgua = new UniNodeImpl<>(contaAgua);
		
		Conta contaAluguel = new Conta(2, "Aluguel", new BigDecimal("320.99"));
		UniNode<Conta> noAlu = new UniNodeImpl<>(contaAluguel);
		
		Conta contaIntTel = new Conta(3, "Internet e Telefone", new BigDecimal("249.99"));
		UniNode<Conta> noIntTel = new UniNodeImpl<>(contaIntTel);
		
		Conta contaEnElet = new Conta(4, "Energia Elétrica", new BigDecimal("349.99"));
		UniNode<Conta> noEnElet = new UniNodeImpl<>(contaEnElet);
		
		
		Conta despesasAdm = new Conta(1, "Despesas Administrativas", new BigDecimal(0));
		UniNode<Conta> noDeAdm = new UniNodeImpl<>(despesasAdm);
		noDeAdm.addFilho(noAgua);
		noDeAdm.addFilho(noAlu);
		noDeAdm.addFilho(noIntTel);
		noDeAdm.addFilho(noEnElet);
		
		/*--------------------------------------------------------------------------------------------------------
		 *------------------------------------------------↓↓↓
		 * 01.02		Gastos com Pessoal.
		 * 	01.02.01		Benefícios.
		 * 	01.02.02		Encargos.
		 * 	01.02.03		Salários.
		 *------------------------------------------------↓↓↓
		 *--------------------------------------------------------------------------------------------------------*/
		
		Conta contaBenef = new Conta(1, "Benefícios", new BigDecimal("2001.28"));
		UniNode<Conta> noBenef = new UniNodeImpl<>(contaBenef);
		
		Conta contaEncar = new Conta(2, "Encargos", new BigDecimal("9000.00"));
		UniNode<Conta> noEncar = new UniNodeImpl<>(contaEncar);
		
		Conta contaSalar = new Conta(3, "Salários", new BigDecimal("16535.35"));
		UniNode<Conta> noSalar = new UniNodeImpl<>(contaSalar);

		Conta gastosCPessoal = new Conta(2, "Gastos com Pessoal", new BigDecimal(0));
		UniNode<Conta> noGasCPessoal = new UniNodeImpl<>(gastosCPessoal);
		noGasCPessoal.addFilho(noBenef);
		noGasCPessoal.addFilho(noEncar);
		noGasCPessoal.addFilho(noSalar);
		
		/*--------------------------------------------------------------------------------------------------------
		 *------------------------------------------------↓↓↓
		 * 01.03		Manutenção e Limpeza.
		 * 	01.03.01		Serviços de Limpeza.
		 * 	01.03.02		Serviços de Manutenção.
		 *------------------------------------------------↓↓↓
		 *--------------------------------------------------------------------------------------------------------*/

		Conta contaServLimp = new Conta(1, "Serviços de Limpeza", new BigDecimal("1000.28"));
		UniNode<Conta> noServLimp = new UniNodeImpl<>(contaServLimp);
		
		Conta contaServManut = new Conta(2, "Serviços de Manutenção", new BigDecimal("9000.00"));
		UniNode<Conta> noServManut = new UniNodeImpl<>(contaServManut);
		
		Conta ManutLimp = new Conta(3, "Manutenção e Limpeza", new BigDecimal(0));
		UniNode<Conta> noManutLimp = new UniNodeImpl<>(ManutLimp);
		noManutLimp.addFilho(noServLimp);
		noManutLimp.addFilho(noServManut);
		
		/*--------------------------------------------------------------------------------------------------------
		 *------------------------------------------------↓↓↓
		 * 01.04		Materiais.
		 * 	01.04.01		Materiais de Escritório.
		 * 	01.04.02		Materiais de Limpeza.
		 *------------------------------------------------↓↓↓
		 *--------------------------------------------------------------------------------------------------------*/

		Conta contaMatEscri = new Conta(1, "Materiais de Escritório", new BigDecimal("300.00"));
		UniNode<Conta> noMatEscri = new UniNodeImpl<>(contaMatEscri);
		
		Conta contaMatLimp = new Conta(2, "Materiais de Limpeza", new BigDecimal("900.00"));
		UniNode<Conta> noMatLimp = new UniNodeImpl<>(contaMatLimp);
		
		Conta Materiais = new Conta(4, "Materiais", new BigDecimal(0));
		UniNode<Conta> noMateriais = new UniNodeImpl<>(Materiais);
		noMateriais.addFilho(noMatEscri);
		noMateriais.addFilho(noMatLimp);
		
		
		/*--------------------------------------------------------------------------------------------------------
		 *------------------------------------------------↓↓↓
		 * 01			Despesas Operacionais
		 * 	01.01			Despesas Administrativas
		 * 		01.01.01		Água
		 * 		01.01.02		Aluguel
		 * 		01.01.03		Internet e Telefone
		 * 		01.01.04		Energia Elétrica
		 * 	01.02			Gastos com Pessoal
		 * 		01.02.01		Benefícios
		 * 		01.02.02		Encargos
		 * 		01.02.03		Salários
		 * 	01.03			Manutenção e Limpeza
		 * 		01.03.01		Serviços de Limpeza
		 * 		01.03.02		Serviços de Manutenção
		 * 	01.04			Materiais
		 * 		01.04.01		Materiais de Escritório
		 * 		01.04.02		Materiais de Limpeza
		 *------------------------------------------------↓↓↓
		 * --------------------------------------------------------------------------------------------------------*/

		Conta despesasOper = new Conta(1, "Despesas Operacionais", new BigDecimal(0));
		UniNode<Conta> noDeOpr = new UniNodeImpl<>(despesasOper);
		noDeOpr.addFilho(noDeAdm);
		noDeOpr.addFilho(noGasCPessoal);
		noDeOpr.addFilho(noManutLimp);
		noDeOpr.addFilho(noMateriais);
		
		/*--------------------------------------------------------------------------------------------------------
		 * Criação da Árvore	↓↓↓
		 *--------------------------------------------------------------------------------------------------------*/
		
		UniArvore<UniNode<Conta>> planoContas = new UniArvoreImpl(noDeOpr);
		
		/*--------------------------------------------------------------------------------------------------------
		 * Soma os Filhos 	↓↓↓
		 *--------------------------------------------------------------------------------------------------------*/
		
		somarFilhos(planoContas.getRaiz());
		
		/*--------------------------------------------------------------------------------------------------------
		 * Imprime no Console	↓↓↓
		 *--------------------------------------------------------------------------------------------------------*/
		
		/*Linha*/for (int i = 0; i < 65; i++) {System.out.print("-");}System.out.println("\n		Plano de Contas - Arvore");for (int i = 0; i < 65; i++) {System.out.print("-");if(i == 64){System.out.print("\n");}};
		mostrarTodosNoConsole(planoContas.getRaiz(), "- ");
		/*Linha*/for (int i = 0; i < 65; i++) {System.out.print("-");}
		System.out.println("\nTotal: R$" + planoContas.getRaiz().getConteudo().getValor());
		/*Linha*/for (int i = 0; i < 65; i++) {System.out.print("-");}System.out.println("\nNome: Francicso Julio Guimarães Neto\tRA: 16.7436");
		
		/*--------------------------------------------------------------------------------------------------------*/
	}
	/*--------------------------------------------------------------------------------------------------------
	 * Anda pela árvore e reúne as folhas	↓↓↓
	 *--------------------------------------------------------------------------------------------------------*/
	private void somarFilhos(UniNode<Conta> noRaiz) {
		List<UniNode<Conta>> filhos = noRaiz.getFilhos();
		
		for(int i = 0; i < filhos.size(); i++){
        	if(filhos.get(i).isLeaf()){
        		noRaiz.getConteudo().setValor(
        				noRaiz.getConteudo().getValor().add(
        						filhos.get(i).getConteudo().getValor()));
        	}
        	else{
        		somarFilhos(filhos.get(i));
        		noRaiz.getConteudo().setValor(
        				noRaiz.getConteudo().getValor().add(
        						filhos.get(i).getConteudo().getValor()));   
        	}
        }
	}
	
	/*--------------------------------------------------------------------------------------------------------
	 * Anda pela árvore e imprime as folhas	↓↓↓
	 *--------------------------------------------------------------------------------------------------------*/
	public void mostrarTodosNoConsole(UniNode<Conta> noRaiz, String tab){
		List<UniNode<Conta>> kodomo = noRaiz.getFilhos();
		
		if(noRaiz.isLeaf()){
			System.out.println(tab.split("-")[0] + tab.split("-")[1] +
					String.format("%02d", noRaiz.getConteudo().getId()) + "\t\t" + 
					tab.split("-")[0] + noRaiz.getConteudo().getNome() +
					" |\tR$ " + noRaiz.getConteudo().getValor());
		} else {
			System.out.println(tab.split("-")[0] + tab.split("-")[1] +
					String.format("%02d", noRaiz.getConteudo().getId()) + "\t\t" + 
					tab.split("-")[0] + noRaiz.getConteudo().getNome());
			tab = "   " + tab + String.format("%02d", noRaiz.getConteudo().getId()) + ".";
			for(int i = 0; i < kodomo.size(); i++){	
				mostrarTodosNoConsole(kodomo.get(i), tab);
			}
		}
	}
	public static void main(String[] args) {
		new Principal();
		/* O exercício consiste em identificar a necessidade de
		 * novos métodos para finalizar a tarefa, sempre lembrando
		 * de coesão, acoplamento e encapsulamento.
		 * Entrega link do repositório para fernandod@univel.br com assunto:
		 * TrabalhoComplementar 3o Sem 
		 */
	}
}