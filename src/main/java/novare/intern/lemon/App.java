package novare.intern.lemon;

import novare.intern.lemon.user.TeamInfo;
import org.hibernate.Session;
import novare.intern.lemon.util.HibernateUtil;

 
public class App {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();
		TeamInfo user = new TeamInfo();
 
		user.setTeamName("BsCPE4B_drinking team");
		user.setMidLaner("Jake");
		user.setHardCarry("Aram");
		user.setHardLaner("Jimwell");
		user.setSupport1("Marvin");
		user.setSupport2("Russel");
		
		session.save(user);
		session.getTransaction().commit();
	}
}