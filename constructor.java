class constructor {
           int x; int y;
         constructor ( int a,  int b){
                    x=a; y=b;
            
            
            
             } 
             int u; String name;
              constructor ( int a,  String b){
                u=a; name=b;
        
        
        
         } 
                void show (){
                System.out.println(x + " " + y);
                System.out.println(u + " " + name);
         }
        
    
}
class b{
    public static void main(String[] args) {
        constructor ref = new constructor(100,200);
        constructor re = new constructor(4,"dhrub");
        ref.show();
        re.show();  
    }
    

}
