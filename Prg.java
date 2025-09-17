public class Prg{
    
    int apple_price = 20;
    int apple_count = 5;
    void total_money(){
        System.out.println("Total price: "+(apple_price*apple_count));
    }
    public static void main(String[] args) {
        Prg obj1 = new Prg();
        obj1.total_money();
    }
    
}

    }
}