package ProblemFour

/**
 * Created by tylerbobella on 10/14/14.
 */
class ProblemFour {

  def largestPalindromeAnswer = {
    var largestPal = 0

    for (i <- 100 to 999; j <- 100 to 999) {
      val setToString = (i * j).toString
      if (setToString == setToString.reverse){
        if ( largestPal < i * j) largestPal = i * j
      }
    }
    largestPal
  }
}
