package com.abuyaqob.datastructures;

/**
 * The root interface for all data structures in this package.
 * @param <T> the type of elements in the collection
 */
public interface Collection<T> {
    /**
     * Returns the number of elements in this collection.
     * Time Complexity: O(1)
     */
    int size();

    /**
     * Checks if this collection is empty.
     * Time Complexity: O(1)
     */
    boolean isEmpty();

    /**
     * Removes all elements from this collection.
     * Time Complexity: O(n)
     */
    void clear();
}
