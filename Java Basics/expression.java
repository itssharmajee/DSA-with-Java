public class expression{
    public static void main(String argn[]){
        byte b = 4;
        char c='a';
        short s = 512;
        int i = 1000;
        float f =3.14f;
        double d= 99.9954;
        // as we see above all types there is largest 
        // one is double so here expression result type will 
        // be double 
        double result = (f*b)+(i % c) - (d * s); 
        System.out.println(result);

    }
}