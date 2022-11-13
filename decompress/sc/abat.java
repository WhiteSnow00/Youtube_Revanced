import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abat implements abas
{
    public final abap a;
    public final Map b;
    private final vdr c;
    private final zmf d;
    
    public abat(final abap a, final vdr c, final zmf d, final Map b) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    private final void c(final String s, final Runnable runnable) {
        this.c.a(this.d.c()).f(s).v((asjs)new aada(7)).j(alxh.class).ac((asjm)new tod(this, runnable, 16));
    }
    
    @Override
    public final void a(final String s) {
        if (s == null) {
            return;
        }
        this.c(s, afwb.a);
    }
    
    @Override
    public final void b(final boolean b, final String s) {
        if (!b) {
            this.a.g(s, false);
            return;
        }
        if (s != null) {
            this.c(s, new aaxb(this, s, 2));
        }
    }
}
