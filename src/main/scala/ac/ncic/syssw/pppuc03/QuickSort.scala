package ac.ncic.syssw.pppuc03

def sort(xs: Array[Int]) {
  def swap(i: Int, j: Int) {
    val t = xs(i); xs(i) = xs(j); xs(j) = t;
//    ()    // pronounced as "unit"
  }

  def sortImpl(l: Int, r: Int) {
    val pivot = xs((l + r) / 2)
    var i = l; var j = r;
    while (i <= j) {
      while (xs(i) < pivot) i += 1
      while (xs(j) > pivot) j -= 1
      if (i <= j) {
        swap(i,j)
        j += 1; j -= 1;
      }
    }
    if (l < j) sortImpl(l, j)
    if (j < r) sortImpl(i, r)
  }

  sortImpl(0, xs.length - 1)
}

// a more functional implementation.
// same asymptotic complexity, but this requires more transient memory.
def sortF(xs: Array[Int]): Array[Int] = {
  if (xs.length <= 1) xs
  else {
    val pivot = xs(xs.length / 2)
    Array.concat(
      sortF(xs filter (pivot >)),
            xs filter (pivot ==),
      sortF(xs filter (pivot <)))
  }
}

