package catalogue;

import java.io.Serializable;

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
   * Will create a hashmap to store products in the basket in
   *
   */
  public BetterBasket() {
	  //HashMap<String, Product> basket = new HashMap<String, Product>();
	  theOrderNum = 0;
  }
  
  @Override
  public boolean add(Product pr) {
	  for(int i = 0;i<super.size();i++) {
		  if(super.get(i).getProductNum().equals(pr.getProductNum())) {
			  super.get(i).setQuantity(super.get(i).getQuantity()+1);
			  return true;
		  }
	  }
	  return super.add(pr);
  }
}
