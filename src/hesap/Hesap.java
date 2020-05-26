/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesap;


public class Hesap {
private String kullaniciNo;//"kullaniciNo" adında değişken tanımladık.
private double bakiye;//"bakiye"adında değişken tanımladık.
private String ad;//"ad" adında değişken tanımladık.
private String soyad;//"soyad" adında değişken tanımladık.
private String sifre;//"şifre" adında değişken tanımladık.

public Hesap(){
    System.out.println("Hesap bilgileri");
}
public Hesap(String kullaniciNo, double bakiye, String ad,String soyad,String sifre){
//Hesap içinde “kullaniciNo”,”bakiye”,”ad”,”soyad”,”sifre”parametrelerini tanımladık.  
    this.kullaniciNo=kullaniciNo;//Class daki kullaniciNo yu parametredeki kullaniciNo ya eşitledik.
    this.bakiye= bakiye;//Class daki bekiye yi parametredeki bakiye ye eşitledik.
    this.ad=ad;//Class daki ad’ı  parametredeki ad’a  eşitledik.
    this.soyad=soyad;//Class daki soyad’ı  parametredeki soyad’a  eşitledik.
    this.sifre=sifre;//Class daki sifre yi  parametredeki şifre ye  eşitledik.
}
public void bakiyeYatir(double tutar){
    bakiye+= tutar;//bakiye yi arttırıp tutara gönder.
    System.out.println("Yeni Bakiye "+bakiye +" TL");//yeni bakiye yi yazdır.
}
public void bakiyeCekme(double tutar){
    //bakiyeCekme adında bir fonksiyon oluşturdum.tutarı double olarak tanımladım.
    if ( tutar > 1300) {//eğer tutar 1300’den büyükse 
        System.out.println("Gün İçinde 1300 Tl den fazla para çekemezsiniz!");
        //para çekmessiniz komutunu yazdır.
    }
    if (bakiye-tutar < 0) {//eğer bakiye eksi tutar 0 ‘dan küçükse 
        System.out.println("Yetersiz Bakiye! Mevcut Bakiyeniz:"+bakiye);//Yetersiz bakiye uyarısını yazdır.
    }
    else{//bunlardan hiçbiri çalışmassa 
        bakiye-=tutar;//bakiye eşittir tutar komutunu çalıştır.
        System.out.println("Yeni Bakiyeniz ="+bakiye);//yeni bakiyeniz şeklinde bakiyeyi yazdır.
    }
}
public String getkullaniciNo(){ //Classdaki String olarak tanımladığımız kullaniciNo yu getir.
return kullaniciNo;}//kullaniciNo değişkenini return ile metodun içinde döndürüyoruz.
public void setkullaniciNo(String kullaniciNo){//kullaniciNo yu parametre içerisinde String olarak eşitledik.
    this.kullaniciNo=kullaniciNo;//kullaniciNo değerini kullaniciNo olarak eşitledik.
}
public double getbakiye(){ //Classdaki double olarak tanımladığımız bakiye yi getir.
return bakiye;}//bakiye değişkenini return ile metodun içinde döndürüyoruz.
public void setbakiye(double bakiye){//bakiye yi parametre içerisinde double olarak eşitledik.
    this.bakiye=bakiye;//bakiye değerini bakiye olarak eşitledik.
}
public String getad(){ //Classdaki String olarak tanımladığımız  ad’ı  getir.
return ad;}//ad değişkenini return ile metodun içinde döndürüyoruz.
public void setad(String ad){//ad’ı parametre içerisinde String olarak eşitledik.
    this.ad=ad;//ad değerini ad olarak eşitledik.
}
 public String getsoyad(){ //Classdaki String olarak tanımladığımız  soyad’ı  getir.
return soyad;}//soyad değişkenini return ile metodun içinde döndürüyoruz.
public void setsoyad(String soyad){//soyad’ı parametre içerisinde String olarak eşitledik.
    this.soyad=soyad;//soyad değerini soyad olarak eşitledik.
} 
public String getsifre(){ //Classdaki String olarak tanımladığımız  sifre’yi  getir.
return sifre;}//sifre  değişkenini return ile metodun içinde döndürüyoruz.
public void setsifre(String sifre){//sifre’yi parametre içerisinde String olarak eşitledik.
    this.sifre=sifre;//sifre değerini sifre olarak eşitledik.
}

    public static void main(String[] args) {
      Hesap hesap= new Hesap();//hesap adında Hesap nesnesi oluşturdum.Ve bu nesneye özelliklerini atadım.
      Hesap hesap1=new Hesap("11223344",1300,"Mustafa Nuri","KÜÇÜKSOYLU","123123123");
      //hesap1 nesnesine hesap bilgilerini atadım.
      hesap1.bakiyeYatir(500);
    
    }}
