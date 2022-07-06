package example.sportyshoe.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.sportyshoe.entity.CasualsRepository;
import example.sportyshoe.entity.RunningRepository;
import example.sportyshoe.entity.ShoeRepository;
import example.sportyshoe.entity.SportsRepository;
import example.sportyshoe.entity.Casuals;
import example.sportyshoe.entity.Running;
import example.sportyshoe.entity.Shoe;
import example.sportyshoe.entity.Sports;

@Service
public class ShoeDao {
	@Autowired
	ShoeRepository srepo;
	
	@Autowired
	SportsRepository sprepo;
	
	@Autowired
	CasualsRepository crepo;
	
	@Autowired
	RunningRepository rrepo;
	
	public Shoe insert(Shoe s) {
		return srepo.save(s);
	}
	
	public List<Shoe> getAll(){
		return srepo.findAll();
	}
	public List<Sports> getSports(){
		return sprepo.findAll();
	}
	public List<Casuals> getCas(){
		return crepo.findAll();
	}
	public List<Running> getRun(){
		return rrepo.findAll();
	}
	
	public String deleteById(int id) {
		srepo.deleteById(id);
		return "Deleted";
	}
	
	public Shoe edit(Shoe s) {
		Shoe s1=srepo.findById(s.getId()).orElse(null);
		s1.setShoeComp(s.getShoeComp());
		s1.setCategory(s.getCategory());
		s1.setSize(s.getSize());
		s1.setPrice(s.getPrice());
		return srepo.save(s1);
	}
	
	public Shoe findById(int id) {
		Shoe s=srepo.findById(id).orElse(null);
		return s;
	}
}