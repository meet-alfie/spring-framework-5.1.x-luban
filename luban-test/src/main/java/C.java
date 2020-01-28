import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class C {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(A.class);
		System.out.println(ac.getBean(A.class));
	}
}

