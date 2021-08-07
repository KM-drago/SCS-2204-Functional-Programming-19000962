object caesarCipher extends App{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

  val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+(alphabet.size-key))%a.size)

  val cipher = (algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

  val s = "Hello"

  val ct = cipher(E,s,5,alphabet)
  println("Encrypted: "+ct)

  val pt = cipher(D,ct,5,alphabet)
  println("Decrypted: "+pt)
}
