/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.beans;
import java.io.IOException;
import java.sql.SQLException;
import org.apache.log4j.Logger;  
import org.apache.log4j.Level;
import org.apache.log4j.NDC;
/**
 *
 * @author deepd
 */
public class example{
//    static Logger log = Logger.getLogger(example.class.getName());  
//     
//   public static void main(String[] args)throws IOException,SQLException{  
//      log.debug("Hello this is a debug message");  
//      log.info("Hello this is an info message");  
//   } 
//    private static Logger log = Logger.getLogger(example.class);
// 
//    public static void main(String[] args) {
// 
//        log.debug("This is debug method");
//        log.info("This is info method");
//        log.error("This is error method");
// 
//        log.log(Level.DEBUG, "This is debug from Level.DEBUG");
//        log.log(Level.INFO, "This is info from Level.INFO");
//        log.log(Level.ERROR, "This is error from Level.ERROR");
// 
//    }
    static Logger log = Logger.getLogger(example.class.getName());
	
	public static void main(String[] args) throws IOException, SQLException {                      

		NDC.push("Deep ");
		log.fatal("This is a fatal message for log4j");
		log.error("This is an error message for log4j");
		log.debug("This is an debug message for log4j");
		log.warn("This is a warning message for log4j");
		log.info("This is an info message for log4j");
		
	}
}
