/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.perpus1;

/**
 *
 * @author erisa
 */
public class siswa {
    private int idSiswa;
    private String nama, alamat, telepon;
    boolean status;
    
    //konstruktor = method pertama kali yang dijalankan
    public siswa(int idSiswa, String nama, String alamat, String telepon, boolean status){
        this.idSiswa = idSiswa;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.status = status; 
        
    }
    
    //implementasi enkasupalsi dengan pembuatan method untuk mengakses data private "idSiswa"
    public int getidSiswa(){
        return idSiswa;
    }
    //implementasi enkasupalsi dengan pembuatan method untuk mengakses data private "nama"
    public String getNama(){
        return nama;
    }
    //implementasi enkasupalsi dengan pembuatan method untuk mengakses data private "alamat"
    public String getAlamat(){
        return alamat;
    }
    //implementasi enkasupalsi dengan pembuatan method untuk mengakses data private "telepon"
    public String getTelepon(){
        return telepon;
    }
    
    //method untuk mengubah status peminjaman siswa
    public void changeStatus(){
        this.status = !this.status;
    }
    //method untuk mendapatkan status peminjaman
    public String getStatus(){
        if(status){
            return "Diijinkan meminjam";
        }else{
            return "Tidak Diijinkan meminjam";
        }
    }
    
    //implementasi enkasupalsi dengan pembuatan method untuk mengakses data private "status"
    public boolean isStatus(){
        return status;
    }
    
}
