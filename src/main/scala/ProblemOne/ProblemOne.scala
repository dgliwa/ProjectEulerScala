package ProblemOne

/**
 * Created by tylerbobella on 9/4/14.
 */
class ProblemOne {

  def multipleSum(nums: Int) = {
    (1 until nums).filter(n => n % 3 == 0 || n % 5 == 0).foldLeft(0)(_+_)
  }

}
