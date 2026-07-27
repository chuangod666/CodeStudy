package jichu;

public class GoodsTest {
    public static void main(String[] args) {
        Goods []arr = new Goods[3];
        Goods g1 = new Goods("001","香蕉",10,20);
        Goods g2 = new Goods("002","洗发水",30,10);
        Goods g3 = new Goods("003","方便面",5,100);
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for (int i = 0; i < arr.length; i++) {
            Goods g = arr[i];
            System.out.println(g.getId() + " " + g.getName() + " " + g.getPrice() + " " + g.getCount());
        }
    }
}
