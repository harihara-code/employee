package training.employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Data {	
	private String data;

	public Data() {
		
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return data;
	}
	
}
