// 
// Decompiled by Procyon v0.6.0
// 

public final class ajey extends vdj
{
    private final agza a;
    
    private ajey() {
        final ajfb a = ajfb.a;
        throw null;
    }
    
    public ajey(final agza a) {
        this.a = a;
    }
    
    public final void b(final String h) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajfb ajfb = (ajfb)a.instance;
        final ajfb a2 = ajfb.a;
        ajfb.c |= 0x10;
        ajfb.h = h;
    }
    
    public final void c(final String g) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajfb ajfb = (ajfb)a.instance;
        final ajfb a2 = ajfb.a;
        g.getClass();
        ajfb.c |= 0x8;
        ajfb.g = g;
    }
    
    public final void d(final Integer n) {
        final agza a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajfb ajfb = (ajfb)a.instance;
        final ajfb a2 = ajfb.a;
        ajfb.c |= 0x20;
        ajfb.i = intValue;
    }
    
    public final void e(final String e) {
        final agza a = this.a;
        a.copyOnWrite();
        final ajfb ajfb = (ajfb)a.instance;
        final ajfb a2 = ajfb.a;
        e.getClass();
        ajfb.c |= 0x2;
        ajfb.e = e;
    }
    
    public final void f(final Integer n) {
        final agza a = this.a;
        final int intValue = n;
        a.copyOnWrite();
        final ajfb ajfb = (ajfb)a.instance;
        final ajfb a2 = ajfb.a;
        ajfb.c |= 0x4;
        ajfb.f = intValue;
    }
    
    public final ajfa g() {
        return new ajfa((ajfb)this.a.build());
    }
}
