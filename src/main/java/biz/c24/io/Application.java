package biz.c24.io;

import biz.c24.io.api.*;
import biz.c24.io.api.data.*;
import biz.c24.io.swift2017.*;
import java.io.*;

/**
 *
 * @author Divan Mostert
 */
public class Application {

    public static void main(String[] args) {
    	try {
			//Parse the valid file
			MT103Message parsedMessage = C24.parse(MT103Message.class).from(new FileReader("src/test/resources/data/valid/MT103i-valid_1.dat"));
			System.out.println("The original format:");
			System.out.println(parsedMessage);
			System.out.println("");
			
			ComplexDataObject mxResult = C24.transform(parsedMessage, new biz.c24.io.transforms.swift.credittransfer.MT103_To_MXpacs00800101Transform());
			
			//Write out the Swift message as XML
			System.out.println("The transformed result:");
			C24.write(mxResult).to(System.out);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    }

}






