/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolia.javaee1;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.naming.NamingException;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;


/**
 *
 * @author staniss
 */
@RunWith(Arquillian.class)
public class MyManagedBeanTest {
    
    public MyManagedBeanTest() {
    }   
    
    @Inject
    MyManagedBean myManagedBean;
    
    
    @Deployment
    public static Archive<?> createDeploymnet(){
        return ShrinkWrap.create(WebArchive.class, "test.war")
        .addPackage("com.metropolia.javaee1")
        .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");          
    }
    
    @BeforeClass
    public static void setUpClass() {

    }
    
    @AfterClass
    public static void tearDownClass() {
       
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMemes method, of class MyManagedBean.
     * @throws javax.naming.NamingException
     */
    @Test
    public void testGetMemes() throws NamingException {
        System.out.println("getMemes");       
        String expResult = "swag";
        String result = myManagedBean.getMemes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
