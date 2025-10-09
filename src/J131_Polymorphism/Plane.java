package J131_Polymorphism;

class Plane extends Vehicle {

    //    @Override
//    public void start() {
//        System.out.println("Plane is taking off");
//    }
//
    @Override
    public void start() {
        super.start();
        System.out.println("Plane is taking off");
    }

}