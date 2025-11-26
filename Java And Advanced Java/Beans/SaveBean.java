import java.io.*; 
public class SaveBean { 
public static void main(String[] args) throws Exception { 
StudentBeans s = new StudentBeans(); 
s.setId(102); 
s.setCourse("ESE"); 
ObjectOutputStream out = new ObjectOutputStream(new 
FileOutputStream("student.ser")); 
out.writeObject(s); 
out.close(); 
System.out.println("Bean saved."); 
} 
} 