package example.sportyshoe.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.sportyshoe.entity.AdminRepository;
import example.sportyshoe.entity.Admin;

@Service
public class AdminDao {
	@Autowired
	AdminRepository arepo;
	
	public Admin insert(Admin a) {
		return arepo.save(a);
	}
	public Admin byEmail(String mail) {
		return arepo.findByMail(mail);
	}
	
	public Admin byPassword(String pwd) {
		return arepo.findByPassword(pwd);
	}

}