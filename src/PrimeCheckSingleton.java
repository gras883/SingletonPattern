public class PrimeCheckSingleton {
    // create the static vairaible this will pass to globally
    private static PrimeCheckSingleton INSTANCE;

    // constructor is private so no will create the instance of class
    private PrimeCheckSingleton(){}

    // Get instance method which will return the Instance of singleton class
    public static PrimeCheckSingleton getINSTANCE(){
        if(INSTANCE == null) {
            INSTANCE = new PrimeCheckSingleton();
        }
        return  INSTANCE;
    }

    // Check prime method
    public Boolean isPrime(int value){
        for(int i=2; i*i <= value ; i++){
            if(value % i == 0) return false;
        }
        return true;
    }





}
