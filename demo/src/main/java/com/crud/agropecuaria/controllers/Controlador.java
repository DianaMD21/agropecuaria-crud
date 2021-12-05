package com.crud.agropecuaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.agropecuaria.interfaceService.IProductService;
import com.crud.agropecuaria.models.Product;

@Controller
@RequestMapping
public class Controlador {

	public Controlador() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private IProductService productService;
	@GetMapping("/listar")
	public String getAll(Model model) {
		List<Product>products=productService.getAll();
		model.addAttribute("products", products);
		return "index";
	}

}
