package jp.ac.uryukyu.ie.e175720;

public class Hero extends LivingThing {

    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        int HP  = getHitPoint();
        HP -= damage;
        setHitPoint(HP);
        if( HP < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}