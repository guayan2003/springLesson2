package lab2.ex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class PrintBeforeAdvice {
	@Before("execution(* lab2.ex3.Product.*(..))")
	public void before(JoinPoint jointPoint) {
		System.out.println("This is before message: " + jointPoint.getSignature().getDeclaringTypeName() +
				"." + jointPoint.getSignature().getName()
				);
	}

}
