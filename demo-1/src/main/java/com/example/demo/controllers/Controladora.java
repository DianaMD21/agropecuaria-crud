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

import com.example.demo.interfaceService.IProductService;
import com.example.demo.models.Product;

@Controller
@RequestMapping
public class Controladora {

	@Autowired
	private IProductService productService;
	@GetMapping("/listar")
	public String getAll(Model model) {
		List<Product>products=productService.getAll();
		model.addAttribute("products", products);
		return "index";
	}
	
	@GetMapping("/new")
	public String create(Model model) {
		model.addAttribute("product", new Product());
		return "form";
	}
	@PostMapping("/save")
	public String save(@Validated Product p, Model model) {
		productService.save(p);
		return "redirect:/listar";
		
	}
	
	@GetMapping("/editar/{idProduct}")
	public String editar(@PathVariable Long idProduct ,Model model) {
		Optional<Product> product=productService.listarId(idProduct);
		model.addAttribute("product", product);
		return  "form";
	}
	
	@GetMapping("/eliminar/{idProduct}")
	public String delete(@PathVariable Long idProduct, Model model) {
		productService.delete(idProduct);
		return "redirect:/listar";
		
	}

}
