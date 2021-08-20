//19000962
object Bank extends App{

  var a1= new Account("a1",1,250)
  var a2= new Account("a2",2,-100)
  var a3= new Account("a3",3,300)
  var a4= new Account("a4",4,-200)
  var a5= new Account("a5",5,5000)


var bank:List[Account]=List(a1,a2,a3,a4,a5)

  val overdraft=(b:List[Account])=> b.filter(x=>x.balance<=0)
  val balance=(b:List[Account])=> b.map(x=>x.balance).reduce((x,y)=>x+y)
  val interest=(b:List[Account])=>b.map(x=>x.interest())

  println("__Q3__")
  println("__Before transfer__")
  println(a1)
  println(a3)
  a1.transfer(a3,100)
  println("__After transfer__")
  println(a1)
  println(a3)
  println()
  println()

  println("__Q4__")


  println("__Q4.1 List of Accounts with negative balances__")
  println(overdraft(bank))
  println()

  println("__Q4.2 Sum of all account balances__")
  println(balance(bank))
  println()

  println("__Q4.3 Interest__")
  println("__Before adding interest__")
  println(bank)
  interest(bank)
  println("__After adding interest__")
  println(bank)

  class Account(id:String,n:Int,b:Double){
    val nic:String = id
    val acnumber:Int = n
    var balance:Double = b

    override def toString: String = "["+nic+":"+acnumber+":"+balance+"]"

    def withdraw(a:Double) = this.balance = this.balance-a

    def deposit(a:Double) = this.balance = this.balance+a

    def transfer(a:Account,b:Double)= {
      this.withdraw(b)
      a.deposit(b)
    }

    def interest(): Unit ={
      if (this.balance>0) this.balance = this.balance * 1.05
      else this.balance = this.balance * 1.1
    }
  }
}
