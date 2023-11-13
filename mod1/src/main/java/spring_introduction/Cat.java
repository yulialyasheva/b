package spring_introduction;

import org.springframework.stereotype.Component;


public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
