package es.centroafuera.hibernate.unaamuchas;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity (name = "Item")
@Table(name="Items")
public class Item {
	
	
	@Id
	@GeneratedValue
	private int id;
	private String price;
	private String name;
	
	
	public Item(String name, String price){
		this.price=price;
		this.name=name;
		cart = new Cart();
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="cart_id")
	private Cart cart;
	
	
	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Cart getCart() {
		return this.cart;
	}
	
	public void setCart(Cart cart) {
		this.cart=cart;
	}
	
	
	

}
