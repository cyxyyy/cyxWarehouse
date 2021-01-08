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
		String name="������";
		new LoginSQL().insertClient(id, password, name);
	}
	@Test
	public void caoTest9() {
		String id="564377";
		String password="785786";
		String name="����";
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
		String kind="��";
		String variety="����";
		String age="1��";
		String sex="����";
		String color="��ɫ";
		new LoginSQL().addInfo(number, kind, variety, age, sex, color);
	}
	@Test
	public void caoTest12() {
		String number="2";
		String kind="è";
		String variety="�۶�è";
		String age="5����";
		String sex="����";
		String color="�ƺ�ɫ";
		new LoginSQL().alterInfo(number, kind, variety, age, sex, color);
			
	}
	@Test
	public void caoTest13() {
		String kind="��";
		String veriety="��ʿ��";
		String age="1��";
		String sex="����";
		String color="�ڰ�ɫ";
		String name="½����";
		String adress="�������0098��";
		new LoginSQL().insertOrder(kind, veriety, age, sex, color, name, adress);
			
	}
}
