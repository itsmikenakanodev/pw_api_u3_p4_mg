package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHorarioRepository;
import com.example.demo.repository.modelo.Horario;

@Service
public class HorarioServiceImpl implements IHorarioService {

	@Autowired
	private IHorarioRepository iHorarioRepository;

	@Override
	public void guardar(Horario horario) {
		// TODO Auto-generated method stub
		this.iHorarioRepository.insertar(horario);
	}

	@Override
	public Horario consultarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iHorarioRepository.buscarPorId(id);
	}

	@Override
	public void actualizar(Horario horario) {
		// TODO Auto-generated method stub
		this.iHorarioRepository.actualizar(horario);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iHorarioRepository.eliminar(id);
	}

	@Override
	public List<Horario> consultarTodos() {
		// TODO Auto-generated method stub
		return this.iHorarioRepository.buscarTodos();
	}

}
