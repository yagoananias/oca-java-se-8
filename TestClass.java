import java.io.*;
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.logging.*;

public class TestClass {
  public static void main(String[] args) throws IOException {
    
    /* Assegura que o diretório seja criado */
    Files.createDirectories(Paths.get("logs"));
    
    /* Obtem a data a ser usada no nome do arquivo */
    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
    LocalDateTime now = LocalDateTime.now();
    String date = now.format(df);
    
    /* Define o nome do arquivo no diretório logs */
    String logFileName = "logs\\testlog=" + date + ".txt";
    
    /* Define Logger */
    FileHandler myFileHandler = new FileHandler(logFileName);
    myFileHandler.setFormatter(new SimpleFormatter());
    Logger ocajLogger = Logger.getLogger("OCAJ Logger");
    ocajLogger.setLevel(Level.ALL);
    ocajLogger.addHandler(myFileHandler);
    
    /* Mensagem de Log */
    ocajLogger.info("This is a logged information message. ");
    
    /* Fecha o arquivo */
    myFilleHandler.close();
  }
}
