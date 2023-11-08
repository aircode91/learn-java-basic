public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String pesan;

        /* if else average usage */
        // if(nilai >= 75){
        //     pesan = "Selamat, anda lulus..!";
        // }else{
        //     pesan = "Silahkan coba lagi";
        // }

        // System.out.println(pesan);

        /** Ternary operator if */
        pesan = nilai >= 75 ? "Selamat anda lulus": "Silahkan coba lagi !!";
        System.out.println(pesan);
    }
}
