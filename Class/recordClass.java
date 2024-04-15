package Class;
record person(int age, String name){
    public person // compact canonical constructor
    {
        if(age < 18)
            throw new IllegalArgumentException("The Person cannot be Under 18");
    }
}

class recordClass
{
    public static void main(String[] args)
    {
        person p1 =new person(21 , "Jerome");
        person p2 =new person(22 , "Kisore");
        person p3 =new person(21 , "Dharun");
        person p4 =new person(22 , "Ahmed");
        person p5 =new person(21 , "prakash");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}
