package com.example.demo.model;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Id;

@Entity
@Table (name = "BRPRODUC")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Pro_IdProd")
	private Long Pro_IdProd;
	@Column(name = "Pro_Nombre")
	private String Pro_Nombre;
	@Column(name = "Pro_NumTra")
	private String Pro_NumTra;
	@Column(name = "Pro_Transa")
	private String Pro_Transa;
	@Column(name = "Pro_Usuari")
	private String Pro_Usuari;
	@Column(name = "Pro_FecSis")
	private String Pro_FecSis;
	@Column(name = "Pro_SucOri")
	private String Pro_SucOri;
	@Column(name = "Pro_SucDes")
	private String Pro_SucDes;
	
	
	
	public Productos() {
	}



	public Productos(Long pro_IdProd, String pro_Nombre, String pro_NumTra, String pro_Transa, String pro_Usuari,
			String pro_FecSis, String pro_SucOri, String pro_SucDes) {
		super();
		Pro_IdProd = pro_IdProd;
		Pro_Nombre = pro_Nombre;
		Pro_NumTra = pro_NumTra;
		Pro_Transa = pro_Transa;
		Pro_Usuari = pro_Usuari;
		Pro_FecSis = pro_FecSis;
		Pro_SucOri = pro_SucOri;
		Pro_SucDes = pro_SucDes;
	}



	public Long getPro_IdProd() {
		return Pro_IdProd;
	}



	public void setPro_IdProd(Long pro_IdProd) {
		Pro_IdProd = pro_IdProd;
	}



	public String getPro_Nombre() {
		return Pro_Nombre;
	}



	public void setPro_Nombre(String pro_Nombre) {
		Pro_Nombre = pro_Nombre;
	}



	public String getPro_NumTra() {
		return Pro_NumTra;
	}



	public void setPro_NumTra(String pro_NumTra) {
		Pro_NumTra = pro_NumTra;
	}



	public String getPro_Transa() {
		return Pro_Transa;
	}



	public void setPro_Transa(String pro_Transa) {
		Pro_Transa = pro_Transa;
	}



	public String getPro_Usuari() {
		return Pro_Usuari;
	}



	public void setPro_Usuari(String pro_Usuari) {
		Pro_Usuari = pro_Usuari;
	}



	public String getPro_FecSis() {
		return Pro_FecSis;
	}



	public void setPro_FecSis(String pro_FecSis) {
		Pro_FecSis = pro_FecSis;
	}



	public String getPro_SucOri() {
		return Pro_SucOri;
	}



	public void setPro_SucOri(String pro_SucOri) {
		Pro_SucOri = pro_SucOri;
	}



	public String getPro_SucDes() {
		return Pro_SucDes;
	}



	public void setPro_SucDes(String pro_SucDes) {
		Pro_SucDes = pro_SucDes;
	}
	
	
	
	
	


}
