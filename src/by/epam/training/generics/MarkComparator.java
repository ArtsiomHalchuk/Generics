package by.epam.training.generics;

import java.math.BigDecimal;
import java.util.Comparator;

public class MarkComparator<T extends Mark<?>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        Mark<?> o11 = o1;
        Mark<?> o22 = o2;
        BigDecimal b1 = new BigDecimal(o11.getMark().doubleValue());
        BigDecimal b2 = new BigDecimal(o22.getMark().doubleValue());
        return b2.compareTo(b1);
    }
}
