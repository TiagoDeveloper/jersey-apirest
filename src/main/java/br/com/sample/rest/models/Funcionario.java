package br.com.sample.rest.models;

import java.util.Date;

public class Funcionario {
	
	private Long id;
	private String nome;
	private Long cidade;
	private Date date;
	
	public Funcionario(Long id, String nome, Long cidade, Date date) {
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.date = date;
	}
	public Funcionario() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCidade() {
		return cidade;
	}
	public void setCidade(Long cidade) {
		this.cidade = cidade;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", date=" + date + "]";
	}
	
}
