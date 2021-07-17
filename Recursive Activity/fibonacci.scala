//19000962
//Q6

object fibonacci extends App{
  def fib(n:Int):Int=n match {
    case 0 => 0
    case 1 => 1
    case x => fib(n-1) + fib(n-2)
  }

  def fibSeq(n:Int):Any ={
   if (n>0) fibSeq(n-1)
   println(fib(n))
  }

  fibSeq(10)
}


