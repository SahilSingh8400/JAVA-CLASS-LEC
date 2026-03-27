package annotationinjava;

// File: RepeatAnnotationDemo.java

import java.lang.annotation.*;

// Step 1: Create Repeatable Annotation
@Repeatable(Roles.class)
@interface Role {
    String value();
}

// Step 2: Create Container Annotation
@interface Roles {
    Role[] value();
}

// Applying Repeated Annotation
@Role("Admin")
@Role("User")
public class RepeatAnnotationDemo {

    public static void main(String[] args) {

        Class<RepeatAnnotationDemo> c = RepeatAnnotationDemo.class;

        // Getting repeated annotations
        Role[] roles = c.getAnnotationsByType(Role.class);

        System.out.println("Roles Assigned:");

        for (Role r : roles) {
            System.out.println(r.value());
        }
    }
}
