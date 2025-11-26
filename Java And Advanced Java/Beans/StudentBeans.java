import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class StudentBeans implements Serializable{
    public StudentBeans(){}

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

     public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    private int id;
    private String course;

    public void setId(int id){
         int oldId = this.id;
        this.id=id;
        pcs.firePropertyChange("id", oldId, id);
    }
    public void setCourse(String course){
        String oldcourse = this.course;
        this.course=course;
        pcs.firePropertyChange("course", oldcourse, course);
    }

    public int getId(){return id;}
    public String getCourse(){return course;}
}