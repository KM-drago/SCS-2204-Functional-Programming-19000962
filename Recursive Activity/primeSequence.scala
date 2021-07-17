//19000962
//Q2

object primeSequence extends App{

  def isPrime(p:Int, n:Int=2):Boolean = n match {
    case x if x==p => true
    case x if gcd(p,x)>1 => false
    case x => isPrime(p,x+1)
  }

  def gcd(z:Int, y:Int):Int = y match {
    case 0 => z
    case x if x>z => gcd(x,z)
    case _ => gcd(y,z%y)
  }

  def primeSeq(n:Int) ={
    primeSeqUtil(n-1)
  }

  def primeSeqUtil(n:Int):Any={
    if (n>1){
      primeSeqUtil(n-1)
      if (isPrime(n)) println(n)
    }
  }

  primeSeq(7)
}
