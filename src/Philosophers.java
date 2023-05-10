public class Philosophers extends Spartans{

    private String firstDegree;
    private  String secondDegree;

    public Philosophers(String groupName, int count, String firstDegree, String secondDegree) {
        super(groupName, count);
        this.firstDegree = firstDegree;
        this.secondDegree = secondDegree;
    }

    public String getFirstDegree() {
        return firstDegree;
    }

    public void setFirstDegree(String firstDegree) {
        this.firstDegree = firstDegree;
    }

    public String getSecondDegree() {
        return secondDegree;
    }

    public void setSecondDegree(String secondDegree) {
        this.secondDegree = secondDegree;
    }

    public void advice(){
        System.out.println("Philosophers helps how to defeat enemies.");
    }
    public void adviceOnStrategy(){
        System.out.println("Philosophers helps how to put an army on a strategy.");
    }
    public String toString (){
        return "designation= "+firstDegree+"Number philosophers = "+secondDegree+super.toString();
    }
}
