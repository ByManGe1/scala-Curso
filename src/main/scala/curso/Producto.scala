package curso

class Producto (var cod_producto:Int, var nombre:String) {
  println("Estoy en el costructor")
  private var pvp:Int=0

  def this(cod_producto:Int, nombre:String, pvp:Int)=
  {
    this(cod_producto, nombre)
    this.pvp = pvp
  }

  def imprimir(): Unit = {
    println(s"El codigo es $cod_producto y se llama $nombre y cuesta $pvp")
  }
  println("Sigo en el costructor")
}

object Principal1 {
  def main(args: Array[String]):Unit = {
    var producto1 = new Producto(cod_producto = 10, nombre = "Tornillos")
    producto1.imprimir()
    producto1.nombre="tuercas"
    producto1.imprimir()
    var producto2 = new Producto(100, "Matillos", pvp = 90)
    producto2.imprimir()
  }
}