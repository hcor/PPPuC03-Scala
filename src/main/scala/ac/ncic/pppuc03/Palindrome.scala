package ac.ncic.pppuc03

object Palindrome {
  def isPalindrome(s: String): Boolean =
    (s.size >= 2) && {
      val p = s.replaceAll("[^\\p{L}]", "").toLowerCase;    // account for odd space and punctuation.
                                                            // note: `\p{L}` means charactors belonging to the 
                                                            // "letter" category.
 
      //p == p.reverse    // `reverse` is already implemented, so just call it; i know i'm lazy :)

      val len = p.length    // this is ugly, and is not functional at all.
      for (i <- 0 to len/2-1)
        if (p.charAt(i) != p.charAt(len-i-1)) return false
      return true
    }
}

