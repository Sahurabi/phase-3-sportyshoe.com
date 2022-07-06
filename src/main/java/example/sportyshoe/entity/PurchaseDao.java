package example.sportyshoe.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.sportyshoe.entity.PurchaseRepository;
import example.sportyshoe.entity.Purchase;

@Service
public class PurchaseDao {
	@Autowired
	PurchaseRepository prepo;
	
	public Purchase insert(Purchase p) {
		return prepo.save(p);
	}
	
	public List<Purchase> getall(){
		return prepo.findAll();
	}

}