package curso

class  Vehiculo
{
  var cv: Int =_
  var bastidor: String =_

  def visualizarDatos(): Unit = {
    println(s"tiene $cv caballos y el numero de bastidor es $bastidor")
  }
}

class Coche extends Vehiculo
{
  var ruedas:Int=_

  def verDatosCoche: Unit ={
    println(s"El vehiculo tiene $ruedas ruedas")
  }
}

object  Pricipal {
  def main(args: Array[String]): Unit = {
    var coche1 = new Coche()
    coche1.cv = 100
    coche1.ruedas = 4
    coche1.visualizarDatos()
    coche1.verDatosCoche
  }
}
