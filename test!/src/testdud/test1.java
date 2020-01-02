package testdud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<human> m_listHuman = new ArrayList<>();
		int nRun = 1;
		while(nRun > 0)
		{
			human temp = new human();
			temp.setName(s.next());
			temp.setGender(s.next());
			temp.setAddress(s.next());
			temp.setBirth(s.nextInt());
			m_listHuman.add(temp);
			
			nRun = s.nextInt();
		}
	}
}

class human{
	private String name;
	private String gender;
	private String address;
	private int birth;
	
	public String getName()
	{
		return name;
	}
	public String getGender()
	{
		return gender;
	}
	public String getAddress()
	{
		return address;
	}
	public int getBirth()
	{
		return birth;
	}
	
	
	public void setName(String cname)
	{
		name = cname;
	}
	public void setGender(String ngen)
	{
		gender = ngen;
	}
	public void setAddress(String nadd)
	{
		address = nadd;
	}
	public void setBirth(int nbirth)
	{
		birth = nbirth;
	}
}