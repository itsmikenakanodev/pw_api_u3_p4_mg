package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaService {

	public Materia consultarPorCodigo(String codigo);

	public void guardar(Materia materia);

	public Materia consultarPorId(Integer id);

	public void actualizar(Materia materia);

	public void eliminar(Integer id);
	
	public List<Materia> consultarTodos();

}
