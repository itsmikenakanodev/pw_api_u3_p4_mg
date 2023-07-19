package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService{
	
	@Autowired
	private IMateriaRepository iMateriaRepository;

	@Override
	public Materia consultarPorCodigo(String codigo) {
		
		return this.iMateriaRepository.buscarPorCodigo(codigo);
	}

	@Override
	public void guardar(Materia materia) {
		
		this.iMateriaRepository.insertar(materia);
	}

	@Override
	public Materia consultarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.buscarPorId(id);
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.actualizar(materia);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.eliminar(id);
	}

	@Override
	public List<Materia> consultarTodos() {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.buscarTodos();
	}
	
	

}
