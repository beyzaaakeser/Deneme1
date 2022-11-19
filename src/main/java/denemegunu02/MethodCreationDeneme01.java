package denemegunu02;

public class MethodCreationDeneme01 {

    // Example 1 : ilk iki sayiyi carp ve 3.ye bol
    // Example 2 : birinci sayiyi 2.ye bol 3 ile carp 4 ile topla
    // Example 3 : bir ve ikiyi carp uc ile dordu bol cikanlari topla
    // Example 4 : uc sayiyi birbiri ile carp toplamlarina bol cikan sonucu 1 ile 2nin toplamina ekle
    // Example 5 : 3 sayiyi topla 1inciye bol sonucu 2 ile carp 3 ile topla
    // Example 6 : 1.sayiyi 4 e bol 2 ile 3u topla cikan sonuclari carp ve hepsinin toplamini ekle
    // Example 1 cozumu

    public static double Example1(double a, double b, double c){
        return (a*b)/c;
    }

    public static void main(String[] args) {
        System.out.println(Example1(1,6,2));
        System.out.println(Example2(10,5,3,50));
        System.out.println(Example3(40,3.2,5.8,67));
        System.out.println(Example4(6.8,10,2.1));
        System.out.println(Example5(5,3,10));
        System.out.println(Example6(2,4,6,8));
    }

    // Example 2 cozumu
    public static double Example2(double d, double e, double f, double g){

        return ((d/e)*f)+g;
    }

    // Example 3 cozumu
    public static double Example3(double a, double b, double c, double d){
        return (a*b)+(c/d);
    }

    //Example 4 cozumu

    public static double Example4(double a, double b, double c){
        return (a*b*c)/(a+b+c)+ (a+b);
    }

    public static double Example5(double a, double b, double c){
        return ((a+b+c)/a)*b+c;
    }

    // Example 6 : 1.sayiyi 4 e bol 2 ile 3u topla cikan sonuclari carp ve hepsinin toplamini ekle
    public static double Example6(double a, double b, double c, double d){
        return (a/d)*(b+c)+(a+b+c+d);
    }


}


















