package ac.ncic.syssw.pppuc03

object Dec2Oct {
  def dec2oct(num: Int) = {
    def loop(i: Int, dec: Int): String =
      if (i > 0) {
        val oct = loop(i - 1, dec / 8) + (dec % 8).toString
        oct
      }
      else  ""

    if (0 <= num && num <= 32767) loop(5, num)
    else "bad input!"
  }
}

