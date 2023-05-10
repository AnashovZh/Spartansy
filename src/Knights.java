public class Knights extends  Spartans{
    private String rightKnights;
    private String leftKnights;

    public Knights(String groupName, int count, String rightKnights, String leftKnights) {
        super(groupName, count);
        this.rightKnights = rightKnights;
        this.leftKnights = leftKnights;
    }

    public String getRightKnights() {
        return rightKnights;
    }

    public void setRightKnights(String rightKnights) {
        this.rightKnights = rightKnights;
    }

    public String getLeftKnights() {
        return leftKnights;
    }

    public void setLeftKnights(String leftKnights) {
        this.leftKnights = leftKnights;
    }

    public void eliteKnights(){
        System.out.println(" Elite knights attacks the in defeat!");
    }
    public void ordinaryKnights(){
        System.out.println("Ordinary knights attack first!");
    }
    public String toString(){
        return "Knights title:"+rightKnights+"Knights number: "+leftKnights+super.toString();
    }
}
