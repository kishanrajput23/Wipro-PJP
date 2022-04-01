public class Q_3 {
    
    public static void main(String args[]) {
        if (args.length == 0)
            {
            System.out.println("No Values");
    }
        else {
            for(String i : args)     //for each value in args store in i
                System.out.print(i + " , ");
        }
    }
}
