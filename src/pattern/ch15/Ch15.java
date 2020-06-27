package pattern.ch15;

import java.util.ArrayList;

public class Ch15 {
	public static void main(String[] args) {
		System.out.println("hello world");
		
		VisitorA visitor = new VisitorA();
		
		ArrayList<Visitable> visitables = new ArrayList<Visitable>();
		
		visitables.add(new VisitableA(1));
		visitables.add(new VisitableA(2));
		
		visitables.stream().forEach(visitable -> {
			visitable.accept(visitor);
		});
		
		System.out.println("v1.getAge() :: " + visitor.getAgeSum());
	}
}
