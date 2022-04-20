package br.com.adamastor.supermercado.service;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

import br.com.adamastor.supermercado.model.Produto;

public class CompraService {
	
	private static Integer id = 0;
	private List<Produto> produtos = new ArrayList<>();
	private Double totalDaCompra = 0.0;
	private Double totalDesconto = 0.0;

	public CompraService(List<Produto> produtos, HorarioService horarioService) {
		id += 1;
		this.produtos = produtos;
		
		apresentacaoCompra(horarioService);
		
		if(horarioService.getHoraFormatoBrasileiro() >= 20
				|| horarioService.getDataHora().getDayOfWeek() == DayOfWeek.SATURDAY 
				|| horarioService.getDataHora().getDayOfWeek() == DayOfWeek.SUNDAY) {
			
			System.out.println("- GANHOU DESCONTOS !!!\n");
			
			this.produtos.forEach(produto -> {
				System.out.print(produto);
				totalDaCompra += produto.getPreco();
				double valorDoDesconto = produto.getPreco() * .10;
				totalDesconto += valorDoDesconto;
				System.out.printf(" - R$ %.2f = R$ ", valorDoDesconto);
				produto.setPreco(produto.getPreco() - valorDoDesconto);
				System.out.printf("%.2f%n", produto.getPreco());
				
			});
		} else {
			this.produtos.forEach(produto -> {
				System.out.println(produto);
				totalDaCompra += produto.getPreco();
			});
		}
		System.out.printf("%n- TOTAL DA COMPRA: R$ %.2f%n", totalDaCompra);
		System.out.printf("- DESCONTO: R$ %.2f%n", totalDesconto);
		System.out.printf("- TOTAL COM DESCONTO: R$ %.2f%n", totalDaCompra - totalDesconto);
		System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
	}
	
	public void apresentacaoCompra(HorarioService horarioService) {
		System.out.println("- COMPRA Nº " + id);
		System.out.println("- HORÁRIO: " + horarioService.getDataHoraFormatoBrasileiro());
		System.out.println("- DIA DA SEMANA: " + horarioService.getDiaDaSemana() + "\n");
	}

}
