import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.junit.Test;

import delectable.Customer.Customer;
import delectable.Customer.CustomerServices;
import delectable.Customer.CustomerStorge;
import delectable.delectable.Admin;
import delectable.delectable.MyResource;
import delectable.menu.Menu;
import delectable.menu.MenuServices;
import delectable.order.Order;
import delectable.order.OrderServices;
import delectable.order.OrderStorge;

public class TestmyProject {

	Customer newCustomer = new Customer("John Doe", "hawks@hawk.iit.edu", "6307779999");
	Customer newNewCustomer = new Customer();
	
	@Test
	public void CustomerGetName() {
		assertEquals(newCustomer.getName(), "John Doe");
	}
	
	@Test
	public void CustomerGetEmail() {
		assertEquals(newCustomer.getEmail(), "hawks@hawk.iit.edu");
	}
	
	@Test
	public void CustomerGetPhone() {
		assertEquals(newCustomer.getPhone(), "6307779999");
	}
	
	@Test
	public void CustomerSetName() {
		newCustomer.setName("Doe John");
		assertEquals(newCustomer.getName(), "Doe John");
	}
	
	@Test
	public void CustomerSetEmail() {
		newCustomer.setEmail("DoeJohn@hawk.iit.edu");
		assertEquals(newCustomer.getEmail(), "DoeJohn@hawk.iit.edu");
	}
	
	@Test
	public void CustomerSetId() {
		newCustomer.setCustomerId(42);
		assertEquals(newCustomer.getCustomerId(),42);
	}
	
	@Test
	public void CustomerSetPhone() {
		newCustomer.setPhone("6331254568");
		assertEquals(newCustomer.getPhone(),"6331254568");
	}
	
	Order newOrder = new Order(42, "05-23-2016", "06-25-2016", 25.56, 0, "Processing", "kulm@hawk.iit.edu");
	Order newNewOrder = new Order();
	
	@Test
	public void OrderGetID(){
		assertEquals(newOrder.getId() ,42);
	}
	
	@Test
	public void orderSetID() {
		newOrder.setId(49);
		assertEquals(newOrder.getId(), 49);
	}
	
	@Test
	public void OrderGetPurchaseDate(){
		assertEquals(newOrder.getOrder_date() ,"05-23-2016");
	}
	
	@Test
	public void orderSetPurchaseDate() {
		newOrder.setOrder_date("03-11-2016");
		assertEquals(newOrder.getOrder_date(), "03-11-2016");
	}
	
	@Test
	public void OrderGetDelivaryDate(){
		assertEquals(newOrder.getDelivery_date() ,"06-25-2016");
	}
	
	@Test
	public void orderSetDelivaryDate() {
		newOrder.setDelivery_date("06-26-2016");
		assertEquals(newOrder.getDelivery_date(), "06-26-02016");
	}
	
	@Test
	public void OrderGetAmount(){
		double amount = newOrder.getAmount();
		String newPrice = Double.toString(amount);
		assertEquals(newPrice ,"25.56");
	}
	
//	@Test
//	public void orderSetAmount {
//		newOrder.setAmount(100.62);
//		assertEquals(newOrder.getAmount(), 100.62);
//	}
	
	@Test
	public void OrderGetSurCharge(){
		assertEquals(newOrder.getSurcharge(),0 );
	}
	
	@Test
	
	public void orderSetSurChage() {
		newOrder.setSurcharge(25);
		assertEquals(newOrder.getSurcharge(), 25);
	}
	
	@Test
	public void OrderGetStatus(){
		assertEquals(newOrder.getStatus(),"Processing" );
	}
	
	public void orderSetStatus() {
		newOrder.setStatus("Open2");
		assertEquals(newOrder.getStatus(), "Open2");
	}
	
	@Test
	public void OrderGetOrderedBy(){
		assertEquals(newOrder.getOrdered_by(),"kulm@hawk.iit.edu" );
	}

	@Test
	public void orderSetOrderBy() {
		newOrder.setOrdered_by("JohnDoe@gmail.com");
		assertEquals(newOrder.getOrdered_by(), "JohnDoe@gmail.com");
	}
	
	Menu newMenu= new Menu("Mac and Cheese", 5.50 ,3);
	Menu bla = new Menu();
	
	@Test
	public void MenuID(){
		newMenu.setId(420);
		assertEquals(newMenu.getId(), 420);
	}
	
	@Test
	public void menuGetName(){
		newMenu.setName("New Mac and Cheese");
		assertEquals(newMenu.getName(), "New Mac and Cheese");
	}
	
	@Test
	public void menuGetPrice(){
		newMenu.setPricePerPerson(5.50);
		double price = newMenu.getPricePerPerson();
		String newPrice = Double.toString(price);
		assertEquals(newPrice , "5.50");
	}
	
	@Test
	public void menuGetMinimum_order(){
		assertEquals(newMenu.getMinimum_order(),3);
	}
	
	@Test
	public void menuSetMinimum_order(){
		newMenu.setMinimum_order(5);
		assertEquals(newMenu.getMinimum_order(),5);
	}
	
	@Test
	public void menuGetCreate_Day(){
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date today = new Date();
		String todayDate = df.format(today);
		String dateFromOrder = df.format(newMenu.getCreate_Day());
		assertEquals(dateFromOrder, todayDate);
	}
	
	@Test
	public void menuSetCreate_Day(){
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date today = new Date();
		String todayDate = df.format(today);
		newMenu.setCreate_Day(today);
		String dateFromOrder = df.format(newMenu.getCreate_Day());
		assertEquals(dateFromOrder, todayDate);
	}
	
	@Test
	public void menuGet_LastModDay(){
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date today = new Date();
		String todayDate = df.format(today);
		String dateFromOrder = df.format(newMenu.getLast_modified_date());
		assertEquals(dateFromOrder, todayDate);
	}
	
	@Test
	public void menuSetLastModDay(){
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date today = new Date();
		String todayDate = df.format(today);
		newMenu.setLast_modified_date(today);
		String dateFromOrder = df.format(newMenu.getLast_modified_date());
		assertEquals(dateFromOrder, todayDate);
	}
	
	@Test
	public void myRecourse(){
		MyResource stuff = new MyResource();
		assertEquals(stuff.getIt(), "Got it!");
	}
	
	Admin newAdmin1 = new Admin();
	Admin newAdmin = new Admin (5);
	@Test
	public void testAdmin(){
		newAdmin.setSurcharge(15);
		assertEquals(newAdmin.getSurcharge(), 15);
	}
	
	@Test
	public void TestOrderServices(){
		OrderStorge newOrderStorge = new OrderStorge();		
		OrderServices newOrder = new OrderServices();
		Order newOrder1 = new Order();
		newOrder.getAllOrders();
		newOrder.getOrder(0);
		newOrder.addOrder(newOrder1);
	}
	
	@Test
	public void TestCustomerServices(){
		CustomerServices newCustomerServices = new CustomerServices();
		newCustomerServices.getCustomer(0);
		newCustomerServices.getAllCustomers();
		CustomerStorge newCustomerStorge = new CustomerStorge();
		
		Customer newCustomer1 = new Customer("John Doe", "hawks@hawk.iit.edu", "6307779999");
		newCustomerServices.addCustomer(newCustomer1);
		newCustomerServices.getCustomerByName("Name");
		
	}
	
	@Test
	public void TestMenuServices(){
		MenuServices newMenuServices = new MenuServices();
		Menu newMenu1 = new Menu();
		newMenuServices.addMenuItem(newMenu1);
		
		newMenuServices.updateMenu(newMenu1);
		
	}
	
	
	
}
