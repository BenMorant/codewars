package org.benmor;

public class DigPow {
  public static long digPow(int n, int p) {
    String temp = Integer.toString(n);
    int[] numbers = new int[temp.length()];
    for (int i = 0; i < temp.length(); i++) {
      numbers[i] = temp.charAt(i) - '0';
    }
    long pows = 0;
    for (int number : numbers) {
      long pow = (long) Math.pow(number, p);
      p++;
      pows += pow;
    }
    return pows % n == 0 ? pows / n : -1;
  }

  //    public static long digPow(int n, int p) {
  //        long temp = 0;
  //        String[] value = String.valueOf(n).split("");
  //        for (int i = 0; i < value.length; i++) {
  //            temp += Math.pow(Double.parseDouble(value[i]), (p + i));
  //        }
  //        return temp % n == 0 ? temp / n : -1;
  //    }
  //
  //    // g964's solution
  //    public static long otherDigPow1(int n, int p) {
  //        long s = 0;
  //        String nstr = String.valueOf(n);
  //        for (int i = 0; i < nstr.length(); i++) {
  //            s += (long)Math.pow(nstr.charAt(i) -'0', p+i);
  //        }
  //        if (s % n == 0)
  //            return s / n;
  //        else return -1;
  //    }

}
