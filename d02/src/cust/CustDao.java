package cust;

import java.util.ArrayList;

import frame.Dao;

public class CustDao 
    implements Dao<String, Cust> {

	String dbip;
	
	public String getDbip() {
		return dbip;
	}

	public void setDbip(String dbip) {
		this.dbip = dbip;
	}

	@Override
	public void insert(Cust v) {
		System.out.println(v);
		System.out.println(dbip+" Inserted...");
	}

	@Override
	public void delete(String k) {
		System.out.println(k);
		System.out.println("Deleted...");		
	}

	@Override
	public void update(Cust v) {
		System.out.println(v);
		System.out.println("Updated...");			
	}

	@Override
	public Cust select(String k) {
		return new Cust("id34","pwd34","Kim",34);
	}

	@Override
	public ArrayList<Cust> select() {
		ArrayList<Cust> list = 
		new ArrayList<>();
		list.add(new Cust("id34","pwd34","Kim",34));
		list.add(new Cust("id35","pwd35","Lee",44));
		list.add(new Cust("id36","pwd36","Han",54));
		list.add(new Cust("id37","pwd37","Hong",64));
		list.add(new Cust("id38","pwd38","Jun",74));
		
		return list;
	}

	

}
