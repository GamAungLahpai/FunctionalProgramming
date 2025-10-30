package demo;

//@FunctionalInterface
//interface Cab {
//    public void bookCab();
//
//}
//
//public class Test{
//    public static void main(String[]args){
//        Cab cab =  () -> System.out.println("Ola cab is bookes.... ");
//        cab.bookCab();
//
//    }
//}
interface Cab{
    public String bookCab(String source, String destination);
}
//class Ola implements Cab{
//    public String bookCab(String source, String destination){
//        System.out.println("Ola cab is booked from " + source + " To " + destination);
//        return ("Price; 5000Rs");
//    }
//}

class test {
    public static void main(String[]args){
        Cab cab = (source,destination) -> {
            System.out.println("Ola cab is booked from " + source + " To " + destination);
            return ("Price; 5000Rs");
        };
        System.out.println(cab.bookCab("Helsinki","NewYork"));
    }
}