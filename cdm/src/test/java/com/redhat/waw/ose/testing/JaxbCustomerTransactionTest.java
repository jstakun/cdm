package com.redhat.waw.ose.testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import com.redhat.waw.ose.model.CustomerTransaction;

public class JaxbCustomerTransactionTest {

	private static final String CT_XML = "./ct-jaxb.xml";
	
	@Test
	public void test() throws JAXBException, FileNotFoundException {
		CustomerTransaction ct = new CustomerTransaction();
		ct.setCustomerid("1");
		ct.setAmount(1000d);
		ct.setTransactionDate(System.currentTimeMillis());
		ct.setTransactionid("1");
		
		JAXBContext context = JAXBContext.newInstance(CustomerTransaction.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    // Write to System.out
	    m.marshal(ct, System.out);
	    
	    m.marshal(ct, new File(CT_XML));

	    // get variables from our xml file, created before
	    System.out.println();
	    System.out.println("Output from our XML File: ");
	    Unmarshaller um = context.createUnmarshaller();
	    CustomerTransaction ct1 = (CustomerTransaction) um.unmarshal(new FileReader(CT_XML));
	    System.out.println(ct1.getTransactionid() + " " + ct1.getCustomerid() + " " + ct1.getAmount() + ct1.getTransactionDate());
	}

}
