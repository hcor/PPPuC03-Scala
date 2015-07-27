package ac.ncic.syssw.pppuc03

object Palindrome {
  def isPalindrome(s: String): Boolean =
    (s.size >= 2) && {
      val p = s.replaceAll("[^\\p{L}]", "").toLowerCase
      //p == p.reverse

      @scala.annotation.tailrec
      def palindrome(s: String, begin: Int, end: Int): Boolean =
        if (begin >= end-1) true
        else if (s.charAt(begin) != s.charAt(end)) false
        else palindrome(s, begin+1, end-1)

      palindrome(p, 0, p.length-1)
    }
}

