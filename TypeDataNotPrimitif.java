public class TypeDataNotPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 100000L;

        Byte iniByte;
        iniByte = null;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);
        
        
        iniByte = 100;
        System.out.println(iniByte);

        // Konversi dari primitif to not primitif
        int age = 32;
        Integer ageObject = age;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();

        System.out.println(shortAge); //harus menambahkan function jika nilai tidak compatible
        System.out.println(byteAge);  //harus menambahkan function jika nilai tidak compatible
    }
}
