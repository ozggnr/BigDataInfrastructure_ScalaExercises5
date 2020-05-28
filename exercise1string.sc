def greet1(s: String): String = {
  var greeting1 = "Hello " + s + ", How U Doin?"
  greeting1
}

def greet2(v: String): String = {
  var greeting2 = "Hello " + v + ", How are you doing?"
  greeting2
}

def framefunc(x: String, f: String => String): String = {
  f(x)
}
println(framefunc("Alice", greet1))
println(framefunc("Nick", greet2))