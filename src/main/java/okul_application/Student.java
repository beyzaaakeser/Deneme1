package okul_application;

public class Student {

    //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız. +++
    //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız +++++.
    //  3- Bütün fieldlar için encapsulation uygulayınız.  ++++
    //  4- Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
    //     ArrayList cinsinden Öğrencileri olsun.
    //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz. ++++
    //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci
    //     ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.


    private String ogrenciAd;
    private String ogrenciSoyAd;
    private String ogrenciNo;
    private Integer ogrenciYas;


    public Student(String ogrenciAd, String ogrenciSoyAd, String ogrenciNo,Integer ogrenciYas) {
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyAd = ogrenciSoyAd;
        this.ogrenciNo = ogrenciNo;
        this.ogrenciYas =ogrenciYas;
    }
    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public String getOgrenciSoyAd() {
        return ogrenciSoyAd;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public Integer getOgrenciYas() {
        return ogrenciYas;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public void setOgrenciSoyAd(String ogrenciSoyAd) {
        this.ogrenciSoyAd = ogrenciSoyAd;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setYas(Integer yas) {
        this.ogrenciYas=ogrenciYas;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ogrenciAd='" + ogrenciAd + '\'' +
                ", ogrenciSoyAd='" + ogrenciSoyAd + '\'' +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", ogrenciYas=" + ogrenciYas +
                '}';
    }
}//class
