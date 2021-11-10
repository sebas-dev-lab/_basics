package practice;

public class DnaStrand {
  public String makeComplement(String dna) {
    // Your code
    String res = "";
    for (int i = 0; i < dna.length(); i++) {
      char c = dna.charAt(i);
      if (c == 'A') {
        res = res + 'T';
      } else if (c == 'T') {
        res = res + 'A';
      } else if (c == 'C') {
        res = res + 'G';
      } else if (c == 'G') {
        res = res + 'C';
      }
    }
    return res;
  }
}