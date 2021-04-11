package com.datastructure;

/**
 * Structure for key-value entries for data structure {@link KeyValueDS}.
 *
 * @param <Integer>
 * @param <String>
 */
public class KeyValueEntry<Integer, String> {

  private final Integer key;
  private String value;

  public KeyValueEntry(Integer key, String value) {
    this.key = key;
    this.value = value;
  }

  /**
   * Returns key in the entry
   *
   * @return key
   */
  public Integer getKey() {
    return key;
  }

  /**
   * Returns value in the entry
   *
   * @return value
   */
  public String getValue() {
    return value;
  }

  /**
   * Set value in the entry
   *
   * @param value
   */
  public void setValue(String value) {
    this.value = value;
  }
}
