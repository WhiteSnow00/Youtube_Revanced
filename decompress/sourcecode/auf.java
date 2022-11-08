// 
// Decompiled by Procyon v0.6.0
// 

public enum auf
{
    ON_ANY("ON_ANY", 6), 
    ON_CREATE("ON_CREATE", 0), 
    ON_DESTROY("ON_DESTROY", 5), 
    ON_PAUSE("ON_PAUSE", 3), 
    ON_RESUME("ON_RESUME", 2), 
    ON_START("ON_START", 1), 
    ON_STOP("ON_STOP", 4);
    
    private auf(final String s, final int n) {
    }
    
    public static auf a(final aug aug) {
        final aug a = aug.a;
        final int ordinal = aug.ordinal();
        if (ordinal == 2) {
            return auf.ON_DESTROY;
        }
        if (ordinal == 3) {
            return auf.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return auf.ON_PAUSE;
    }
    
    public static auf b(final aug aug) {
        final aug a = aug.a;
        final int ordinal = aug.ordinal();
        if (ordinal == 1) {
            return auf.ON_CREATE;
        }
        if (ordinal == 2) {
            return auf.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return auf.ON_RESUME;
    }
    
    public static auf c(final aug aug) {
        final aug a = aug.a;
        final int ordinal = aug.ordinal();
        if (ordinal == 2) {
            return auf.ON_CREATE;
        }
        if (ordinal == 3) {
            return auf.ON_START;
        }
        if (ordinal != 4) {
            return null;
        }
        return auf.ON_RESUME;
    }
    
    public aug d() {
        final aug a = aug.a;
        final int ordinal = this.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return aug.e;
                }
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return aug.c;
                    }
                    if (ordinal == 5) {
                        return aug.a;
                    }
                    new StringBuilder().append(this);
                    throw new IllegalArgumentException(this.toString().concat(" has no target state"));
                }
            }
            return aug.d;
        }
        return aug.c;
    }
}
