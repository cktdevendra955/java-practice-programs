public class InitBlock {
    {
        System.out.println("THIS IS INIT BLOCK");
    }

    InitBlock(){
        System.out.println("default" );
    }
    
    InitBlock(String name){
        System.out.println("NAME : " + name);
    }
    InitBlock(int x, int y){
        System.out.println("SUM : " + (x+y));
    }

    public static void main(String[] args) {
       System.out.println("***********");
       InitBlock initBlock = new InitBlock();
       InitBlock initBlock2 = new InitBlock("Dev");
       InitBlock initBlock3 = new InitBlock(10,20);
    }
}
