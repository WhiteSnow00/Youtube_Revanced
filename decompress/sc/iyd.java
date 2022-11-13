// 
// Decompiled by Procyon v0.6.0
// 

public final class iyd
{
    public final boolean a;
    public final int b;
    public final int c;
    public int d;
    private final tmx e;
    
    public iyd(final tmx e, final vai vai, final vai vai2, final vai vai3) {
        this.e = e;
        final boolean f = vai.f(45357559L);
        boolean a;
        final boolean b = a = true;
        if (!f) {
            a = b;
            if (!vai2.cF()) {
                a = (vai3.aW() && b);
            }
        }
        this.a = a;
        final int g = afwm.G(vai.h(45357558L));
        this.b = g;
        final int g2 = afwm.G(vai.h(45357557L));
        this.c = g2;
        if (!a && (g != 0 || g2 != 0)) {
            e.d().R().L((asjr)iqm.q).p().am(new ixr(this, 9));
        }
    }
    
    public static void b(final Throwable t) {
        ttr.d("Failed to update WatchStorageSchema for DTTS Edu triggers.", t);
    }
    
    public final void a() {
        teu.m(this.e.b((aezf)iny.u), (tes)ieq.u);
    }
}
