package ac.ncic.syssw.pppuc03

case class Vector3D(x: Double, y: Double, z: Double) {
  def dot(v: Vector3D): Double = x*v.x + y*v.y + z*v.z
  def cross(v: Vector3D) = Vector3D(y*v.z - z*v.y, z*v.x - x*v.z, x*v.y - y*v.x)
  def scalarTriple(v1: Vector3D, v2: Vector3D) = this dot (v1 cross v2)
  def vectorTriple(v1: Vector3D, v2: Vector3D) = this cross (v1 cross v2)
}

