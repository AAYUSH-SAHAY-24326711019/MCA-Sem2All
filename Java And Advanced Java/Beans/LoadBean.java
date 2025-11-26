import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadBean {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new 
FileInputStream("student.ser"));
            StudentBeans s = (StudentBeans)in.readObject();
            System.out.println("id :"+s.getId());
            System.out.println("course :"+s.getCourse());


    }
}
