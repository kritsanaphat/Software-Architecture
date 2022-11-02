package creational;


// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.List;

// import org.json.simple.JSONArray;
// import org.json.simple.JSONObject;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {



    // private JSONObject temp;
    // private JSONArray books;
    private List books;

    public JSONBookMetadataFormatter() {
        reset();
    }


    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        this.books  = new LinkedList();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b){
        // Please implement this method. You may create additional methods as you see fit.
        // temp.put("id", b.getISBN());
        // temp.put("title", b.getTitle());
        // temp.put("publisher", b.getPublisher());
        
        // JSONArray author = new JSONArray();
        // for (String author1 : b.getAuthors()) {
        //     author.add(author1);
        // }
        // temp.toJSONString();
        // temp.put("author", author);
        // return this; 
        Map map = new LinkedHashMap();
        map.put("id", b.getISBN());
        map.put("title", b.getTitle());
        map.put("publisher", b.getPublisher());
        List authors = new LinkedList();

        for(String author : b.getAuthors()){
            authors.add(author);
        }

        map.put("authors", authors);

        books.add(map);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        // return temp.toJSONString();
        return JSONValue.toJSONString(books);

    }
}
