package by.epam.training.generics;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<T extends Number> implements MyList<T> {
	
	private Object[] myArrayList;
	private int index = 0;
	
	public MyArrayList() {
		this.myArrayList = new Number[0];
	}

	@Override
	public void add(T obj) {
		if (index>= myArrayList.length) {
			Object[] temp = myArrayList;
			myArrayList = new Object[temp.length + 1];
			System.arraycopy(temp, 0,  myArrayList,  0,  temp.length);
		}
		myArrayList[index] = obj;
		index++;
		
	}

	@Override
	public void add(int i, T obj) {
		if (index >= myArrayList.length) {
			Object[] temp = myArrayList;
			myArrayList = new Object[temp.length + 1];
			System.arraycopy(temp, 0, myArrayList, 0, i);
			int tempIndex = temp.length - i;
			System.arraycopy(temp, i, myArrayList, i+1, tempIndex);	
		}
		myArrayList[i] = obj;
		index++;
	}

	@Override
	public T remove() {
		T itemToRemove = (T) myArrayList[myArrayList.length - 1];
		Object[] temp = myArrayList;
		myArrayList = new Object[temp.length - 1];
		System.arraycopy(temp, 0, myArrayList, 0, temp.length - 1);
		index--;
		return itemToRemove;
		
	}

	@Override
	public T remove(int i) {
		T itemToRemove = (T) myArrayList[i];
		Object[] temp = myArrayList;
		myArrayList = new Object[temp.length - 1];
		System.arraycopy(temp, 0, myArrayList, 0, i);
		int tempIndex = temp.length - i - 1;
		System.arraycopy(temp,  i+1,  myArrayList,  i,  tempIndex);
		index--;
		return itemToRemove;
		
	}

	@Override
	public void sort() {
		Arrays.sort(myArrayList, 0, index);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void sort(Comparator<?> comparator) {
        Comparator<? super T> comp = (Comparator<? super T>) comparator;
        Arrays.sort((T[]) myArrayList, 0, index, comp);
    }

	@Override
	public String toString() {
		return "MyArrayList [myArrayList=" + Arrays.toString(myArrayList) + ", index=" + index + "]";
	}

}
