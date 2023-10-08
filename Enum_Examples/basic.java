package OOPs.Enum_Examples;

public class basic {
    enum Week {
        monday, tuesday, wednesday, thursday, friday, saturday, sunday;
        // these are enum constants.
        // public,static and final.
        // since its final u cnt create child enums.
        // type is week.

    
      Week(){
        System.out.println("CONSTRUCTOR CALLED FOR"+this);
        //INTERNALLY : Public static final Week monday=new Week();
    }
    }
    public static void main(String[] args) {
        Week week;
        week = Week.monday;
        // for (Week day : Week.values()) {
        //     System.out.println(day);
        // }
        // System.out.println(week);
        // System.out.println(week.ordinal());
        
    }

}
