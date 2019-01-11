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
	  
	  // This will only run if the product is not already found in the list
	  for(int j = 0; j < super.size(); j++) { // Length of Arraylist
		  // Converts both product numbers to ints
		  // If the product number of the current product is smaller than the product number of the new product
		if(Integer.parseInt(super.get(j).getProductNum()) > Integer.parseInt(pr.getProductNum())) {
			super.add(j, pr); // Will add current product to position j in the arraylist
			return true;
		}  
	  }
	  // If no products are in the basket, the super.add method will be used
	  // to add Product pr to the ArrayList
	  return super.add(pr);
  }
}
