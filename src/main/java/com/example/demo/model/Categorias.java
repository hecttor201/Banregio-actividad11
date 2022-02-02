package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table (name = "BRCATEGO")
public class Categorias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Cat_IdCate")
	private Long Cat_IdCate;
	@Column(name = "Cat_Nombre")
	private String Cat_Nombre;
	@Column(name = "Cat_NumTra")
	private String Cat_NumTra;
	@Column(name = "Cat_Transa")
	private String Cat_Transa;
	@Column(name = "Cat_Usuari")
	private String Cat_Usuari;
	@Column(name = "Cat_FecSis")
	private String Cat_FecSis;
	@Column(name = "Cat_SucOri")
	private String Cat_SucOri;
	@Column(name = "Cat_SucDes")
	private String Cat_SucDes;
	
	public Categorias() {
		
	}
	
	public Categorias(Long cat_IdCate, String cat_Nombre, String cat_NumTra, String cat_Transa, String cat_Usuari,
			String cat_FecSis, String cat_SucOri, String cat_SucDes) {
		super();
		Cat_IdCate = cat_IdCate;
		Cat_Nombre = cat_Nombre;
		Cat_NumTra = cat_NumTra;
		Cat_Transa = cat_Transa;
		Cat_Usuari = cat_Usuari;
		Cat_FecSis = cat_FecSis;
		Cat_SucOri = cat_SucOri;
		Cat_SucDes = cat_SucDes;
	}
	
	public Long getCat_IdCate() {
		return Cat_IdCate;
	}
	public void setCat_IdCate(Long cat_IdCate) {
		Cat_IdCate = cat_IdCate;
	}
	public String getCat_Nombre() {
		return Cat_Nombre;
	}
	public void setCat_Nombre(String cat_Nombre) {
		Cat_Nombre = cat_Nombre;
	}
	public String getCat_NumTra() {
		return Cat_NumTra;
	}
	public void setCat_NumTra(String cat_NumTra) {
		Cat_NumTra = cat_NumTra;
	}
	public String getCat_Transa() {
		return Cat_Transa;
	}
	public void setCat_Transa(String cat_Transa) {
		Cat_Transa = cat_Transa;
	}
	public String getCat_Usuari() {
		return Cat_Usuari;
	}
	public void setCat_Usuari(String cat_Usuari) {
		Cat_Usuari = cat_Usuari;
	}
	public String getCat_FecSis() {
		return Cat_FecSis;
	}
	public void setCat_FecSis(String cat_FecSis) {
		Cat_FecSis = cat_FecSis;
	}
	public String getCat_SucOri() {
		return Cat_SucOri;
	}
	public void setCat_SucOri(String cat_SucOri) {
		Cat_SucOri = cat_SucOri;
	}
	public String getCat_SucDes() {
		return Cat_SucDes;
	}
	public void setCat_SucDes(String cat_SucDes) {
		Cat_SucDes = cat_SucDes;
	}


	

}
