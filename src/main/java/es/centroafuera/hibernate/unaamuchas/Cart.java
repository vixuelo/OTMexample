package es.centroafuera.hibernate.unaamuchas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity (name = "Cart")
@Table(name="Cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cart_id;
	
	private String name;
	
	
	public Cart(String name) {
		this.name=name;
	}
	
	public Cart() {
		// TODO Auto-generated constructor stub
		this.name="";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}	

	public int getCart_id() {
		return cart_id;
	}


	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}


	@OneToMany(mappedBy="cart", cascade = {CascadeType.ALL})
	private List<Item> items = new ArrayList<Item>();
	
	
	 //Método para añadir objetos de tipo Item a la clase Cart
	   public void addItem(Item item) {
		   this.items.add(item);
		  
		   
	   }
	
}
