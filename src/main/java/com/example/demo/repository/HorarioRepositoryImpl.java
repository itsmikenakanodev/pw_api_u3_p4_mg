package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Horario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HorarioRepositoryImpl implements IHorarioRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Horario horario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(horario);
	}

	@Override
	public Horario buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Horario.class, id);
	}

	@Override
	public void actualizar(Horario horario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(horario);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Horario horario = this.buscarPorId(id);
		this.entityManager.remove(horario);
	}

	@Override
	public List<Horario> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Horario> myQuery = this.entityManager.createQuery("SELECT h FROM Horario h", Horario.class);
		return myQuery.getResultList();
	}



}
