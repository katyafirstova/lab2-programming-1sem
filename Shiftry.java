package org.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;


public class Shiftry extends Pokemon {


    class ShadowBall extends SpecialMove {
        public ShadowBall() {
            super(Type.GHOST, 80, 100);
        }
    }

    class Confide extends StatusMove {
        public Confide() {
            super(Type.NORMAL, 0, 0);
        }
    }

    class LeafBlade extends PhysicalMove {
        public LeafBlade() {
            super(Type.GRASS,90,100);
        }
    }

    class Swagger extends StatusMove {
        public Swagger() {
            super(Type.NORMAL, 0, 85);
        }
    }

    public Shiftry(String name, int level) {
        super(name, level);
        this.setStats(90, 100, 60, 90, 60, 80);
        this.setMove(new ShadowBall(), new Confide(), new LeafBlade(), new Swagger());
    }
}
