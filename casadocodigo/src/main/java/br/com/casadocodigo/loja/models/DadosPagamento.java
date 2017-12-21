package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

public class DadosPagamento {

	private BigDecimal value; //TEM QUE SER VALUE, NOSSO APLICATIVO EXTERNO CONSOME VALUE.
	
	public BigDecimal getValue() {
		return value;
	}
	
	public DadosPagamento() {
		
	}

	public DadosPagamento(BigDecimal value) {
		this.value = value;
	}
	
	
	
}
