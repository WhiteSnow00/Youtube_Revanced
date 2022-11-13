import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afli extends aflg
{
    public afli(final aflp aflp) {
        super(aflp);
    }
    
    public static afli o(final String s) {
        return new afli(afmn.d(s));
    }
    
    public static afli p(final String s) {
        return new afli(afnc.c.a(s));
    }
    
    public static afli q() {
        return new afli(afmn.d(afmn.g().b((Class)afli.class)));
    }
    
    public final /* bridge */ afkz a(final Level level) {
        return (afkz)this.n(level);
    }
    
    public final aflf n(final Level level) {
        final boolean k = ((afkg)this).k(level);
        afmn.n(((afkg)this).i(), level, k);
        if (!k) {
            return (aflf)afli.b;
        }
        return (aflf)new aflh(this, level);
    }
}
