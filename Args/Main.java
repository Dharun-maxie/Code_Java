package Args;

class Main {
    public static void main(String[] args) {
        if (args.length < 2)
            System.out.println("Enter Correct amount of details");
        int a=0,b=0;
        float AREA=0;
        try {
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
//            System.out.println(STR."\{a} \{b}");
            if(a>0 && b>0)
            {
                AREA = ((a*b)/2.0f);
            }
        }
        catch (NumberFormatException e) {
            throw new NumberFormatException("Something Went Wrong!!!");
        }
        System.out.printf("%.2f",AREA);
    }
}
