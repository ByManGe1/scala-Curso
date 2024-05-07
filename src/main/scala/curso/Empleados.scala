package curso

class Empleado {
  println("Estoy en el constructor primario")
  private var nombre: String = _
  private var direccion: String =_
  private var edad: Int = 0

  def imprimir(): Unit = {
    println(s"El empleado se llama $nombre, vive en $direccion y tiene $edad años")
  }

  // Constructor primario
  def this(nombre: String)= {
    this()
    this.nombre = nombre
  }


  def this(nombre: String, direccion: String, edad: Int)= {
    this(nombre)
    this.direccion = direccion
    this.edad = edad
  }
}

object Principal3
{
  def main(args: Array[String]):Unit = {
    var empleado1 = new Empleado(nombre = "rosa")
    empleado1.imprimir()
    var empleado2 = new Empleado (nombre = "pedro", direccion = "colombia", edad = 40)
    empleado2.imprimir()
  }
}
