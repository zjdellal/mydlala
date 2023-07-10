package com.dlalacore.dlala.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "utilisateurs")
public class Utilisateur {
	@Column(name="id_utilisateur")
	private @Id @GeneratedValue Integer	id;

	@Column(name = "nom_utilisateur")
	private String										nom_utilisateur;

	@Column(name = "prenom_utilisateur")
	private String										prenom_utilisateur;

	@Column(name = "courriel_utilisateur")
	
	private String										courriel_utilisateur;

	@Column(name = "password_utilisateur")
	private String										password_utilisateur;

	public Utilisateur() {
		
	}

	public Integer getId() {
		return id;
	}

	public String getNom_utilisateur() {
		return nom_utilisateur;
	}

	public String getPrenom_utilisateur() {
		return prenom_utilisateur;
	}

	public String getCourriel_utilisateur() {
		return courriel_utilisateur;
	}

	public String getPassword_utilisateur() {
		return password_utilisateur;
	}
	
	
}
