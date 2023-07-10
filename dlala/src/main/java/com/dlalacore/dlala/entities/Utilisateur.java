package com.dlalacore.dlala.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//utilisateurs_id_utilisateur_seq
@Entity
@Table(name = "utilisateurs")
public class Utilisateur {
	@Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_utilisateur")
  @SequenceGenerator(name = "id_utilisateur", 
      sequenceName = "utilisateurs_id_utilisateur_seq", schema = "public", allocationSize=1)
	@Column(name="id_utilisateur")
	private  Integer	id;

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
