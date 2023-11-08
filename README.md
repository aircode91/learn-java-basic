# Learn JAVA Basic


## Hello Word
## Type Data Number
- Integer Number
- Float Number
- Literals Number
- Underscore Number

## Konversi Type Data Number 
- Widening Casting (Otomatis) 
- Narrowing Casting (Manual)

## Type Data Character
- Didalam java bisa di sebut dengan char dan biasa menggunakan symbol petik satu (')

## Type Data Boolean
- Memiliki 2 nilai : benar(true) dan salah (false)
- default value adalah false

## Type Data String
- data kumpulan karakter atau teks
- di java di reprentasikan dengan kata 'String'
- value menggunakan symbol petik dua (")
- default value null

## Variabel
- Tempat untuk menyimpan atau menampung data
- dijava variable ada static type tidak seperti bahasa yang lain seperti PHP
- deklarasi variable menggunakan type data -> nama variablenya
- tidak boleh mengandung white space
- jika mengandung angka harus menggabungkan dengan character
- since 2010 variable bisa menggunakan keyword "var" tapi harus menginisiasi nilainya langsung
- kata kuci final
    - nilai variable yang tidak bisa di ubah lagi 
    - banyak yg menyebut ini adalah constanta

## Type Data bukan Primitif
- Tipe data primitif : tidak bisa di ubah, seperti : number, char, boolean
- Ciri tipe data primitif adalah type data yang memiliki default value
- String bukan tipe data primitif tapi tipe data object makanya dia memliki default null, dan biasanya memiliki function

## Type Data array
- Di java kumpulan data dengan type data yg sama
- panjang array tidak bisa di ubah ketika sudah di buat

## Operasi Matematika
- Operator matematika sama dengan bahasa pemrograman yang lainya yang dimana penjumlahan (+), penguranga(-), perkalian(*), pembagian(/), sisa bagi atau mod (% )
- Augmented Assignment : self oporation atau operasi yang dilakukan untuk dirinya sendiri
- Unary Operator : operator yang ditempat di depan variable

## Operasi perbandingan
- Operasi yang dilakukan untuk membandingkan 2 nilai atau 2 data yang sama atau berbeda
- operator nya : (<, >, == ,<=, >=, != )

## Operasi Boolean
- Operasi yang digunakan untuk yg tipe datanya boolean
- Opertatornya : And("&&") OR("||"), Negation("!")

## Expression, Statement and Block
- expression adalah kontruksi dari varible, operator atau call method yang akan mengevaluasi menjadi single value
- expression adalah termasuk core component dari statement
- Statement : kumpulan expression atau kalimat lengkap dalam sebuah bahasa biasanya di akhiri dengan titik koma
- Jenis statement: assignment, invocation,unary usage, object creation
    - Example:
    ```java
    //assignment statement
    double aValue = 8930,00;

    //Increment / unary statement
    aVaue++;

    //Invacation Statement
    System.out.println(aValue);

    //Object creation statement
    Date date = new Date();
    
    ```
- Block : Kumpulan statement yang dimana ada expression
    - Example: 
    ```java
    public class Block {
        public static void main(String[] args) {
            
            System.out.println("Hello world 1"); //Statement
            System.out.println("Hello world 2"); //Statement
            System.out.println("Hello world 3"); //Statement

        }
    }
    ```

## If Else statement
- Salah satu kunci untuk melakukan suatu percabangan yang dimana di dalamnya mengandung beberapa kondisi

## Switch Statement
- statement percabangan yang hampir sama dengan if namun ini lebih sederhana
- since 2014, statement switch lambda yang dimana lebh sederhana lagi untuk code nya
- since java 14, dalam switch lambda bisa menggunakan key yield untuk membuat variable yang akan digunakan untuk menampung result dari logika dari switch diatas

## Ternary Operator
- Bentuk sederhana dari if statement dari yang biasanya di gunakan 
- Nilai yang dievaluasi biasanya menggunkan single line code

## For Loop
- Suato statement untuk melakukan perulangan di dalam code block
- Init statement akan dijalan 1 kali diawal
- key ini bisa digunakan tanpa harus menggunakan nilai init didalam ataupun post

## While Loop
- Perulangan yang sederhana jika dibandingkan dengan for loop
- Terdapat kondisi perulangan saja tanpa ada init dan post

##  Do While Loop
- Hampir sama dengan perulangan while loop hanya berbeda pada kondisinya
- Di while loop kondisi di cek diawal tapi do while loop di akhir
- Jika kondisinya tidak valid ini akan tetap di eksekusi minimal 1 kali

## Break dan Continue
- Didalam perulangan bisa menggunakan kata kunci break dan continue
- Break digunakan untuk menghentikan semua sebuah perulangan
- Continue digunakan untuk menghentintik perulangan saat ini untuk melanjutkan perulangan selanjutnya


## For Each
- Perulangan ini tidak harus menyebutkan index dari sebuah array


## Method
- Sebuah kode program yang berjalan pada saat dipanggil
- Kita bisa memanggil method menggunkan kurung buka dan kurung tutup
- contohnya:
```java
System.out.println("Hello world 1"); //Statement
``` 

## Method Parameter
- Setiap method bisa digunakan untuk memanggil sebuah parameter
- contohnya :
```java
public class MethodParameter {

    public static void main(String[] args) {
        sayHelloWorld("Agus Firman");
    }

    static void sayHelloWorld(String firstname){
        System.out.println("Hello "+ firstname);
    }
}
```

## Method Return Value
- Secara default method tidak bisa mengembali value
- Agar method bisa mengembalikan value maka key word static di ubah dengan tipe data yang ingin dihasilkan dan menggunakan key return
- Dijava hanya bisa mengembalikan 1 data


