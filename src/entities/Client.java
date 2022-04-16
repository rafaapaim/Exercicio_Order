package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date birthDate;
	
	private List<OrderItem> orders = new ArrayList<>();

	public Client( String name, String email, Date birthDate) {;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<OrderItem> getOrders() {
		return orders;
	}

	public void addOrder(OrderItem order) {
		orders.add(order);
	}
	
	public void removeOrder(OrderItem order) {
		orders.remove(order);
	}
	
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
	}

}
