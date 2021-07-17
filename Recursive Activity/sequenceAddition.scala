//19000962
//Q3

object sequenceAddition extends App{
  def sum(n:Int):Int=n match {
    case x if x<0 => -1
    case 1 => 1
    case _ => n + sum(n-1)
  }

  println(sum(5))
}
