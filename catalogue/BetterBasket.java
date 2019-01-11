package catalogue;

import java.io.Serializable;

/**
 * @author  Harry Ammon 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  private int theOrderNum = 0; // order number
  
  /**
   * New constructor
   */
  public BetterBasket() {
	  theOrderNum = 0;
  }
  
  @Override
  public boolean add(Product pr) {
	  for(int i = 0;i<super.size();i++) { // length of Arraylist
		// If the product number for two products match
		  if(super.get(i).getProductNum().equals(pr.getProductNum())) {
			  // Get the current quantity of that product and increase by one
			  super.get(i).setQuantity(super.get(i).getQuantity()+1); 
			  return true;
		  }
	  }
	  // If the product is not found then call original add function to
	  // to add to the ArrayList
	  return super.add(pr);
  }
}
