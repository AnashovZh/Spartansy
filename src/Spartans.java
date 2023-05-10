public class Spartans {
    private String groupName;
    private int count;

    public Spartans(String groupName,int count){
        this.groupName=groupName;
        this.count=count;
    }
    public Spartans(){

    }
    public void setGroupName(String groupName){
        this.groupName=groupName;
    }public String getGroupName(){
        return groupName;
    }
    public void setCount(int count){
        this.count=count;
    }public int getCount(){
        return count;
    }
    public   Spartans [] counter(Spartans [] spartans){
        for (int i = 0; i < spartans.length; i++) {
            for (int j = i+1; j <spartans.length ; j++) {
                if(spartans[i].count>spartans[j].count){
                    Spartans count=spartans[i];
                    spartans[i]=spartans[j];
                    spartans[j]=count;
                }
            }
        }return spartans;
    }
    public int counters(Spartans [] spartans){
      int counter=0;
        for (int i = 0; i < spartans.length ; i++) {
            if(spartans[i].count>0){
                counter+=spartans[i].count;
            }


        }
        return  counter;


    }
    public String toString(){
        return "Person name = "+groupName+"Person counter= "+count;
    }
}
