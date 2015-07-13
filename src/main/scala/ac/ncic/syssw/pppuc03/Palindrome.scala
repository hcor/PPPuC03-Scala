package ac.ncic.syssw.pppuc03

object Palindrome {
  def isPalindrome(s: String): Boolean =
    (s.size >= 2) && {
      val p = s.replaceAll("[^\\p{L}]", "").toLowerCase;

      //p == p.reverse

      val len = p.length
      for (i <- 0 until len/2)
        if (p.charAt(i) != p.charAt(len-i-1)) return false
      return true
    }
}

