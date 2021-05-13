object wholesalecost extends App{
  def calculateCost(x:Int):Double=24.95*.6*x+(if(x>50) 50*3+(x-50)*.75 else x*3)

  println(calculateCost(60))
}
