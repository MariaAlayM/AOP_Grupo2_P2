package Singleton.AOP.impresoraaop.Usuario;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class SingletonAspect {

    private static GestorImpresora instancia;

    @Around("call(GestorImpresora.new(..))")
    public Object singleton(ProceedingJoinPoint pjp) throws Throwable {

        if (instancia == null) {
            instancia = (GestorImpresora) pjp.proceed();
        }

        return instancia;
    }
}