public class hello2<T> {
    private T i;
    public void setData(T k){
        i=k;
    }
    public T getData(){
        return i;
    }
    public static void main(String[] args) {
        Integer m=9;
        hello2<Integer> m1=new hello2<Integer>();
        hello2<String> m2=new hello2<String>();
        hello2<Double> m3=new hello2<Double>();
        m1.setData(m);
        m2.setData("krishna");
        m3.setData(2.333);
        System.out.println("m1= "+m1.getData()+" m2= "+m2.getData()+" m3= "+m3.getData());
    }
}
