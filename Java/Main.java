class main {

    public static void main(String[]args){
        system.out.println("Incializacion....");
        System.out.println("car....");
        Car car = new Car("AMQ123",new
        Account("Andres Loiza",
        "ADN1235","andresl@hotmail.com","12365"
        ));
        car.passenger = 4;
        car.printDataCar();

       system.out.println("uber....");
       UberX uberx = new UberX
       ("MKL185", new Account("Maria Loyola","JKL12365","marial@hotmail.com", "125478"),"Toyota","Corolla");

    }
}