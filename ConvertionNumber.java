public class ConvertionNumber {
   public static void main(String[] args) {
      byte iniByte = 10;
      short iniShort = iniByte;
      int iniInt = iniShort;

      int iniInt2 = 1000;
      byte iniByte2 = (byte) iniInt2; /** this is number overflow to */
   }
}
