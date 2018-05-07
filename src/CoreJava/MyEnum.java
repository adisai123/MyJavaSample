package CoreJava;

/**
 * @author aditya.malpani
 *
 */
public enum MyEnum implements Runnable {
    ONE(1) {

        @Override
        double mathFunction()
        {
            return Math.max(i, 10);
        }
    },
    TWO(2) {

        @Override
        double mathFunction()
        {
            return Math.incrementExact(i);
        }
    },
    THREE(3) {

        @Override
        double mathFunction()
        {
            return Math.decrementExact(i);
        }
    },
    FOUR(4) {

        @Override
        void display()
        {
            System.out.println("fdsf");
        }
    },
    SIX(5) {

        @SuppressWarnings("unused")
        public void s()
        {
            System.out.println("new method");
        }
    };

    int i;


    MyEnum(int i)
    {
        this.i = i;
        System.out.println("i in constructor" + i);
    }


    void display()
    {
        System.out.println(i);
    }


    double mathFunction()
    {
        return (float) Math.sqrt(i);
    }


    @Override
    public void run()
    {
        System.out.println("aditya");
    }

    interface xx
    {

        enum x implements xx {
            // int i; here first line should be enumerator objects(constants)
            ONE(), TWO(), THREE(10), FOUR;

            int i;


            x()
            {
            }


            x(int i)
            {
            }


            @Override
            public int y()
            {
                return i;
            }
        }


        int y();
    }
    class x implements xx
    {

        xx.x x = xx.x.FOUR;


        public x()
        {
            System.out.println(x.y());
        }


        @Override
        public int y()
        {
            return 0;
        }
    }


    public static void main(String args[])
    {
        Thread t = new Thread(() -> {
            System.out.println("sdf");
        });
        t.start();
        x xx = MyEnum.FOUR.new x();
        xx.toString();
        /*
         * MyEnum.FOUR.mathFunction(); MyEnum.FOUR.display(); MyEnum.ONE.display(); MyEnum.SIX.SIX.mathFunction(); MyEnum.ONE.display();
         */
    }
}
