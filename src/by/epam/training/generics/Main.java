package by.epam.training.generics;

public class Main {

	public static void main(String[] args) {
		MyList<Number> marks = new MyArrayList<>();
		marks.add(5);
		marks.add(7);
		marks.add(6);
		marks.add(18);
		marks.add(2);
		System.out.println(marks);
		
		
		marks.sort();
		System.out.println(marks);
		
		marks.add(2,15);
		System.out.println(marks);
		
		marks.remove();
		System.out.println(marks);
		
			
		marks.remove(2);
		System.out.println(marks);
		
		
	}

}
