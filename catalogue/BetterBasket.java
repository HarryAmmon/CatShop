package catalogue;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Harry Ammon 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  private int theOrderNum = 0; // order number
  
  // You need to add code here
  /**
   * New constructor
   * Will create a hashmao to store products in the basket in
   *
   */
  public BetterBasket() {
	  HashMap<String, Product> basket = new HashMap<String, Product>();
	  theOrderNum = 0;
	  System.out.println("Hello");
  }
  
  @Override
  public boolean add(Product pr) {
	  
	  return true;
  }
}
