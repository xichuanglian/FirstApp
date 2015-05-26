package com.dawei.utils

import scala.util.Random

object QuickSort {
  def randomData(n: Int, m: Int):List[Int] = n match {
    case x if x > 0 => randomData(n - 1, m) :+ Random.nextInt(m)
    case _ => List()
  }

  def sort(list: List[Int]):List[Int] = list match {
    case x :: xs =>
      val small = xs.filter((e) => e <= x)
      val large = xs.filter((e) => e > x)
      sort(small) ++ List(x) ++ sort(large)
    case _ => List()
  }
}
