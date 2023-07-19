package com.example.demo.repository.modelo;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Horario")
@Table(name = "horario")
public class Horario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hora_id_seq")
	@SequenceGenerator(name = "hora_id_seq", sequenceName = "hora_id_seq", allocationSize = 1)
	@Column(name = "hora_id")
	private Integer id;
	
	@Column(name = "hora_inicio")
	private LocalTime horaInicio;
	
	@Column(name = "hora_fin")
	private LocalTime horaFin;
	
	@Column(name = "hora_dureacion")
	private Integer duracion;
	
	@Column(name = "hora_materia")
	private String materia;
	
	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Horario [id=" + id + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", duracion=" + duracion
				+ ", materia=" + materia + "]";
	}
	
	
	

}
