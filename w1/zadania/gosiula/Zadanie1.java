public class Zadanie1 {
   public static void main(String[] args) {
    int a = 1, b = 2, c = 3, d = 4;
    int ab = a + b;
    int cd = c - d;
    System.out.println("ab:  "  + a + "+" + b + "=" + ab);   
    System.out.println("cd:  " + c + "-" + d + "=" + cd);
    double e = 1.1, f = 2.2, g = 3.3, h = 4.4;
    double ef = e * f;
    double gh = g / h;  
    System.out.println("ef:  " + e + "*" + f + "=" + ef);
    System.out.println("gh:  " + g + "/" + h + "=" + gh + "\n");
    System.out.println("reszta z dzielenia zmiennej ab przez b:  " + ab%b + "\n");
    char i = 'a', j = 'A';
    System.out.println("i = " + i + ", j = " + j + ", nie mozna dodac i do j\n");
    String k = "Ala", l = "ma";
    String kl = k + l;
    System.out.println("k = " + k + ", l = " + l + ", mozna dodac k do l\n" + "kl = " + kl + "\n");
    boolean m = true, n = false;
    System.out.println("m && n = " + (m && n) + "\n");
   }
} 
