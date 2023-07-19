package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {
	
	public Materia buscarPorId(Integer id);

	public Materia buscarPorCodigo(String codigo);

	public void insertar(Materia materia);
	
	public void actualizar(Materia materia);
	
	public void eliminar(Integer id);
	
	public List<Materia> buscarTodos();
	
}