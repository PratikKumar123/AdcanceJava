package springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.mode.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTempate;
	@Transactional
	public int saveUser(User user) {
		int i =(Integer)this.hibernateTempate.save(user);
		return i;
		
	}
}
