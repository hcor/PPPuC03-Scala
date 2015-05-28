package ac.ncic.pppuc03

object Dec2Oct {
  def dec2oct(num: Int) = {
    var dec = num
    var oct = ""
    if (0 <= dec && dec <= 32767) {
      for (i <- 1 to 5) {
        oct = (dec%8).toString + oct
        dec = dec / 8
      }
    }
    oct
  }
}

