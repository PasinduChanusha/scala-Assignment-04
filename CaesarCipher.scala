object CaesarCipher extends App{
	
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val Enc=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

	val Dec=(c:Char,key:Int,a:String)=>if ((a.indexOf(c.toUpper)-key)>=0) a((a.indexOf(c.toUpper)-key)%a.size) else (a((a.indexOf(c.toUpper)-key)%a.size+26))
	
	val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

	val s="PASINDU"

	val ct=cipher(Enc,s,5,alphabet)
	println(ct)

	val pt=cipher(Dec,ct,5,alphabet)
	println(pt)

}

