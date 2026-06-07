package com.grupo2.espol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AuditoriaAspect{
    @Around("execution(* com.grupo2.espol.AdapterTemperatura.obtenerTemperaturaCelsius(..))")
    public Object auditoriaSensor(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[MANAGEMENT SYSTEM] INICIANDO");
        Object resultado = joinPoint.proceed();
        double temperatura = (double) resultado;
        System.out.println("[MANAGEMENT SYSTEM] Temperatura obtenida: " + temperatura + "°C");
        
        if (temperatura > 30.0) {
            System.out.println("[MANAGEMENT SYSTEM] Temperatura elevada detectada");
        }
        return resultado;
    }
}
