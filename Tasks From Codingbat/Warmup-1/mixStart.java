public boolean mixStart(String str) {
  return str.matches("((.)|(m))(ix.*)");
}

// или

public boolean mixStart(String str) {
  return str.matches("(.)ix.*|(m)ix.*");
}

// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


// mixStart("mix snacks") → true
// mixStart("pix snacks") → true
// mixStart("piz snacks") → false

// https://codingbat.com/prob/p151713
