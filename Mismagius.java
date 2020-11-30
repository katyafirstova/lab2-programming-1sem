package org.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;


public class Mismagius extends Pokemon {


    class Psywave extends SpecialMove {
        public Psywave() {
            super(Type.PSYCHIC, 0, 100);
        }

        @Override
        protected String describe() {
            return "нападает";
        }

    }

    class Swagger extends StatusMove {
        public Swagger() {

            super(Type.NORMAL, 0, 85);
        }

        @Override
        protected String describe() {
            return "говорит привет";
        }
    }

    class DazzlingGleam extends SpecialMove {
        public DazzlingGleam() {

            super(Type.FAIRY, 80, 100);
        }

        @Override
        protected String describe() {
            return "отчисляется";
        }
    }

    class MagicalLeaf extends SpecialMove {
        public MagicalLeaf() {
            super(Type.GRASS, 60, 0);
        }

        @Override
        protected String describe() {
            return "ударяет";
        }
    }

    public Mismagius(String name, int level) {
        super(name, level);
        this.setStats(60, 60, 60, 105, 105, 105);
        this.setType(Type.GHOST);
        this.setMove(new Psywave(), new Swagger(), new DazzlingGleam(), new MagicalLeaf());
    }
}


