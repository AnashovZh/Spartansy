public class Riders extends  Spartans{
    private  String whiteHorse;
    private  String blackHorse;

    public Riders(String groupName, int count, String whiteHorse, String blackHorse) {
        super(groupName, count);
        this.whiteHorse = whiteHorse;
        this.blackHorse = blackHorse;
    }

    public String getWhiteHorse() {
        return whiteHorse;
    }

    public void setWhiteHorse(String whiteHorse) {
        this.whiteHorse = whiteHorse;
    }

    public String getBlackHorse() {
        return blackHorse;
    }

    public void setBlackHorse(String blackHorse) {
        this.blackHorse = blackHorse;
    }

    public void leftRiders(){
        System.out.println(" Riders on the left side attacks");
    }
    public void rightRiders(){
        System.out.println(" Riders on the right side attacks");
    }
    public String toString (){
        return "designation= "+blackHorse+" number riders= "+whiteHorse+super.toString();
    }
}
