// this keyword

public class Box {
    private int l,b,h;
    public void setDimention(int l, int b, int h){
        this.l=l; this.b=b; this.h=h;
    }
    class giftTaker {
        public void acceptGift(Box b){

        }
    }
    public void sendBox(){
        giftTaker gt = new giftTaker();
        gt.acceptGift(this);
    }

    public static void main(String[] args) {
        Box b1=new Box();
        b1.setDimention(0, 0, 0);
        b1.sendBox();
    }
}
