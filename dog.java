import java.util.Scanner;

public class dog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      // System.out.print("Vize notunu girin: ");
       // double vize = input.nextDouble();

       // System.out.print("Final notunu girin: ");
       // double finalnotu = input.nextDouble();

       // double ortalama = (vize * 0.40) + (finalnotu * 0.60);
       // System.out.println("Ortalama: " + ortalama);

      //  input.close();//


//yeni
//System.out.println(".(taban uzunluğunu  giriniz)");
//double taban = input.nextDouble();
//System.out.println(".(yüksekliği giriniz)");3

 //double yükseklik = input.nextDouble();
//double alan = taban *yükseklik ;
//System.out.println(".(alan )" + alan );
  

//YENİ//

//System.out.println(".(1 kenarı giriniz )");
//double a = input.nextDouble() ;
//System.out.println(".(2kenarı girin )");
//double b = input.nextDouble() ;
//System.out.println(".(aradaki açıyı giriniz (derece))");
//double aci = input.nextDouble() ;
//double alan = (a * b* Math.sin(Math.toRadians(aci))) / 2 ;
//System.out.println("üçegenin alanı" + alan );

//derece olan girilen açıyı  radyan ve grada çevirme //

// System.out.print("Derece gir:");
//double d = input.nextDouble();
//double radyan = d* 3.14159 / 180 ;
//double grad = d*200/180 ;

//System.out.println("Radyan: " + radyan);
//System.out.println("Grad: " + grad);
// 4 örnek 
//System.out.println("birinci dik kenarı giriniz (cm)");
//double a= input.nextDouble () ;
//System.out.println(".(ikinci dik kenarı giriniz  (cm):)");
//double b = input.nextDouble() ;
 //double c = Math.sqrt ((a*a)+ (b*b )) ;
//System.out.println(".( hipotenus  (cm):)" +c);

//5 ORNEK //
//System.out.println(".(1 kenarı giriniz )");
//double a = input.nextDouble () ;
//System.out.println(".(2 kenarı giriniz)");
//double b = input.nextDouble () ;
//System.out.println(".(açıyı giriniz )");
//double aci = input .nextDouble () ;
//double c = Math.sqrt (a*a+b*b-2*a*b* Math.cos (Math . toRadians (aci)));
//System.out.println(".( 3kenar (c) :)" + c);

 //System.out.println(".( 1 kenarı gir )");
//double a = input.nextDouble () ;
//System.out.println(".( 2 kenARI GİR )");
//double b = input.nextDouble () ;
//System.out.println(" . (açıyı giriniz) ") ;
//double Aci  = input .nextDouble () ;
//double alan = a*b*Math.sin(Math.toRadians(Aci)) ; 


//örnek 7 
  //  System.out.println ("kurenin yarıçapını giriniz " ) ;
   // double r = input.nextDouble() ;
  //double alan = 4 * Math.PI* Math.pow (r,2) ;
  //double hacim = (4.0/3.0 ) * Math.PI* Math.pow (r,3) ;
  //System.out.println(".(kurenin alanı :)" + alan );
//System.out.println("kurenin hacmi " + hacim );


//örnek 8 
//System.out.println(".(kurenin yarıçapını giriniz )");
//double r = input.nextDouble();
//System.out.println(".()kurenin derecesini giriniz ");
//double derece =input.nextDouble () ; 
//double hacim =  (4.0/3.0 )*Math.PI*Math.pow (r,3)* (derece/360) ;
//System.out.println(".(küre diliminin hacmi)" + hacim);
//input.close();


//ÖRNEK 9 BY   
//System.out.println(".(birinci kenarı giriniz)");
//double a = input.nextDouble () ;
//System.out.println("ikinci kenarı giriniz");
//double b = input.nextDouble ();
//System.out.println(".(üçüncü kenarı giriniz)");
//double c = input.nextDouble () ;  burda input next double ı kenarı tanımlamak için kullanırıx
//double u = (a+b+c) /2 ;
//double alan =  Math.sqrt (u*(u-a)*(u-b)*(u-c) ) ;
//System.out.println(".(alanı yazdır)" + alan );
//input.close () ;
//

