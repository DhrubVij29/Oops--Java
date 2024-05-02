 class copy {
    int x; String y;
    copy(int a,String b){
        x=a; y=b;
        
    } 
    copy (copy ref){
        x=ref.x;
        y=ref.y;
      

    }
    
    
    
}
class B{
    public static void main(String[] args) {
        copy ref =new copy(100,"dhrub");
        copy r =new copy(ref);
        System.out.println(ref.x +" "+ref.y);
        System.out.println(r.x +" "+r.y);


       
      

    }
    
}
