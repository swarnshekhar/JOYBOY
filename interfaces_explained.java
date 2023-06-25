interface bicycle {
    int a=45;
    // ek interference bnaa ke both sare class mei usko dal skte ho...pr in case of
    // abstract ek...parent ka ek hi derived class hoga
    void applyBreak(int decreament);
    void speedup(int increament);
}
    interface horn{
    void blowhorn3kg(int increament);
    void blowhornmhn(int decr);
    }

class avonCycle implements bicycle,horn {
    void applyhorn() {
        System.out.println("pee pee poo poo");
    }

    public void applyBreak(int decreament) {
        // interface mei...public krna padta hai....nhi toh error aayega
        System.out.println("applying break");
    }

    public void speedup(int increament) {
        System.out.println("speeding up");
    }
    public void blowhorn3kg(int increament){
        System.out.println("blowing horn");
    }
    public void blowhornmhn(int decr){
        System.out.println("meii hu na");
    }
}

public class interfaces_explained {
    public static void main(String[] args) {

avonCycle swarncycle=new avonCycle();
swarncycle.applyBreak(0);
// swarncycle.a=4;//not allowed to modify properties
System.out.println(swarncycle.a);
//you can create propert in interface
//y can't modify properties
    }
}
