val numbers = (1 to 45).toList
println(numbers.filter(_ % 4 == 0).sum)
val alist = numbers.filter((x:Int)=> x %3 == 0 && x < 20 )
println(alist)
def square(a:Int): Int = { a * a}
println(alist.map(x => square(x)))
println(alist.map(x => square(x)).sum)
