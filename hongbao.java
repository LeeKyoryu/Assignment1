import java.util.Scanner;
import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class hongbao {
  //保留两位实在是不会弄了
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    System.out.print("请输入总金额：");
    int zenbu=input.nextInt();
    System.out.print("请输入红包数量：");
    int suuryou=input.nextInt();
    //BigDecimal b = new BigDecimal(zenbu);
    //double f1=b.setScale(3,RoundingMode.HALF_UP).doubleValue();
    double f1=zenbu;
    double f2=0;

    for (int i=0; i<suuryou; i++,f1-=f2) {
      if (i==suuryou-1)
        System.out.println("恭喜"+(i+1)+"号玩家获得"+f1+"元奖励！");
      else {
        f2=(double)(Math.random()*f1);
        //BigDecimal c = new BigDecimal(f2);
        //f2=b.setScale(3,RoundingMode.HALF_UP).doubleValue();
        System.out.println("恭喜"+(i+1)+"号玩家获得"+f2+"元奖励！");
      }
    }
  }
}
