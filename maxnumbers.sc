def maxfunc(a:Int, b:Int): Int = {
  val maxlist = List(a,b)
  maxlist.max
}
def get_max(x:Int,y:Int,f:(Int,Int) => Int) : Int = {
  f(x,y)
}

println(get_max(7,15,maxfunc))