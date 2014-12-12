package datastructs;

import org.eclipse.emf.common.util.EList;

import java.util.ArrayList;

/**
 * Created by wilhelm 2014-12-12.
 */
public class EArrayList<E> extends ArrayList<E> implements EList<E> {
    @Override
    public void move(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E move(int i, int i1) {
        throw new UnsupportedOperationException();
    }
}
