package creational;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

class JsonDemo {
   public static void main(String[] args) throws IOException {
      JSONArray students = new JSONArray(); 
      students.add(new Student(1,"Robert")); 
      students.add(new Student(2,"Julia")); 
      StringWriter out = new StringWriter();
      students.writeJSONString(out); 
      System.out.println(out.toString());     
   }
}
class Student implements JSONStreamAware {
   int rollNo;
   String name;

   Student(int rollNo, String name){
      this.rollNo = rollNo;
      this.name = name;
   }
   @Override
   public void writeJSONString(Writer out) throws IOException {
      Map obj = new LinkedHashMap();
      obj.put("name", name);
      obj.put("rollNo", new Integer(rollNo));
      JSONValue.writeJSONString(obj, out);        
   }    
}