import java.awt.geom.Point2D;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Demo_1_2 {
    public Demo_1_2(){

    }
    public static void Cat(String[] a){
        Out out = new Out(a[a.length-1]);
    }
    public static void main(String[] args){
        int T = Integer.parseInt(args[0]);
        Point2D
    }
}


class Date {
    private  int month;
    private  int day;
    private  int year;

    public Date(int m,int d,int y){
        month = m;
        day = d;
        year = y;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    @Override
    public String toString() {
        return getMonth()+"/"+getDay()+"/"+getYear();
    }
    @Override
    public boolean equals(Object obj) {              //数据类型抽象后重写基本方法用于对新数据类型的处理
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass()!=obj.getClass()) return false;
        Date that = (Date)obj;
        if (this.getMonth()!=that.getMonth()) return false;
        if (this.getDay()!=that.getDay()) return false;
        if (this.getYear()!=that.getYear()) return false;
        return true;
    }
}