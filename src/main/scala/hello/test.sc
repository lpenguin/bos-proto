class Foo(var x:String = "x", val y: String = "y"){
  def setX(v:String) = x = v
}

val f = new Foo(){
  setX("123")
}

def f(f1: Int => String) = println(f1(1))

f{
  (_) => "123"
}