package br.com.adamastor.supermercado.service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.com.adamastor.supermercado.exception.SupermercadoException;

public class HorarioService {

	private LocalDateTime dataHora;
	private int horaFormatoBrasileiro;

	public void registrarDataHoraCompra(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		if (dia < 1 || dia > 31) {
			throw new SupermercadoException("O dia informado deve ser entre 1 e 31 !");
		}
		if (mes < 1 || mes > 12) {
			throw new SupermercadoException("O mês informado deve ser entre 1 e 12 !");
		}
		if (ano != 2022) {
			throw new SupermercadoException("O ano informado deve ser o atual !");
		}
		if(hora < 0 || hora > 23) {
			throw new SupermercadoException("A hora informada deve ser entre 00 e 23");
		}
		if(minuto < 0 || minuto > 59) {
			throw new SupermercadoException("O minuto informado deve ser entre 00 e 59");
		}
		if(segundo < 0 || segundo > 59) {
			throw new SupermercadoException("O segundo informado deve ser entre 00 e 59");
		}
		
		String dataHoraFormatada = String.format("%02d/%02d/%02d %02d:%02d:%02d", dia, mes, ano, hora, minuto, segundo);		
		this.dataHora = LocalDateTime.parse(dataHoraFormatada, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		this.horaFormatoBrasileiro = hora;
	}
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	
	public int getHoraFormatoBrasileiro() {
		return horaFormatoBrasileiro;
	}
	
	public String getDataHoraFormatoBrasileiro() {
		return String.format("%02d/%02d/%02d %02d:%02d:%02d", dataHora.getDayOfMonth(), dataHora.getMonthValue(), dataHora.getYear(), dataHora.getHour(), dataHora.getMinute(), dataHora.getSecond());
	}

	
	public String getDiaDaSemana() {
		if(dataHora.getDayOfWeek() == DayOfWeek.MONDAY) {
			return "Segunda-feira";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.TUESDAY) {
			return "Terça-feira";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
			return "Quarta-feira";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.THURSDAY) {
			return "Quinta-feira";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.FRIDAY) {
			return "Sexta-feira";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.SATURDAY) {
			return "Sábado";
		}
		if(dataHora.getDayOfWeek() == DayOfWeek.SUNDAY) {
			return "Domingo";
		}
		return "";
	}
}
