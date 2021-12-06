package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.IExistenciaProductoService;
import com.example.demo.models.ExistenciaProducto;

@Controller
@RequestMapping
public class Controladora {

	@Autowired
	private IExistenciaProductoService existenciaProductService;
	@GetMapping("/listar")
	public String getAll(Model model) {
		List<ExistenciaProducto>products=existenciaProductService.getAll();
		model.addAttribute("products", products);
		return "index";
	}
	
	@GetMapping("/new")
	public String create(Model model) {
		model.addAttribute("product", new ExistenciaProducto());
		return "form";
	}
	@PostMapping("/save")
	public String save(@Validated ExistenciaProducto p, Model model) {
		existenciaProductService.save(p);
		return "redirect:/listar";
		
	}
	
	@GetMapping("/editar/{idProduct}")
	public String editar(@PathVariable Long idProduct ,Model model) {
		Optional<ExistenciaProducto> product=existenciaProductService.listarId(idProduct);
		model.addAttribute("product", product);
		return  "form";
	}
	
	@GetMapping("/eliminar/{idProduct}")
	public String delete(@PathVariable Long idProduct, Model model) {
		existenciaProductService.delete(idProduct);
		return "redirect:/listar";
		
	}

}
