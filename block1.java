// static block
 class block1 {
    public static void main(String[] args) {
        block1 r= new block1();
        block1.show();

        
        
    }
    block1(){
        System.out.println("constructor block 1");

    }
    static void show (){
        System.out.println("static block 1");
    }
    {
        System.out.println("instance block 1");
    }
    
    
}
