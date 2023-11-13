package aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExсeptionHandlingAspect {
    @Before("aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExсeptionHandlingAdvice(){
        System.out.println("beforeGetExсeptionHandlingAdvice: ловим/обрабатываем " +
                "исключения при попытке получить книгу/журнал");
        System.out.println("----------------------------");
    }
}
