package springaop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice

	//@Before("execution(public void addAccount())")
	//@Before("execution(public void springaop.dao.AccountDAO.addAccount())")
	//@Before("execution(public void add*())")
	//@Before("execution(void add*())")  //Match on return type-Only void
	//@Before("execution(* add*())") //Any return type
	//@Before("execution(* add*(springaop.demo.Account))") -Only for Account parameter
	//@Before("execution(* add*(springaop.demo.Account, .. ))")
	//@Before("execution(* add*(..))") -for matching all types of parameter
	@Before("execution(* springaop.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on method");
		
	}
}










