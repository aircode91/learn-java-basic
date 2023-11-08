public class IfElseStatement {
    
    public static void main(String[] args) {
        
        var nilai  = 60;
        var absen = 90;

        var lulus = nilai >= 75 && absen >= 75;

        if(lulus){
            System.out.println("Selamat anda lulus");
        }else{
            System.out.println("Maaf, anda belum lulus");
        }

    }
}
