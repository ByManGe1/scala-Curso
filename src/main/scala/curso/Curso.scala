package curso

class Curso (var v_parametro:Int){
  var v_publica: Int = 0
  private var v_privada:Int = 0
  protected var v_protected: Int = 0
}

class Asignatura extends Curso(v_parametro = 0) {
  var z: Int=0
}

object principal
{
  def main (args: Array[String]): Unit = {
    var curso1 = new Curso(v_parametro = 100)
    curso1.v_publica = 10
  }
}