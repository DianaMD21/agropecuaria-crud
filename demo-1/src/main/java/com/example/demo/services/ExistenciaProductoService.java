package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IExistenciaProductoService;
import com.example.demo.interfaces.IExistenciaProducto;
import com.example.demo.models.ExistenciaProducto;

@Service
public class ExistenciaProductoService implements IExistenciaProductoService {


	@Autowired
	private IExistenciaProducto data;

	@Override
	public List<ExistenciaProducto> getAll() {
		// TODO Auto-generated method stub
		return (List<ExistenciaProducto>) data.findAll();
	}

	@Override
	public Optional<ExistenciaProducto> listarId(Long idExisProduct) {
		data.findById(idExisProduct);
		return null;
	}

	@Override
	public int save(ExistenciaProducto p) {
		// TODO Auto-generated method stub
		int res=0;
		ExistenciaProducto product=data.save(p);
		if(!product.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(Long id) {
		data.deleteById(id);
		// TODO Auto-generated method stub

	}

}