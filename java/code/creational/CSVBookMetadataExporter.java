package creational;

import java.io.PrintStream;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    private CSVBookMetadataFormatter csvBookMetadataFormatter;

    public CSVBookMetadataExporter(){
        try {
            csvBookMetadataFormatter = new CSVBookMetadataFormatter();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
            
    }
    public void export(PrintStream stream ){
        for(Book book:books){
            csvBookMetadataFormatter.append(book);
        }
        stream.println(csvBookMetadataFormatter.getMetadataString());
    }
    
}
