import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public enum gux
{
    a("PUSH", 0), 
    b("POP", 1);
    
    private static final gux[] c;
    
    private gux(final String s, final int n) {
    }
    
    static Optional a(final int n) {
        Optional optional;
        if (n >= 0 && n < values().length) {
            optional = Optional.of((Object)values()[n]);
        }
        else {
            optional = Optional.empty();
        }
        return optional;
    }
}
