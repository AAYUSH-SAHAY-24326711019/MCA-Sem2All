public class TestBoundBean {
    public static void main(String[] args) {
        StudentBeans sb = new StudentBeans();

        // Add property change listener
        sb.addPropertyChangeListener(evt -> {
            System.out.println("Property changed: " + evt.getPropertyName());
            System.out.println("Old value: " + evt.getOldValue());
            System.out.println("New value: " + evt.getNewValue());
        });

        // Change properties
        sb.setId(101);
        sb.setCourse("Computer Science");
        sb.setId(103);
        sb.setCourse("ESE");
    }
}
