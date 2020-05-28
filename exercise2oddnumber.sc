val listed = List(1,2,3,4,5,6,7,8,9)
val oddNumber = listed.filter( _%2 != 0)
println(oddNumber)
def factfunct(x: Int) : Int = {
  if (x==0) 1
  else x * factfunct(x-1)
}
//oddNumber.map(x=> factfunct(x)).foreach(y => println(y))
for (x <- oddNumber.map(x=> factfunct(x))) println(x)
