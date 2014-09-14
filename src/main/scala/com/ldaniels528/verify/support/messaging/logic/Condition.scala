package com.ldaniels528.verify.support.messaging.logic

/**
 * Represents a message matching condition
 * @author Lawrence Daniels <lawrence.daniels@gmail.com>
 */
trait Condition {

  /**
   * Indicates whether the given message (and/or key) satisfies the condition
   * @param message the given message
   * @param key the given key
   * @return true, if the given message (and/or key) satisfies the condition
   */
  def satisfies(message: Array[Byte], key: Array[Byte]): Boolean

}
