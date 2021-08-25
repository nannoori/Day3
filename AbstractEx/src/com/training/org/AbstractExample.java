package com.training.org;

    abstract class Bike{

        abstract public void run();

        public void showBikeDetails(){
            System.out.println("Bike abstract class showBikeDetails is called");
        }
    }

    public class AbstractExample extends Bike {
        @Override
        public void run() {
            System.out.println("Run implementation inside AbstactExample");
        }

        public static void main(String[] args) {
            Bike ab=new AbstractExample();
            ab.run();
            ab.showBikeDetails();


//        AbstractClassExample ab=new AbstractClassExample();
//        ab.run();
//        ab.showBikeDetails();
        }


}
