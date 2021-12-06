package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.ExistenciaProducto;

public interface IExistenciaProductoService {
	public List<ExistenciaProducto> getAll();
	public Optional<ExistenciaProducto> listarId(Long idProduct);
	public int save(ExistenciaProducto p);
	public void delete(Long p);
}