// örnek 10 
//System.out.println(".(maddenin kütlesini giriniz)");
//double kütle = input.nextDouble() ;
//System.out.println(".(maddenin hızını giriniz )");
//double hız = input.nextDouble() ;
//System.out.println(".(YÜKSEKLİĞİ GİRİNİZ)");
//double yükseklik = input.nextDouble();
/// double potansiyelenerji  = (kütle*9.8*yükseklik ) ;
//double kinetikenerji= (1/2*kütle*hız*hız) ;
//System.out.println("kinetik enerji" + kinetikenerji )  ;    unutma değişken isimleri bitişik yazılacal 
//System.out.print(".(potansiyel enerji"+  potansiyelenerji ) ;
//input.close(); 




//ÖRNEK 11 //  üst almayı Math.pow(taban , üs) seklinde yaparız 

//System.out.println(".(yerden yüksekliği giriniz)");
//double yerdenyükseklik = input.nextDouble() ;
//System.out.println(".(hızı giriniz)");
//double hız = input.nextDouble() ;
//double t = Math.sqrt (2*yerdenyükseklik/9.8 ) ;
//double x = (hız*t) ;
//double vy = (9.8*t) ;
//double v = Math.pow ((Math.pow (hız,2)+ Math.pow (vy,2)),2) ;
//System.out.println(".(süre)" +t );  
//System.out.println(".(hız)"+v);
//System.out.println(".(yol)" + x);
//input.close();

//örnek 12 
//System.out.println(".(kütleyi giriniz)");
//double kütle = input.nextDouble ();
//System.out.println(".(molekül ağirliğini giriniz)");
//double molekülağirliği = input.nextDouble() ;
//double mol = (kütle/molekülağirliği) ;
//System.out.println("mol " + mol );
  // input.close();



//örnek 13    160 atırıncı satırda eşittir sonrADAN + N DİYEREK DEGERİn yanına yazdırırız

//System.out.println(".(başlangıç kütlesini giriniz (mo))");
 //double başlangıçkütlesi = input.nextDouble();
//System.out.println(".(yarılanmasüresini giriniz)");
//double yarılanmasüresi = input.nextDouble () ;
//System.out.println(".(süreyi giriniz)" );
//double süre = input.nextDouble () ;
//double n = (süre / yarılanmasüresi) ; 
//double m = başlangıçkütlesi/ Math.pow(2, n) ;
//System.out.println(".(n =)" + n); ;
//System.out.println(".(kalan kütle (m))" +m);
//input.close();



//örnek 14 değişken tanımlarken isimleri bitişik yAZmayı unutma    harfli tanımkamak istediğimde ana değişkenin yanına harfi giricez
//System.err.println(" iletkenin direncini giriniz");
//double iletkenindirenci = input.nextDouble() ;
//System.out.println(".(akımı giriniz)");
//double akım = input.nextDouble() ;
//double v = (iletkenindirenci*akım) ;
//System.out.println(".(v=)" + v);
//input.close();


//örnek 15 
System.out.println(".(gerilimi  (e)giriniz)");
double e =input.nextDouble() ;
System.err.println("direnç biri giriniz (r1)");
double r1 = input.nextDouble() ;
System.err.println("direnç ikiyi giriniz (r2)");
double r2 =input.nextDouble() ;
System.err.println("direnç üçü giriniz(r3)");
double r3 = input.nextDouble() ;
System.err.println("direnç dördü giriniz (r4)");
double r4 = input.nextDouble() ;
double ı = e/(r1+r2+r3+r4) ;
double vr1 = r1*ı ;
double pr2 = Math.pow(ı, 2)*r2 ;
System.out.println(".(ı=)"+ı);
System.out.println(".(vr1=)" + vr1);
System.out.println(".(pr2=)" + pr2);
input.close();
}
}