package px;

public class Main{
    
    public static void main(String[] args) throws Exception {
         Main t = new Main();
         int i = t.getLoad();
         double d = t.getLoad();
         System.out.println( i + d );
    }

    public int getLoad() {
        return 1;
    }

    public double getLoad(){ 
        return 3.0;
    }

}