package com.benkhalifa.capstoneFood.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benkhalifa.capstoneFood.model.Purchase;
import com.benkhalifa.capstoneFood.repo.PurchaseRepository;
import com.benkhalifa.capstoneFood.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private PurchaseRepository repo;

	
	
	public List<Purchase> getAll() {
		return repo.findAll();
	}
	public Purchase save (Purchase purchase ) {
		return repo.save(purchase);
		
	}
}
