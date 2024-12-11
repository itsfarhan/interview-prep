enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumsExample {
    public static void main(String[] args) {
        Days days = Days.SUNDAY;
        if(days == Days.SUNDAY){ System.out.println("-> Today is Weekend Night"); }
        else{System.out.println("Enter valid");}
        switch (days){
            case SUNDAY:
                System.out.println("Weekend");
                break;
            case MONDAY:
                System.out.println("MONDAY");
                break;
            case TUESDAY:
            System.out.println("TUESDAY");
            break;
            case WEDNESDAY:
            System.out.println("WEDNESDAY");
            break;
            case THURSDAY:
            System.out.println("THURSDAY");
            break;
            case FRIDAY:
            System.out.println("FRIDAY");
            break;
            case SATURDAY:
            System.out.println("SATURDAY");
            break;
            default:
                break;
        }
    }
}
