import java.util.Arrays;

public class Student {
    private String name;
    private int skipping;

    private double [] rate;



    public Student(String name, int skipping) {
        this.name = name;
        this.skipping = skipping;
    }
    public Student(String name, int skipping, double[] rate) {
        this(name, skipping);
        this.rate=rate;
    }
    public void setRate(double[] rate){
        this.rate=rate;
    }

    public String getName() {
        return name;
    }

    public int getSkipping() {
        return skipping;
    }
    public double averageGrade(){
        double sum=0;
        double res=0;
        if(rate!=null && rate.length!=0){
            for (int i = 0; i <this.rate.length ; i++) {
            sum+=rate[i];
             }
            res=sum/rate.length;
        }
        return res ;
    }

    @Override
    public String toString() {
        String temp="";
        if (rate!=null){
            for (int i = 0; i < rate.length; i++) {
            temp+=rate[i]+" ; ";
            }
        }
        temp=temp.equals("")?" /ocinka vidsytnay)":"/"+temp;
        return String.format("%s (skipping: %d)%s", name,skipping,temp);
    }
}
