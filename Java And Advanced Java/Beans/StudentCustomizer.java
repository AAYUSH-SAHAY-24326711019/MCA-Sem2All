 import java.awt.*; 
import java.beans.*; 
public class StudentCustomizer extends Panel implements Customizer { 
private StudentBeans bean; 
private TextField idField = new TextField(10); 
public StudentCustomizer() { 
setLayout(new FlowLayout()); 
add(new Label("Id:")); 
add(idField); 
idField.addTextListener(e -> bean.setId(Integer.parseInt(idField.getText()))); 
} 
@Override 
public void setObject(Object bean) { 
this.bean = (StudentBeans) bean; 
} 
}  
