package org.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;


public class Shaymin extends Pokemon {


    class Facade extends PhysicalMove {
        public Facade() {
            super(Type.NORMAL, 70, 100);
        }
    }

    class SweetKiss extends StatusMove {
        public SweetKiss() {
            super(Type.FAIRY, 0, 75);
        }
    }

    class SeedFlare extends SpecialMove {
        public SeedFlare() {
            super(Type.GRASS, 120, 85);
        }
    }

    class Growth extends StatusMove {
        public Growth() {
            super(Type.NORMAL, 0, 0);
        }
    }

    public Shaymin(String name, int level) {
        super(name, level);
        this.setStats(100, 100, 100, 100, 100, 100);
        this.setType(Type.GRASS);
        this.setMove(new Facade(), new SweetKiss(), new SeedFlare(), new Growth());
    }
}

