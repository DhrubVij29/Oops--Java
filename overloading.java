 class overloading {
      int a; String b;
     overloading(){
           a =10; b="dhrub";
           System.out.println(a +" "+ b);
     }
     overloading(int x){
                a=x;
                System.out.println(x);

     }
     overloading(String y ){
      b=y;
      System.out.println(y);
     }

    
}
class overl{
    public static void main(String[] args) {
        overloading ref=new overloading();
        overloading r1=new overloading(100);
        overloading r2=new overloading("dhru");
        // System.out.println(ref.a +" "+ref.b);
        // System.out.println(r1.a);
        // System.out.println(r2.b);
       

    }

}
