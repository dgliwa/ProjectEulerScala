package ProblemThree

/**
 * Created by tylerbobella on 9/4/14.
 */
class ProblemThree {

  def largeFac(n: Long): List[Long] ={
    (2 to math.sqrt(n).toInt).find(n % _ == 0).map(i => i.toLong :: largeFac(n/i)).getOrElse(List(n))
  }

}
