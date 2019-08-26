package cashregister;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class PurchaseTest {
	
	@Test
	public void should_return_item_name_and_price_when_as_string_given_mock_item() {
		
		//given
		Item item =  mock(Item.class);
		Item[] items = new Item[1];
		items[0] = item;
		Purchase purchase = new Purchase(items);
		when(items[0].getName()).thenReturn("v8");
		when(items[0].getPrice()).thenReturn(1000.0);
		
	
		
		//when
		String result = purchase.asString();
		
		//then
       assertEquals("v8\t1000.0\n",result);
//		verify(purchase).asString();
		
		
		
	}

}
