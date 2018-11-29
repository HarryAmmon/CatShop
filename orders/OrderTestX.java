package orders;

import middle.OrderProcessing;

/**
 * A JUnit test of the Order class
 */
public class OrderTestX  extends OrderTest
{
  public OrderProcessing makeOrder()
  {
    return new OrderX();
  }

}
