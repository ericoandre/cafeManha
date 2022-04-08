package com.cafeManha.cafeManha.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "colaborador_alimento")
public class Colaborador {
    @Id
    @GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID  id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;

    @Column(name = "alimento", unique = true, nullable = false)
    private String alimento;

	public Colaborador() {}
	
	public Colaborador(String nome, String cpf, String alimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.alimento = alimento;
	}

    public UUID getId() {
		return this.id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	public String getAlimento() {
		return this.alimento;
	}
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", cpf=" + getCpf() + ", nome=" + getNome() + ", Alimento=" + getAlimento()+ "]";
	}
}