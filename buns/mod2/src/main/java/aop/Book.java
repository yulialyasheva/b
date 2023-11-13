package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Робинзон Крузо")
    public String name;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Value("Даниэль Дефо")
    public String author;

    @Value("1719")
    public int yearOfPublication;

    public String getName() {
        return name;
    }
}
