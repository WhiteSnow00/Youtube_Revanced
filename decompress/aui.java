// 
// Decompiled by Procyon v0.6.0
// 

public enum aui
{
    private static final aui[] $VALUES;
    
    ON_ANY("ON_ANY", 6), 
    ON_CREATE("ON_CREATE", 0), 
    ON_DESTROY("ON_DESTROY", 5), 
    ON_PAUSE("ON_PAUSE", 3), 
    ON_RESUME("ON_RESUME", 2), 
    ON_START("ON_START", 1), 
    ON_STOP("ON_STOP", 4);
    
    static {
        $VALUES = e();
    }
    
    private aui(final String s, final int n) {
    }
    
    public static aui a(final auj auj) {
        final auj a = auj.a;
        final int ordinal = auj.ordinal();
        if (ordinal == 2) {
            return aui.ON_DESTROY;
        }
        if (ordinal == 3) {
            return aui.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return aui.ON_PAUSE;
    }
    
    public static aui b(final auj auj) {
        final auj a = auj.a;
        final int ordinal = auj.ordinal();
        if (ordinal == 1) {
            return aui.ON_CREATE;
        }
        if (ordinal == 2) {
            return aui.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return aui.ON_RESUME;
    }
    
    public static aui c(final auj auj) {
        final auj a = auj.a;
        final int ordinal = auj.ordinal();
        if (ordinal == 2) {
            return aui.ON_CREATE;
        }
        if (ordinal == 3) {
            return aui.ON_START;
        }
        if (ordinal != 4) {
            return null;
        }
        return aui.ON_RESUME;
    }
    
    private static aui[] e() {
        return new aui[] { aui.ON_CREATE, aui.ON_START, aui.ON_RESUME, aui.ON_PAUSE, aui.ON_STOP, aui.ON_DESTROY, aui.ON_ANY };
    }
    
    public auj d() {
        final auj a = auj.a;
        final int ordinal = this.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return auj.e;
                }
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return auj.c;
                    }
                    if (ordinal == 5) {
                        return auj.a;
                    }
                    new StringBuilder().append(this);
                    throw new IllegalArgumentException(this.toString().concat(" has no target state"));
                }
            }
            return auj.d;
        }
        return auj.c;
    }
}
