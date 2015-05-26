package com.dawei.FirstApp

import android.graphics.Color
import org.scaloid.common._
import com.dawei.utils.QuickSort

class HelloAndroid extends SActivity {

  onCreate {
    val data = QuickSort.randomData(10, 1000)
    val sorted = QuickSort.sort(data)
    val text = sorted.toString()
    contentView = new SVerticalLayout {
      style {
        case b: SButton => b.textColor(Color.RED).onClick(toast("Bang!"))
        case t: STextView => t textSize 10.dip
        case e: SEditText => e.backgroundColor(Color.YELLOW).textColor(Color.BLACK)
      }
      STextView("I am 10 dip tall")
      STextView("Me too")
      STextView("I am 15 dip tall") textSize 15.dip // overriding
      this += new SLinearLayout {
        STextView("Button: ")
        SButton(R.string.wei)
      }.wrap
      SEditText(text).fill
    } padding 20.dip
  }

}
