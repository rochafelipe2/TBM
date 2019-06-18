package com.test.GPS;

import java.util.ArrayList;

public class Cidade {

	private int Codigo;
	private String Nome;
	private ArrayList<Cidade> Cidades;
	private double Distancia;
	
	public Cidade(){
		
	}
	
	public Cidade(int codigo)
	{
		if(codigo == 12)
			iniciarCidadeCP();
	}
	
	public Cidade(int codigo, String nome, double distancia)
	{
		this.Nome = nome;
		this.Codigo = codigo;
		this.Distancia = distancia;
	}
	
	private void iniciarCidadeCP(){
		this.Codigo = 12;
		this.Nome = "Cornélio Procópio";
		this.Cidades = new ArrayList<Cidade>();
		this.Cidades.add(new Cidade(55, "Campinas",410));
		this.Cidades.add(new Cidade(1, "Londrina",70));
		this.Cidades.add(new Cidade(2, "Urai",23));
		this.Cidades.add(new Cidade(3, "Ourinhos",100));
		this.Cidades.add(new Cidade(4, "Curitiba",450));
	}
	
	public double verificarDistancia(int codigo) throws Exception
	{
		if(this.Cidades.get(codigo) == null)
			throw new Exception("Erro cidade não encontrada.");
		
		return this.Cidades.get(codigo).Distancia;
		
		
	}
}
