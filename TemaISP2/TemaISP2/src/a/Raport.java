package a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Raport {
	Turist t;
	Raport(){}
	
public void assignRaport(Turist t) {
this.t=t;	
salveazaIstoric();
}
void salveazaIstoric(){
	Logger logger = Logger.getLogger("MyLog");  
    FileHandler fh;  

    try {  

         
    	fh = new FileHandler("C:/Users/Andrei Ulinici/Documents/GitHub/proiectISP/TemaISP2/TemaISP2/src/Raport1.log");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
        logger.info("Nume turist:"+t.Nume);
        logger.info("Prenume turist:"+t.Prenume);
        logger.info("Varsta turist:"+t.varsta);
        logger.info("CNP:"+t.CNP);
        if (t.haveInstructor){
        	logger.info("Instructor:"+t.Instructor.Nume+" "+t.Instructor.Prenume+" "+t.Instructor.varsta);
        	logger.info("CodInstructor:"+t.Instructor.code);
        }
        if (t.haveAccess) {
        	logger.info("Date Acces");
        	logger.info("Cod Cartela:"+t.Access.codCartela);
        	logger.info("Pret Cartela:"+t.Access.pret);
        	logger.info("CodTurist:"+t.Access.codTurist);	
        	
        }
        logger.info("Transport:"+t.Transport.tipTransport);
       
        logger.info("Traseu turist:"+t.traseu);
        double x=t.calculDistantaParcursa();
        logger.info("Distanta parcursa de turist:"+x+"m");
        
       // logger.info("Transport:"+t.Transport);

    
    	} catch (SecurityException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    }  

}



}
