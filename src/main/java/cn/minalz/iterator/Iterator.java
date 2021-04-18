package cn.minalz.iterator;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 22:56
 **/
public interface Iterator<E> {

    E next();

    boolean hasNext();
}
