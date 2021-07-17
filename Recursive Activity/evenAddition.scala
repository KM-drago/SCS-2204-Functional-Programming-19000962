//19000962
//Q5

object evenAddition extends App{
  def isEven(n:Int):Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(n: Int):Boolean = !(isEven(n))

  def sumEven(i: Int)={
    sumEvenUtil(i-1)
  }

  def sumEvenUtil(n:Int):Int=n match {
    case 0 => 0
    case x if isEven(x) => x + sumEvenUtil(n-1)
    case x if !isEven(x) => sumEvenUtil(n-1)
  }

  println(sumEven(10))
}
