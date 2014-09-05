package ProblemThree

/**
 * Created by tylerbobella on 9/4/14.
 */
object ProblemThreeObject {

  def main(args: Array[String]): Unit ={
    val functionalProblemThree = new ProblemThree

    functionalProblemThree.largeFac(600851475143L)
    println(functionalProblemThree.largeFac(600851475143L).last)
  }

}
