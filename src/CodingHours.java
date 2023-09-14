public class CodingHours {
    public static void main(String[] args) {
        int codeHours = 6*5*17;

        System.out.println("The attendee codes " + codeHours + "h per semester");

        float codePc = 52f*17f/codeHours;
        System.out.println("They spend " + codePc + "% of their work time with coding");
    }
}