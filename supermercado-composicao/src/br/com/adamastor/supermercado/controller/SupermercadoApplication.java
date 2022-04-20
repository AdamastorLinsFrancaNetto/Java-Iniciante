package br.com.adamastor.supermercado.controller;

import java.util.Arrays;

import br.com.adamastor.supermercado.model.Produto;
import br.com.adamastor.supermercado.repository.CompraRepository;
import br.com.adamastor.supermercado.service.CompraService;
import br.com.adamastor.supermercado.service.HorarioService;

public class SupermercadoApplication {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Arroz", 5);
		Produto p2 = new Produto("Feijao", 10);
		Produto p3 = new Produto("Frango", 15);
				
		HorarioService dataHoraSextaSemDesconto = new HorarioService();
		dataHoraSextaSemDesconto.registrarDataHoraCompra(22, 4, 2022, 17, 0, 0);
		CompraService compraSextaSemDesconto = new CompraService(Arrays.asList(p1, p2, p3), dataHoraSextaSemDesconto);
		CompraRepository.compras.add(compraSextaSemDesconto);
		
		Produto p4 = new Produto("Macarrão", 20);
		Produto p5 = new Produto("Tomate", 25);
		Produto p6 = new Produto("Carne", 30);
		
		HorarioService dataHoraSextaComDesconto = new HorarioService();
		dataHoraSextaComDesconto.registrarDataHoraCompra(22, 4, 2022, 20, 0, 1);
		CompraService compraSextaComDesconto = new CompraService(Arrays.asList(p4, p5, p6), dataHoraSextaComDesconto);	
		CompraRepository.compras.add(compraSextaComDesconto);
		
		Produto p7 = new Produto("Creatina", 35);
		Produto p8 = new Produto("Beta alanina", 40);
		Produto p9 = new Produto("Whey protein", 45);
		
		HorarioService dataHoraSabado = new HorarioService();
		dataHoraSabado.registrarDataHoraCompra(23, 4, 2022, 17, 0, 0);
		CompraService compraSabado = new CompraService(Arrays.asList(p7, p8, p9), dataHoraSabado);
		CompraRepository.compras.add(compraSabado);

		
		
		
		

	}

}
