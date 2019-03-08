package es.centroafuera.hibernate.unaamuchas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "OneToManyProject" );
		      EntityManager entitymanager = emfactory.createEntityManager( );
		      //EntityTransaction etx = entitymanager.getTransaction();

		      //Creamos las clases 
		      Item item1=new Item("Producto1", "12");
		      Item item2=new Item("Producto2","22");
		      
		      Cart cart = new Cart("Juan Ramírez Benítez");
		      
		      cart.addItem(item1);
		      cart.addItem(item2);
		      
		      entitymanager.getTransaction( ).begin( );
		      
		      entitymanager.persist(cart);
		      
		      entitymanager.getTransaction( ).commit( );
		      entitymanager.close( );
		      emfactory.close( );
		      System.exit(0);
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }

	}

}
