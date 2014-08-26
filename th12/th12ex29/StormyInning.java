class BaseballException extends RuntimeException {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
// Doesn’t actually have to throw anything 
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    } // Throws no checked exceptions
}

class StormException extends RuntimeException {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    public StormyInning()
            throws RainedOut, BaseballException {
    }

    public StormyInning(String s)
            throws Foul, BaseballException {
    }

    public void walk() throws PopFoul {
    } //Compile error

    public void rainHard() throws RainedOut {
    }

    public void event() {
    }

    public void atBat() throws PopFoul {
    }

    public static void main(String[] args) {
        StormyInning si = new StormyInning();
        si.atBat();
    }
}