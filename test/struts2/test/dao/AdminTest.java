/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.dao;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import struts2.test.beans.Product;
import struts2.test.beans.User;

/**
 *
 * @author deepd
 */
public class AdminTest {
    
    public AdminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of registerUser method, of class Admin.
     */
    @Test
    public void testRegisterUser() throws Exception {
        System.out.println("registerUser");
        String userName = "deep";
        String password = "1234";
        String firstName = "deep";
        String lastName = "dubey";
        String email = "deepdubey@gmail.com";
        String phoneNumber = "7123456897";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.registerUser(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registerProduct method, of class Admin.
     */
    @Test
    public void testRegisterProduct() throws Exception {
        System.out.println("registerProduct");
        int productId = 6;
        String productName = "Realme";
        String productMake = "Smart Watch";
        double price = 3000;
        int availability = 11;
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.registerProduct(productId, productName, productMake, price, availability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of report method, of class Admin.
     */
    @Test
    public void testReport() throws Exception {
        System.out.println("report");
        Admin instance = new Admin();
        //List expResult = null;
        List result = instance.report();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertNotNull(result);
    }

    /**
     * Test of productreport method, of class Admin.
     */
    @Test
    public void testProductreport() throws Exception {
        System.out.println("productreport");
        Admin instance = new Admin();
        //List expResult = null;
        List result = instance.productreport();
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertNotNull(result);
    }

    /**
     * Test of fetchUserDetails method, of class Admin.
     */
    @Test
    public void testFetchUserDetails() throws Exception {
        System.out.println("fetchUserDetails");
        String userName = "deep123";
        Admin instance = new Admin();
        //User expResult = null;
        User result = instance.fetchUserDetails(userName);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertNotNull(result);
    }

    /**
     * Test of fetchProductDetails method, of class Admin.
     */
    @Test
    public void testFetchProductDetails() throws Exception {
        System.out.println("fetchProductDetails");
        int productId = 6;
        Admin instance = new Admin();
        //Product expResult = null;
        Product result = instance.fetchProductDetails(productId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertNotNull(result);
    }

    /**
     * Test of updateUserDetails method, of class Admin.
     */
    @Test
    public void testUpdateUserDetails() throws Exception {
        System.out.println("updateUserDetails");
        String userName = "deep";
        String password = "123";
        String firstName = "Test";
        String lastName = "User";
        String email = "testuser11@gmail.com";
        String phoneNumber = "123456789";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.updateUserDetails(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateProductDetails method, of class Admin.
     */
    @Test
    public void testUpdateProductDetails() throws Exception {
        System.out.println("updateProductDetails");
        int productId = 6;
        String productName = "testProd";
        String productMake = "testMake";
        double price = 321.5;
        int availability = 20;
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.updateProductDetails(productId, productName, productMake, price, availability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserDetails method, of class Admin.
     */
    @Test
    public void testDeleteUserDetails() throws Exception {
        System.out.println("deleteUserDetails");
        String userName = "deep";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.deleteUserDetails(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProductDetails method, of class Admin.
     */
    @Test
    public void testDeleteProductDetails() throws Exception {
        System.out.println("deleteProductDetails");
        int productId = 6;
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.deleteProductDetails(productId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
