package cashregister;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
//
//    	Item item = new Item("iphone",5000.00);
//    	Item[] items = new Item[1];
//    	items[0] = item;
//    	Printer printer = new Printer();
//    	CashRegister cashRegister = new CashRegister(printer);
//    	Purchase purchase = new Purchase(items);
//    	cashRegister.process(purchase);
//    	
        //given
      
    	Printer printer = mock(Printer.class);
    	Purchase purchase = mock(Purchase.class);
    	when(purchase.asString()).thenReturn("I do not know why");
    	  
    	//when
    	CashRegister cashRegister = new CashRegister(printer);
    	cashRegister.process(purchase);
    	//then
    	verify(printer).print("I do not know why");
    	
    	
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        //when
        //then
    	
    	Printer printer = mock(Printer.class);
    	Purchase purchase = mock(Purchase.class);
    	
    	CashRegister cashRegister = new CashRegister(printer);
    	cashRegister.process(purchase);
    	
    	verify(purchase).asString();
    	
    	
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        //when
        //then
    	
    	Printer printer = mock(Printer.class);
    	Purchase purchase = mock(Purchase.class);
    	when(purchase.asString()).thenReturn("I do not know why");
    	  
    	//when
    	CashRegister cashRegister = new CashRegister(printer);
    	cashRegister.process(purchase);
    	//then
    	verify(printer).print("I do not know why");
    	
    }

}
