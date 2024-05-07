package curso

trait Trait1
{
  var edad: Int=_
  def Imprimir(nombre:String) : Unit
  def Imprimir1: Unit = {
    println("Metodo implementado en el trait")
  }
}

class Persona extends Trait1
{
  def Imprimir (nombre:String): Unit = {
    println(nombre.toUpperCase)
  }

   override def Imprimir1: Unit = {
    println("Estoy en la clase")
  }
}

object  Principal {
  def main(args: Array[String]): Unit = {
    var persona1 = new Persona()
    persona1.Imprimir("alberto")
    persona1.Imprimir1
    persona1.edad = 20
    println(persona1.edad)
  }
}
