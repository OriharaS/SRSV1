package srs.test;

import java.util.ArrayList;

import srs.dao.UserDao;
import srs.domain.DataAccess;
import srs.domain.Person;

public class TestDaoImpl {
	public static void main(String[] args) {
		ArrayList<Person> persons= new ArrayList<Person>();
		UserDao userDao= DataAccess.createUserDao();
		persons = userDao.getAllUser();

		if(persons != null) { // 排除了persons为null的情况
			for(Person p: persons) {
				System.out.println(p.getType());
			}
		}
	}
}
