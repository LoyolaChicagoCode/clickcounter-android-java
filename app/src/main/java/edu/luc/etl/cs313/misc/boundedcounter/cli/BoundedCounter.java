package edu.luc.etl.cs313.misc.boundedcounter.cli;

/**
 * A bounded counter abstraction. Dependency inversion principle (DIP): The client (CLI app) owns
 * this abstraction.
 */
// begin-interface-BoundedCounter
public interface BoundedCounter {

  /**
   * Increments the counter.
   *
   * Precondition: the counter is not full.
   * Postcondition: the counter is not empty.
   */
  void increment();

  /**
   * Decrements the counter.
   *
   * Precondition: the counter is not empty.
   * Postcondition: the counter is not full.
   */
  void decrement();

  /**
   * Returns the current counter value.
   *
   * @return the current counter
   */
  int get();

  /**
   * Indicates whether the counter is full, i.e., at its maximum value.
   *
   * @return whether the counter is full
   */
  boolean isFull();

  /**
   * Indicates whether the counter is empty, i.e., at its minimum value.
   *
   * @return whether the counter is empty
   */
  boolean isEmpty();
}
// end-interface-BoundedCounter
