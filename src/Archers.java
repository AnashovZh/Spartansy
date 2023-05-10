public class Archers extends Spartans{
    private String  mountainArchers;
    private String  archersOnTheGround;

    public Archers(String groupName, int count, String mountainArchers, String archersOnTheGround) {
        super(groupName, count);
        this.mountainArchers = mountainArchers;
        this.archersOnTheGround = archersOnTheGround;
    }

    public String getMountainArchers() {
        return mountainArchers;
    }

    public void setMountainArchers(String mountainArchers) {
        this.mountainArchers = mountainArchers;
    }

    public String getArchersOnTheGround() {
        return archersOnTheGround;
    }

    public void setArchersOnTheGround(String archersOnTheGround) {
        this.archersOnTheGround = archersOnTheGround;
    }

    public void ArchersOnTheGrounds(){
        System.out.println("They stand behind the knight and shoot at the enemies.");
    }
    public  void archersMountain(){
        System.out.println("These archers stand on the mountain and at the enemies.");
    }public String toString (){
        return "Designation: "+mountainArchers+" Number archers : "+archersOnTheGround+super.toString();
    }
}
