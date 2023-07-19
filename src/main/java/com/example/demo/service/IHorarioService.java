package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Horario;

public interface IHorarioService {
	
	public void guardar(Horario horario);
	
	public Horario consultarPorId(Integer id);
	
	public void actualizar(Horario horario);
	
	public void borrar(Integer id);
	
	public List<Horario> consultarTodos();

}
