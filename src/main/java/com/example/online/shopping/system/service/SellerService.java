package com.example.online.shopping.system.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.online.shopping.system.models.Seller;
import com.example.online.shopping.system.repository.SellerRepository;

import java.util.List;

@Service
@Transactional
public class SellerService {

	 @Autowired
	    private SellerRepository sellerRepository;
	 
	 	public void addStocks(Seller seller) {
	        sellerRepository.save(seller);
	    }

		public List<Seller> listAllStocks() {
			return sellerRepository.findAll();
		}

	public void deleteStocks(Integer id) {
		sellerRepository.deleteById(id);
	}
	    
}
