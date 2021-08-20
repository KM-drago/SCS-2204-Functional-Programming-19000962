//19000962
object RationalApp extends App {
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  //Q2
  val r1 = x-y-z
  print(r1)
}

//Q1
class Rational(n:Int,d:Int){
  require(d>0,"Denominator must be greater than zero")

  def numer = n/gcd(n.abs,d.abs)
  def denom = d/gcd(n.abs,d.abs)
  def this(n:Int)=this(n,1)

  private def gcd(a:Int,b:Int):Int = if (b==0) a else gcd(b,a%b)

  def +(r: Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, this.denom * r.denom)

  def neg = new Rational(-this.numer,this.denom)

  def -(r:Rational) = new Rational(this.numer * r.denom - this.denom * r.numer , this.denom * r.denom)

  override def toString: String = numer+"/"+denom
}
