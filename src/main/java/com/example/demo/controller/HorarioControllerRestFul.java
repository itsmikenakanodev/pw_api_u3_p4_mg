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

import com.example.demo.repository.modelo.Horario;
import com.example.demo.service.IHorarioService;

@RestController
@RequestMapping(path = "/horarios")
public class HorarioControllerRestFul {

	@Autowired
	private IHorarioService horarioService;

	@GetMapping("/{id}")
	public Horario consultarPorId(@PathVariable Integer id) {
		return this.horarioService.consultarPorId(id);
	}

	@PostMapping
	public void guardar(@RequestBody Horario horario) {
		this.horarioService.guardar(horario);
	}

	@PutMapping("/{id}")
	public void actualizar(@RequestBody Horario Horario, @PathVariable Integer id) {
		Horario.setId(id);
		this.horarioService.actualizar(Horario);
	}

	@PatchMapping(path = "/{id}")
	public void actualizarParcial(@RequestBody Horario horario, @PathVariable Integer id) {
		Horario horario1 = this.horarioService.consultarPorId(id);
		horario1.setDuracion(horario.getDuracion());
		this.horarioService.actualizar(horario1);

	}

	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable Integer id) {
		this.horarioService.borrar(id);
	}

	@GetMapping
	public List<Horario> consultarTodos() {
		return this.horarioService.consultarTodos();
	}

}
