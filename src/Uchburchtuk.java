public class Uchburchtuk { //1 ат койот, 3 поле жазылат.

    int a;
    int b;
    int c;

    public void area(){
        double p = (a+b+c) / (double) 2; //параметр (бутун сандан болчок санга отуу учун дабл/костинг жазуу керек)
        double s =Math.sqrt(p*(p-a)* (p-b)* (p-c)); //аянты табабыз, майндан маани беребиз
        System.out.println(s);
    }

}
