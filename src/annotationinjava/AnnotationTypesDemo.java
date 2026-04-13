package annotationinjava;

// File: AnnotationTypesDemo.java

// Creating custom annotation
@interface Student {
    String name();
    int age();
}

class Demo {

    // Marker Annotation
    @Override
    public String toString() {
        return "This is Marker Annotation Example";
    }

    // Single Value Annotation
    void show() {
        System.out.println("Single Value Annotation Example");
    }
}

// Using Multi-Value Annotation
@Student(name = "Sahil", age = 20)
public class AnnotationTypesDemo {

    public static void main(String[] args) {

        Demo obj = new Demo();

        // Marker Annotation effect
        System.out.println(obj.toString());

        // Single value annotation
        obj.show();

        // Accessing Multi-value annotation using Reflection
        Class<AnnotationTypesDemo> c = AnnotationTypesDemo.class;

        Student s = c.getAnnotation(Student.class);

        System.out.println("Name: " + s.name());
        System.out.println("Age: " + s.age());
    }
}
