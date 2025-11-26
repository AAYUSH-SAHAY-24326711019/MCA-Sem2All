import java.beans.*;


public class Introspect {
    public static void main(String[] args)  {
        try{
       BeanInfo info = Introspector.getBeanInfo(StudentBeans.class);

       for(PropertyDescriptor pd:info.getPropertyDescriptors()){
        System.out.println(pd.getName());
       }

       for(MethodDescriptor md:info.getMethodDescriptors()){
        System.out.println(md.getName());
       }
        }
        catch(IntrospectionException e){
            e.getStackTrace();
        }
    }
}
