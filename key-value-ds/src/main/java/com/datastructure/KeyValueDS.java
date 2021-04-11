package com.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Key-Value data structure to store data as Key-Value pair where key is unique and value can be
 * same for multiple entries.
 *
 * @param <Integer> Key
 * @param <String>  Value
 */
public class KeyValueDS<Integer, String> {

  private int size;
  private int DEFAULT_CAPACITY = 16;
  private KeyValueEntry<Integer, String>[] keyValueEntries = new KeyValueEntry[DEFAULT_CAPACITY];


  /**
   * Method to retrieve value with giving key as input. If no key found value will be returned as
   * null.
   *
   * @param key input for which value should be returned
   * @return value retrieved
   */
  public String get(Integer key) {
    for (int i = 0; i < size; i++) {
      if (keyValueEntries[i] != null) {
        if (keyValueEntries[i].getKey().equals(key)) {
          return keyValueEntries[i].getValue();
        }
      }
    }
    return null;
  }

  /**
   * Method to insert new key-value pair inside the data structure. If the key is already present we
   * will replace the existing value with new value.
   *
   * @param key   to be inserted
   * @param value to be inserted
   */
  public void put(Integer key, String value) {
    boolean insert = true;
    for (int i = 0; i < size; i++) {
      if (keyValueEntries[i].getKey().equals(key)) {
        keyValueEntries[i].setValue(value);
        insert = false;
      }
    }
    if (insert) {
      checkCapacity();
      keyValueEntries[size++] = new KeyValueEntry<>(key, value);
    }
  }

  /**
   * Checks for the capacity, if the capacity is full we increase the array size.
   */
  private void checkCapacity() {
    if (size == keyValueEntries.length) {
      int newSize = keyValueEntries.length * 2;
      keyValueEntries = Arrays.copyOf(keyValueEntries, newSize);
    }
  }

  /**
   * Returns the list of all the keys present in the data structure.
   *
   * @return list of keyss
   */
  public List<Integer> keySet() {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(keyValueEntries[i].getKey());
    }
    return list;
  }
}
