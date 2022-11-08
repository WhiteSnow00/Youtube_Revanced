import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aayw implements aayv
{
    public final aays a;
    public final Map b;
    private final vbq c;
    private final zki d;
    
    public aayw(final aays a, final vbq c, final zki d, final Map b) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    private final void c(final String s, final Runnable runnable) {
        this.c.a(this.d.c()).f(s).v((asjd)new aawc(4)).j((Class)alvd.class).ac((asix)new uqp(this, runnable, 11));
    }
    
    public final void a(final String s) {
        if (s == null) {
            return;
        }
        this.c(s, afua.a);
    }
    
    public final void b(final boolean b, final String s) {
        if (!b) {
            this.a.g(s, false);
            return;
        }
        if (s != null) {
            this.c(s, (Runnable)new aban(this, s, 1));
        }
    }
}
