package jp.ac.uryukyu.ie.e175720;

public class Enemy extends LivingThing{

    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        int HP  = getHitPoint();
        HP -= damage;
        setHitPoint(HP);
        if( HP < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}