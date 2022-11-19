package day03typecastingwrapperclassdeneme;

public class WrapperClassDeneme01 {
    public static void main(String[] args) {

/*
        note : Java primitivelere methodlar ekleyerek yeni bir yapi olusturdu buna "Wrapper Class" denir

                        Primitive       ==>       Wrapper

                        byte            ==>       Byte
                        short           ==>       Short
                        int             ==>       Integer      ==> DIKKAT
                        long            ==>       Long
                        float           ==>       Float
                        double          ==>       Double
                        boolean         ==>       Boolean
                        char            ==>       Character    ==> DIKKAT

 */
// bir wrapper olusturup icinde method olup olmadigina bakicaz
       byte primitivByte = 12;
       //primitiveByte. yazdigimizda method cikmaz cunku bu primitive

       Byte wrapperByte = 12;
       // wrapperByte. yaptigimizda bircok method cikacak cunku bu non primitive. wrapperlar da non primitivedir ve method icerir wrapperByte.byteValue() gibi

        // simdi birkac tane data typeinin en kucuk ve en buyuk degerelrini ekrana yazdiriniz.
        // Wrapperlarin ismini yazip nokta koy sonra min max degerleri cikiyor bunlari yazdirmak icin souta yaz

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);// int'in wrapperi Integer dikkat!!!
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);


        // Primitiveler nasil wrapperlara cevrilir?

        //once bi tane primitive olustur.sonra bi tane wrapper olustur ve primitive i wrapperin icine koy gibi ==> buna AutoBoxing denir.\




        float f1 = 13.99F;
        Float wrapperF1 = f1; // hata vermez yine buyuk kutu kucuk kutuu gibi dusun

        //Wrapperlar nasil Primitivelere cevrilir?

        // once wrapper olustur sonra primitive olustur. wrapperi primitive koymus gibi dusun. ==> buna Unboxing denir

        Character w1 = 's';
        char primitiveW1 = w1;// w1 burada variable ismi ve bu yuzden tirnaga koymadik. tirnaga variablenin degeri konur 's' gibi ismi konmaz.









    }







}
