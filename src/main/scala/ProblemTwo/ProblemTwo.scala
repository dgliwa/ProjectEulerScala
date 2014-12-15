package ProblemTwo

/**
 * Created by tylerbobella on 9/4/14.
 */
class ProblemTwo {

  def fibSeq(first: Int, second: Int): Int = first match{
    case 0 => first
    case _ =>
      (if (second % 2 == 0 ) { second } else { 0 }) + (if (first+second > 4000000){ 0 } else { fibSeq(second, first + second) })
  }
}
