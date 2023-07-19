package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.IMateriaService;

@RestController
@RequestMapping("/materias")
public class MateriaControllerRestFul {

	@Autowired
	private IMateriaService iMateriaService;

	@GetMapping("/buscar/{codigo}")
	public Materia consultarPorCodigo(@PathVariable String codigo) {
		return this.iMateriaService.consultarPorCodigo(codigo);
	}

	@PostMapping("/guardar")
	public void guardar(@RequestBody Materia materia) {
		this.iMateriaService.guardar(materia);
	}

	@PutMapping("/actualizar/{id}")
	public void actualizar(@RequestBody Materia materia, @PathVariable Integer id) {
		materia.setId(id);
		this.iMateriaService.actualizar(materia);
	}

	@PatchMapping(path = "/actualizarParcial/{id}")
	public void actualizarParcial(@RequestBody Materia materia, @PathVariable Integer id) {

		Materia materia1 = this.iMateriaService.consultarPorId(id);
		materia1.setCodigoMateria(materia.getCodigoMateria());

		this.iMateriaService.actualizar(materia1);

	}

	@DeleteMapping(path = "/borrar/{id}")
	public void borrar(@PathVariable Integer id) {
		this.iMateriaService.eliminar(id);
	}

	@GetMapping(path = "/buscarTodos")
	public List<Materia> consultarTodos() {
		return this.iMateriaService.consultarTodos();
	}

}
