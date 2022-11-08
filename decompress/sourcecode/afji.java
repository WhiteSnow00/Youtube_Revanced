import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afji extends afjg
{
    public afji(final afjp afjp) {
        super(afjp);
    }
    
    public static afji o(final String s) {
        return new afji(afkn.d(s));
    }
    
    public static afji p(final String s) {
        return new afji(aflc.c.a(s));
    }
    
    public static afji q() {
        return new afji(afkn.d(afkn.g().b((Class)afji.class)));
    }
    
    public final afjf n(final Level level) {
        final boolean k = ((afig)this).k(level);
        afkn.n(((afig)this).i(), level, k);
        if (!k) {
            return (afjf)afji.b;
        }
        return (afjf)new afjh(this, level);
    }
}
