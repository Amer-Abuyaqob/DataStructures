package com.abuyaqob.datastructures.lists;

import com.abuyaqob.datastructures.Collection;

/**
 * An ordered collection (sequence) of elements.
 * @param <T> the type of elements in this list
 */
public interface List<T> extends Collection<T> {
    /**
     * Appends the specified element to the end of this list.
     * Time Complexity: O(n) for linked lists, O(1) amortized for array lists.
     */
//    void add(T element);

    /**
     * Returns the element at the specified position in this list.
     * Time Complexity: O(n) for linked lists, O(1) for array lists.
     */
//    T get(int index);

    /**
     * Removes the first occurrence of the specified element from this list.
     * Time Complexity: O(n).
     */
//    boolean remove(T element);
}
