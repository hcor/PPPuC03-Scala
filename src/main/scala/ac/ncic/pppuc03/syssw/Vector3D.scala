package ac.ncic.pppuc03.syssw

case class Vector3D(x: Double, y: Double, z: Double) {
  def dot(v: Vector3D): Double = x*v.x + y*v.y + z*v.z;
  def cross(v: Vector3D) = Vector3D(y*v.z - z*v.y, z*v.x - x*v.z, x*v.y - y*v.x)
  def scalarTriple(v1: Vector3D, v2: Vector3D) = this dot (v1 cross v2)
  def vectorTriple(v1: Vector3D, v2: Vector3D) = this cross (v1 cross v2)
}

/*object VectorProd {
  def readDouble(): Double = {    // this is ugly; i don't know how to do the scanf stuff in scala.
    val s = readLine()
    if (s == null)
      throw new java.io.EOFException("EOF!")
    else
      s.toDouble
  }
  def main(args: Array[String]): Unit = {
    //val a = Vector3D(3, 4, 5); val b = Vector3D(4, 3, 5); val c = Vector3D(-5, -12, -13)
    val a = Vector3D(readDouble(), readDouble(), readDouble())
    val b = Vector3D(readDouble(), readDouble(), readDouble())
    val c = Vector3D(readDouble(), readDouble(), readDouble())
    println("      a . b : " + (a dot b))
    println("      a x b : " + (a cross b))
    println("a . (b x c) : " + (a scalarTriple(b, c)))
    println("a x (b x c) : " + (a vectorTriple(b, c)))    
  }
}*/

