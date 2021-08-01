public class SingletonPattern {
    public static void main(String[] args) {
        PrimeCheckSingleton obj1 = PrimeCheckSingleton.getINSTANCE();
        System.out.println(obj1.isPrime(11));

        PrimeCheckSingleton obj2 = PrimeCheckSingleton.getINSTANCE();
        System.out.println("value " + 12 + " is Prime  " + obj2.isPrime( 12));

        // Check whether two object are pointing to same memory address

        System.out.println("Is obj1 == obj2 ?  ==>  " + (obj1 == obj2));


    }
}
