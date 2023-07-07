package tasks;

import org.w3c.dom.ls.LSOutput;

class ChocolateFactory {
    public double price;
    public String type;

    public ChocolateFactory(double price, String type) {

        this.price = price;

        this.type = type;
    }

  /*  public ChocolateFactory() {

    }*/

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

   /* class MilkChocolate extends ChocolateFactory {

        public MilkChocolate() {
            super(2.0, "MilkChocolate");
        }
    }*/

/*
   class DarkChocolate extends ChocolateFactory {

        public DarkChocolate() {
            super(3.5, "Dark CChocolate");
        }
    }
*/

/*
    class WhiteChocolate extends ChocolateFactory {

        public WhiteChocolate() {
            super(5.0, "White Chocolate");
        }
    }
*/
}     class Main {
    public static void main(String[] args) {
        MilkChocolate milkChocolate = new MilkChocolate();
       DarkChocolate darkChocolate = new DarkChocolate();
        WhiteChocolate whiteChocolate = new WhiteChocolate();
        System.out.println(milkChocolate.getType()+ " -> " + milkChocolate.getPrice()+"$");
        System.out.println(darkChocolate.getType()+ " -> " + darkChocolate.getPrice()+"$");
        System.out.println(   whiteChocolate.getType()+ "  -> "+ whiteChocolate.getPrice()+"$");

    }
}




