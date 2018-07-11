package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    if (size == capacity) {
      return false;
    }
    size++;
    rear = (rear + 1) % capacity;
    data[rear] = obj;
    return true;
  }

  @Override
  public E peek() {
    if (size > 0) {
      return data[front];
    } else {
      return null;
    }
  }

  @Override
  public E poll() {
    if (size > 0) {
      E obj = data[front];
      size--;
      front = (front + 1) % capacity;
      return obj;
    } else {
      return null;
    }
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    List list = new ArrayList<>(capacity);
    for (int i = 0; i < size; i++) {
      list.add(data[(front + i) % capacity]);
    }
    return list;
  }
}



