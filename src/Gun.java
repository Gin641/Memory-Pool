import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int bulletCount = 11;
    public void fireInPool(){
        BulletPool pool = new BulletPool();
        List<Bullet> list = new ArrayList<>();
        for (int i =0;i < bulletCount;i++){
            Bullet p = pool.newItem();
            p.setPosition(0);
            list.add(p);
            for (int j = 0; j < list.size(); j++){
                Bullet pp = list.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if (pp.getPosition() == 10){
                    list.remove(pp);
                }
            }
            System.out.println();
        }
    }
}
