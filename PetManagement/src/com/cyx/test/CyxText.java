package com.cyx.test;

import org.junit.Test;

import com.cyx.dao.LoginSQL;
import com.cyx.pojo.Animal;
import com.cyx.pojo.Customer;
import com.cyx.pojo.Indent;
import com.cyx.pojo.Keeper;

public class CyxText {
	@Test
	public void caoTest1() {
		new Animal();
	}
	@Test
	public void caoTest2() {
		new Customer();
	}
	@Test
	public void caoTest3() {
		new Indent();
	}
	@Test
	public void caoTest4() {
		new Keeper();
	}
	@Test
	public void caoTest5()throws Exception {
		new LoginSQL().queryClient();
	}
	@Test
	public void caoTest6()throws Exception{
		new LoginSQL().queryBoss();
	}
	@Test
	public void caoTest7()throws Exception{
		new LoginSQL().queryPet();
	}
	@Test
	public void caoTest8() {
		String id="190234";
		String password="001123";
		String name="²ÜÓêÝæ";
		new LoginSQL().insertClient(id, password, name);
	}
	@Test
	public void caoTest9() {
		String id="564377";
		String password="785786";
		String name="ÖÜÇÇ";
		new LoginSQL().insertBoss(id,password,name);
	}
	@Test
	public void caoTest10() {
		String number="1";
		new LoginSQL().deletePet(number);
	}
	@Test
	public void caoTest11() {
		String number="1";
		String kind="¹·";
		String variety="²©ÃÀ";
		String age="1Ëê";
		String sex="ÐÛÐÔ";
		String color="°×É«";
		new LoginSQL().addInfo(number, kind, variety, age, sex, color);
	}
	@Test
	public void caoTest12() {
		String number="2";
		String kind="Ã¨";
		String variety="ÕÛ¶úÃ¨";
		String age="5¸öÔÂ";
		String sex="´ÆÐÔ";
		String color="»ÆºÚÉ«";
		new LoginSQL().alterInfo(number, kind, variety, age, sex, color);
			
	}
	@Test
	public void caoTest13() {
		String kind="¹·";
		String veriety="¹þÊ¿Ææ";
		String age="1Ëê";
		String sex="ÐÛÐÔ";
		String color="ºÚ°×É«";
		String name="Â½º·æç";
		String adress="·­¶·´ó½Ö0098ºÅ";
		new LoginSQL().insertOrder(kind, veriety, age, sex, color, name, adress);
			
	}
}
