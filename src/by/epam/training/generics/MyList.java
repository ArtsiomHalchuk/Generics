package by.epam.training.generics;

import java.util.Comparator;

public interface MyList<T extends Number>{
	void add(T obj);
	void add(int i, T obj);
	T remove();
	T remove(int i);
	void sort();
	void sort(Comparator<?> comparator);

	
}
