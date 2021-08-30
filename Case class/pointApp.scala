//19000962

object pointApp extends App {
  def distance(a:Point,b:Point)=scala.math.sqrt(scala.math.pow((a.x-b.x),2)+scala.math.pow((a.y-b.y),2))

  val p1=Point(2,3)
  val p2=Point(5,6)
  println("p1: " +p1)
  println("p1: " +p2)
  val p3=p1.move(3,5)
  println("(2,3) moved by (3,5): "+p3)
  val p4 = p2.invert()
  println("(5,6) inverted: "+ p4)
  val p5 = p1+p2
  println("(2,3) + (5,6) = "+p5)
  println("Distance between (2,3) and (5,6): "+distance(p1,p2))
}

case class Point(a:Int, b:Int){
  def x:Int=a
  def y:Int=b

  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  def invert()=Point(this.y,this.x)
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
}
