package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ManyToAny;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min=4, max = 12)
	private String nombre;
	
	@NotEmpty(message = "no puede estar vacio")
	private String apellido;
	
	@Email
	@NotEmpty(message = "no puede estar vacio")
	@Column(nullable = false , unique = true )
	private String email;
	
	@NotNull
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	private String foto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="region_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Region region;
	
	//un cliente tiene muchas facturas
	@JsonIgnoreProperties({"cliente","hibernateLazyInitializer","handler"})
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Factura> facturas;
	
	public Cliente() {
		this.facturas = new ArrayList<Factura>();
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public List<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	
	
	
}
